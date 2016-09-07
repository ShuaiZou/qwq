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
		System.out.println("Äñß´ß´ÔûÔûµÄ½Ğ£¡");
	}
	public void out() {
		System.out.println("ĞÕÃûÎª£º"+this.name+",³á°òÑÕÉ«Îª£º"+this.chibang);
	}
}
