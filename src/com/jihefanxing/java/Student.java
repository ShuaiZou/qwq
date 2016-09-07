package com.jihefanxing.java;

import java.util.Collections;



/*public class Student<T> {//T只能指定类的类型
	
	private T sex;

	public T getSex() {
		return sex;
	}

	public void setSex(T sex) {
		this.sex = sex;
	}
	
	
}*/

public class Student implements Comparable<Student> {//T只能指定类的类型
	
	public int age;
	public String name;
	
	public Student(int age,String name){
		this.age=age;
		this.name=name;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.age>o.age) {
			return 1;
		}
		return -1;
	}
	
	}
	
