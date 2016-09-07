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
			System.out.println("人类幽默的笑！");
		}
		public void out() {
			System.out.println("姓名为："+this.name+",性别为："+this.sex+",年龄为："+this.age);
		}
}
