package com.learning.spring.dao;

import java.util.List;

import com.learning.spring.business.Student;

/**
 * DAO with method declaration
 */
public interface StudentDao {
	
	List<Student> findAll();
	Student findById(long id);
	String save(Student student);
	Student deleteById(long id);

}
