package com.learning.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.spring.dao.jpa.StudentEntity;
import com.learning.spring.dao.jpa.StudentRepository;

/**
 * Controller Class to perform the CRUD methods using JPA and H2 DB
 */
@RestController
public class StudentJpaController {
	
	@Autowired 
	StudentRepository studentRepository;
	
	/**
	 * Method to get all the Students
	 * @return List
	 */
	@GetMapping("jpa/students")
	public List<StudentEntity> findAll(){
		
		return studentRepository.findAll();
	}
	
	/**
	 * Method to get the Student by ID
	 * @param id
	 * @return StudentEntity
	 */
	@GetMapping("jpa/student/{id}")
	public StudentEntity findById(@PathVariable("id") int id){
		
		Optional<StudentEntity> studentEntityOptional = studentRepository.findById(id);
		
		return studentEntityOptional.isPresent() ? studentEntityOptional.get() : null;
	}
	
	/**
	 * Method to create or update the new Student
	 * @param studentEntity
	 * @return StudentEntity
	 */
	@PostMapping("jpa/student")
	public StudentEntity save(@RequestBody StudentEntity studentEntity) {
		
		return studentRepository.save(studentEntity);
	}
	
	/**
	 * Method to delete the Student
	 * @param id
	 */
	@DeleteMapping("jpa/student")
	public void deleteById(@RequestParam("id") int id) {
		
		studentRepository.deleteById(id);
	}
	
	/**
	 * Method to find the List of Students by ID or Name
	 * @param id
	 * @param name
	 * @return List
	 */
	@GetMapping("jpa/students/{id}/{name}")
	public List<StudentEntity> findByIdOrName(@PathVariable("id") int id, @PathVariable("name") String name){
		
		return studentRepository.findByIdOrName(id, name);
		
		
	}
	
}
