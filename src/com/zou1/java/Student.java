package com.zou1.java;

public class Student/* extends Person */{

	public String name;
	public int age;
	public String sex;
	
	public static String address="�����ӳ�ѧԺ";
	
	public  Student(String name,int age,String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public   void out() {
		System.out.println( " + name + "+name+" + age + "+sex+" + sex + ");
	}
	
	
		
	//Student.address="�㶫�ӳ�ѧԺ"��
	/*@Override
	public void Person(int age) {
		// TODO Auto-generated method stub
		super.Person(age);
	}*/
	
}
