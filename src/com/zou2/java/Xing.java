package com.zou2.java;

public class Xing {
	public int chang;
	public int kuan;
	
	public Xing () {
		
	}
	/**
	 * ���������
	 * @return
	 */
	public int mianji() {
		return chang*kuan;
	}
	
	public int zhouchang() {
		return (chang+kuan)*2;
	}
	public    Xing(int x,int y) {
		this.chang=x;
		this.kuan=y;
		//System.out.println("���������Ϊ��"+x*y);
	}
}
