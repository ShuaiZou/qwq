package com.zou4.java;

public class Student1Test {

	public static void main(String[] args) throws ZDYyichangException,RuntimeException{
		// TODO Auto-generated method stub
		Student1 student1=new Student1();
		//student1.setAge(-8);
		//System.out.println(student1.getAge());
		
		try {
			student1.setAge(-8);
			System.out.println(student1.getAge());
		} catch (ZDYyichangException e) {
			// TODO: handle exception
			System.out.println("数据出错，年龄不能为负数！");
		}
	}

}
