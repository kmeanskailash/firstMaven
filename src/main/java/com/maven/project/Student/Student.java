package com.maven.project.Student;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public @Data class Student {
	
	private int marks;
	private String name;
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	

}
