package com.learning.spring.business;

/**
 * Student DTO Object
 */
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
}
