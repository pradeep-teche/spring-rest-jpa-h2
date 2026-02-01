package com.learning.spring.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Student Repository to Support the CRUD operations
 */
@Repository 
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{
	
	/**
	 * Method to find the Students by ID or Name
	 * @param id
	 * @param Name
	 * @return List
	 */
	List<StudentEntity> findByIdOrName(int id, String Name);
	
 }
 
	