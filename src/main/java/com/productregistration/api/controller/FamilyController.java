package com.productregistration.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.productregistration.domain.model.Family;
import com.productregistration.domain.repository.FamilyRepository;
import com.productregistration.domain.service.RegistrationFamilyService;

@RestController
@RequestMapping(value = "/families")
public class FamilyController {
	
	@Autowired
	private FamilyRepository familyRepository;
	
	@Autowired
	private RegistrationFamilyService registrationFamily;
	
	@GetMapping
	public List<Family> list() {
		return familyRepository.findAll();
	}
	
	@GetMapping("/{familyId}")
	public Family search(@PathVariable Long familyId) {
		return registrationFamily.searchOrFail(familyId);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Family add(@RequestBody @Valid Family family) {
		return registrationFamily.save(family);
	}
	
	@PutMapping("/{familyId}")
	public Family update(@PathVariable Long familyId,
			@RequestBody Family family) {
		Family currentFamily = registrationFamily.searchOrFail(familyId);
		
			BeanUtils.copyProperties(family, currentFamily, "id");
			
			return registrationFamily.save(currentFamily);							
	}
	
	@DeleteMapping("/{familyId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long familyId) {
			registrationFamily.delete(familyId);
					
	}
	
}


