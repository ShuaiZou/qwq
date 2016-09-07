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
			throw new ZDYyichangException(" 输入年龄有误，不能小于0！");
		}else{
		this.age = age;
	}
	}
	
}
