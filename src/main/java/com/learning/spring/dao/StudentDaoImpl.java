package com.learning.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.learning.spring.business.Student;

/**
 * Repository for the Static Data.
 */
@Repository
@SuppressWarnings("serial")
public class StudentDaoImpl implements StudentDao {
	
	
	
	//## Static List of Students
	
	List<Student> studentList = new ArrayList<>() 
									{
									 	{
											add(new Student(1, "John", 50, 60, 80));
											add(new Student(2, "Doe", 70, 65, 90));
											add(new Student(3, "Albert", 40, 70, 85));
										}
									};
	
	
	/**
	 * Method to get all the Students
	 * @return List
	 */
	@Override
	public List<Student> findAll() {
		return studentList;
	}
	
	/**
	 * Method to get the Student by ID
	 * @param id
	 * @return Student
	 */
	@Override
	public Student findById(long id) {
		
		for(Student student : studentList) {
			if(student.getId() == id)
				return student;
		}
		
		return null;
	}
	
	/**
	 * Method to create or update the new Student
	 * @param student
	 * @return Student
	 */
	@Override
	public String save(Student student) {
		
		boolean isCreate = false;
		
		if( deleteById(student.getId()) == null )
			isCreate = true;
		
		studentList.add(student);
		
		if(isCreate)
			return "create";
		else
			return "update";
			
	}
	
	/**
	 * Method to delete the Student
	 * @param id
	 */
	@Override
	public Student deleteById(long id) {
		
		for(Student student : studentList) {
			
			if(student.getId() == id)
			{
				studentList.remove(student);
				return student;
			}
			
		}
		
		return null;
	}

}
