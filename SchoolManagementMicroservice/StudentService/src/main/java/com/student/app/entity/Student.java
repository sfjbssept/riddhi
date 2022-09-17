package com.student.app.entity;


public class Student {
	
	private String name;
	private String classname;
	
	public Student(String name, String classname) {
		super();
		this.name = name;
		this.classname = classname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
}
