package com.zouzuoye.java;

public class Bird extends Animal {
	public String chibang;
	
	public Bird() {
		
	}
	public Bird(String name,String chibang) {
		// TODO Auto-generated constructor stub
		super(name);
		this.chibang=chibang;
	}
	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("��ߴߴ�����ĽУ�");
	}
	public void out() {
		System.out.println("����Ϊ��"+this.name+",�����ɫΪ��"+this.chibang);
	}
}
