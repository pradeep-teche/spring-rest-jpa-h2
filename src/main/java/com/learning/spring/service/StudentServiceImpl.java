package com.learning.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.spring.business.Student;
import com.learning.spring.dao.StudentDao;


/**
 * Student Service to perform the CRUD operation
 */
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	/**
	 * Method to get all the Students
	 * @return List
	 */
	public List<Student> findAll() {
		
		List<Student> students = studentDao.findAll();
		
		for(Student student : students) {
			
			long total = student.getMark1() + student.getMark2() + student.getMark3();
			student.setTotal(total);
			
			if(student.getMark1() > 50 && student.getMark2() > 50 && student.getMark3() > 50)
				student.setGrade("Pass");
			else
				student.setGrade("Fail");
			
		}
		
		return students;
	}

	/**
	 * Method to get the Student by ID
	 * @param id
	 * @return Student
	 */
	public Student findById(long id) {
		
		Student student = studentDao.findById(id);
		
		if(student != null ) {
			student.setTotal(student.getMark1() + student.getMark2() + student.getMark3());
			
			//Ternary Operator (condition) ? then : else
			student.setGrade(   (student.getMark1() > 50 && student.getMark2() > 50 && student.getMark3() > 50) ? "Pass" : "Fail"   );
		}
		
		return student;
		
	}

	/**
	 * Method to create or update the new Student
	 * @param student
	 * @return Student
	 */
	public String save(Student student) {
		
		student.setTotal(student.getMark1() + student.getMark2() + student.getMark3());
		
		//Ternary Operator (condition) ? then : else
		student.setGrade(   (student.getMark1() > 50 && student.getMark2() > 50 && student.getMark3() > 50)?"Pass":"Fail"   );
		
		
		
		return studentDao.save(student);
	}

	/**
	 * Method to delete the Student
	 * @param id
	 */
	@Override
	public Student deleteById(long id) {
		
		return studentDao.deleteById(id);
		
	}

}
