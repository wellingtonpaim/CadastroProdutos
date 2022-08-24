package com.productregistration.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productregistration.domain.model.Family;

@Repository
public interface FamilyRepository extends JpaRepository<Family, Long> {
	
}