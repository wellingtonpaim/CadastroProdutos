package com.productregistration.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.productregistration.domain.exception.EntityInUseException;
import com.productregistration.domain.exception.ProductNotFoundException;
import com.productregistration.domain.model.Family;
import com.productregistration.domain.model.Product;
import com.productregistration.domain.repository.ProductRepository;

@Service
public class RegistrationProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private RegistrationFamilyService registrationFamily;
	
	private static final String MSG_PRODUCT_IN_USE 
	= "Code product %d cannot be removed as it is in use";
	
	
	public Product save(Product product) {
		Long familyId = product.getFamily().getId();
		
		Family family = registrationFamily.searchOrFail(familyId);
		
		product.setFamily(family);
		
		return productRepository.save(product);
	}
	
	public Product searchOrFail(Long productId) {
		return productRepository.findById(productId)
				.orElseThrow(() -> new ProductNotFoundException(productId));
	}
	
	public void delete(Long productId) {
		try {
			productRepository.deleteById(productId);
			
		} catch (EmptyResultDataAccessException e) {
			throw new ProductNotFoundException(productId);
			
		} catch (DataIntegrityViolationException e) {
			throw new EntityInUseException(
				String.format(MSG_PRODUCT_IN_USE, productId));
		}
	}
	
}