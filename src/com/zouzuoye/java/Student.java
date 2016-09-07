package com.zouzuoye.java;

public class Student extends Person {
		public int num;
		public Student() {
			
		}
		public Student(String name,String sex,int age,int num) {
			super(name, sex, age);
			this.num=num;
		}
		@Override
		public void shout() {
		// TODO Auto-generated method stub
			System.out.println("学生哈哈大笑！");
		}
		public void out() {
			System.out.println("姓名为："+this.name+",性别为："+this.sex+",年龄为："+this.age+",学号为："+this.num);
		}
}
