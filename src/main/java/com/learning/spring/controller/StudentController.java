package com.learning.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.spring.business.Student;
import com.learning.spring.service.StudentService;

/**
 * Controller Class to perform the CRUD methods static list data
 */
@RestController
public class StudentController {
	
	@Autowired 
	StudentService studentService;
	
	/**
	 * Method to get all the Students
	 * @return List
	 */
	@GetMapping("students")
	public List<Student> findAll(){
		
		return studentService.findAll();
	}
	
	/**
	 * Method to get the Student by ID
	 * @param id
	 * @return Student
	 */
	@GetMapping("student/{id}")
	public Student findById(@PathVariable("id") long id){
		
		return studentService.findById(id);
	}
	
	/**
	 * Method to create or update the new Student
	 * @param student
	 * @return Student
	 */
	@PostMapping("student")
	public String save(@RequestBody Student student) {
		
		return studentService.save(student);
	}
	
	/**
	 * Method to delete the Student
	 * @param id
	 */
	@DeleteMapping("student")
	public Student deleteById(@RequestParam("id") long id) {
		
		return studentService.deleteById(id);
	}
	
}
