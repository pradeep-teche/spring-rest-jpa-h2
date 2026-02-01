package com.learning.spring.dao.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Student Entity Class to support JPA
 */
@Data
@Entity
@Table(name = "STUDENT")
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "MARK1")
	private int mark1;
	
	@Column(name = "MARK2")
	private int mark2;
	
	@Column(name = "MARK3")
	private int mark3;
	
	@Column(name = "TOTAL")
	private long total;
	
	@Column(name = "GRADE")
	private String grade;
	
}
