package com.zou2.java;

public class Yuan {
	public double r;//Բ�İ뾶
	
	public Yuan() {
		
	}
	public Yuan(double r) {
		this.r=r;
	}
	/**
	 * Բ�����
	 */
	public double mianji() {
		return  Math.PI*r*r;
	}
	/**
	 * Բ���ܳ�
	 */
	public double zhouchang() {
		return 2*Math.PI*r;
		
	}
	
}
