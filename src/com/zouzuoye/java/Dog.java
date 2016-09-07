package com.zouzuoye.java;

public class Dog extends Animal {
	public String sex;
	
	public Dog() {
		
	}
	public Dog(String name,String sex) {
		super(name);
		this.sex=sex;
	}
	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("狗汪汪的叫！");
	}
	public void out() {
		System.out.println("姓名为："+this.name+",性别为："+this.sex);
	}
}
