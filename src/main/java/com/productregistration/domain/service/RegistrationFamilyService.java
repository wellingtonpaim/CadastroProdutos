package com.productregistration.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.productregistration.domain.exception.EntityInUseException;
import com.productregistration.domain.exception.FamilyNotFoundException;
import com.productregistration.domain.model.Family;
import com.productregistration.domain.repository.FamilyRepository;

@Service
public class RegistrationFamilyService {
	
		private static final String MSG_FAMILY_IN_USE 
		= "Code family %d cannot be removed as it is in use";
	
	@Autowired
	private FamilyRepository familyRepository;
	
	public Family save(Family family) {
		return familyRepository.save(family);
	}
	
	public void delete(Long familyId) {
		try {
			familyRepository.deleteById(familyId);
			
		} catch (EmptyResultDataAccessException e) {
			throw new FamilyNotFoundException(familyId);
			
		} catch (DataIntegrityViolationException e) {
			throw new EntityInUseException(
				String.format(MSG_FAMILY_IN_USE, familyId));
		}
	}
	
	public Family searchOrFail(Long familyId) {
		return familyRepository.findById(familyId)
				.orElseThrow(() -> new FamilyNotFoundException(familyId));
	}

}
