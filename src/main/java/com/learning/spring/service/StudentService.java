package com.learning.spring.service;

import java.util.List;

import com.learning.spring.business.Student;

/**
 * Student Static Service
 */
public interface StudentService {
	
	List<Student> findAll();
	Student findById(long id);
	String save(Student student);
	Student deleteById(long id);

}
