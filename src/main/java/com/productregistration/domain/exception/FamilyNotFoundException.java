package com.productregistration.domain.exception;


public class FamilyNotFoundException extends EntityNotFoundException{
	
	private static final long serialVersionUID = 1L;

	public FamilyNotFoundException(String message) {
		super(message);
	}
	
	public FamilyNotFoundException(Long familyId) {
		this(String.format("There is no family registration with code %d", familyId));
	}

}
