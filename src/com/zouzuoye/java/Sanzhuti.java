package com.zouzuoye.java;

public class Sanzhuti extends Sanjiaoxing {
	public double h;
	
	public Sanzhuti() {
		
	}
	public Sanzhuti(double p,double h) {
		super(p);
		this.h=h;
	}
	@Override
	public double mianji() {
		// TODO Auto-generated method stub
		return super.mianji()*2+p*h*3;
	}
	public double tiji() {
		return super.mianji()*h;
		
	}
}
