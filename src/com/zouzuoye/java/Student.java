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
			System.out.println("ѧ��������Ц��");
		}
		public void out() {
			System.out.println("����Ϊ��"+this.name+",�Ա�Ϊ��"+this.sex+",����Ϊ��"+this.age+",ѧ��Ϊ��"+this.num);
		}
}
