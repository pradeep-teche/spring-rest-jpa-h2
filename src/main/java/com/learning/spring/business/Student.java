package com.learning.spring.business;

import lombok.Getter;
import lombok.Setter;


/**
 * Student DTO Object
 */
@Getter
@Setter
public class Student {
	
	private long id;
	private String name;
	private int mark1;
	private int mark2;
	private int mark3;
	private long total;
	private String grade;
	
	/**
	 * Default Constructor
	 */
	public Student() {
		
	}
	
	/**
	 * Parameterized Constructor
	 * @param id
	 * @param name
	 * @param mark1
	 * @param mark2
	 * @param mark3
	 */
	public Student(long id, String name, int mark1, int mark2, int mark3) {
		super();
		this.id = id;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", ");
		if (name != null) {
			builder.append("name=");
			builder.append(name);
			builder.append(", ");
		}
		builder.append("mark1=");
		builder.append(mark1);
		builder.append(", mark2=");
		builder.append(mark2);
		builder.append(", mark3=");
		builder.append(mark3);
		builder.append(", total=");
		builder.append(total);
		builder.append(", ");
		if (grade != null) {
			builder.append("grade=");
			builder.append(grade);
		}
		builder.append("]");
		return builder.toString();
	}
	
}
