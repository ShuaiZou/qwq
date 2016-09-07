package com.zou1.java;

public class Student/* extends Person */{

	public String name;
	public int age;
	public String sex;
	
	public static String address="广西河池学院";
	
	public  Student(String name,int age,String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public   void out() {
		System.out.println( " + name + "+name+" + age + "+sex+" + sex + ");
	}
	
	
		
	//Student.address="广东河池学院"；
	/*@Override
	public void Person(int age) {
		// TODO Auto-generated method stub
		super.Person(age);
	}*/
	
}
