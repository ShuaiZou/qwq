package com.zou4.java;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Student {
	
	public String name;
	public int age;
	
	public Student() {
		
	}
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
		
	
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu=(Student)obj;
			if (this.name.equals(stu.name)) {
				return true;
			}return false;
		}return false;
	}
	
	
	
}
