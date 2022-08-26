package com.productregistration.api.controller;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.util.ReflectionUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.productregistration.Groups;
import com.productregistration.domain.exception.BusinessException;
import com.productregistration.domain.exception.FamilyNotFoundException;
import com.productregistration.domain.model.Product;
import com.productregistration.domain.repository.ProductRepository;
import com.productregistration.domain.service.RegistrationProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private RegistrationProductService registrationProduct;
	
	@GetMapping
	public List<Product> list() {
		return productRepository.findAll();
	}
	
	@GetMapping("/{productId}")
	public Product search(@PathVariable Long productId) {
		return registrationProduct.searchOrFail(productId);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Product add(
			@RequestBody @Validated(Groups.RegistrationProduct.class) Product product) {
		try {
			return registrationProduct.save(product);
		} catch (FamilyNotFoundException e) {
			throw new BusinessException(e.getMessage());
		}
	}
	
	@PutMapping("/{productId}")
	public Product update(@PathVariable Long productId,
			@RequestBody Product product) {
		Product currentProduct = registrationProduct.searchOrFail(productId);
		
		BeanUtils.copyProperties(product, currentProduct, 
				"id", "registrationDate", "family");
		
		try {
			return registrationProduct.save(currentProduct);	
		} catch (FamilyNotFoundException e) {
			throw new BusinessException(e.getMessage());
		}
	}
	
	@PatchMapping("/{productId}")
	public Product partiallyUpdate(@PathVariable Long productId,
			@RequestBody Map<String, Object> fields, HttpServletRequest request) {
		Product currentProduct = registrationProduct.searchOrFail(productId);
		
		merge(fields, currentProduct, request);
		
		return update(productId, currentProduct);
	}

	private void merge(Map<String, Object> sourceData, Product destinationProduct,
			 HttpServletRequest request) {
		ServletServerHttpRequest serverHttpRequest = new ServletServerHttpRequest(request);
		
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, true);
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
			
			Product sourceProduct = objectMapper.convertValue(sourceData, Product.class);
			
			sourceData.forEach((propertyName, propertyValue) -> {
				Field field = ReflectionUtils.findField(Product.class, propertyName);
				field.setAccessible(true);
				
				Object newValue = ReflectionUtils.getField(field, sourceProduct);
									
				ReflectionUtils.setField(field, destinationProduct, newValue);
			});
		} catch (IllegalArgumentException e) {
			Throwable rootCause = ExceptionUtils.getRootCause(e);
			throw new HttpMessageNotReadableException(e.getMessage(), rootCause, serverHttpRequest);
		}
	}
	
	@DeleteMapping("/{productId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long productId) {
			registrationProduct.delete(productId);
					
	}
	
}
