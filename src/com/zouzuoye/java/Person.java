package com.zouzuoye.java;

public class Person extends Animal {
		public String sex;
		public int age;
		
		public Person() {
			
		}
		public Person(String name,String sex,int age) {
			super(name);
			this.sex=sex;
			this.age=age;
		}
		@Override
		public void shout() {
		// TODO Auto-generated method stub
			System.out.println("������Ĭ��Ц��");
		}
		public void out() {
			System.out.println("����Ϊ��"+this.name+",�Ա�Ϊ��"+this.sex+",����Ϊ��"+this.age);
		}
}
