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
		System.out.println("�������ĽУ�");
	}
	public void out() {
		System.out.println("����Ϊ��"+this.name+",�Ա�Ϊ��"+this.sex);
	}
}
