package com.zou4.java;

public class Student1 {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age<0) {
			throw new ZDYyichangException(" �����������󣬲���С��0��");
		}else{
		this.age = age;
	}
	}
	
}
