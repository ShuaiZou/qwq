package com.zou1.java;

public class Changfangti {
	private int l;
	private int w;
	private int h;
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int tiji() {
		return h*l*w;
		
	}
	public int biaomianji() {
		return 2*h*l+2*h*w+2*w*l;
		
	}
	public int zhouchang() {
		return 4*(h+w+l);
		
	}
	
}
