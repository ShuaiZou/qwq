package com.zou2.java;

public class Yuan {
	public double r;//圆的半径
	
	public Yuan() {
		
	}
	public Yuan(double r) {
		this.r=r;
	}
	/**
	 * 圆的面积
	 */
	public double mianji() {
		return  Math.PI*r*r;
	}
	/**
	 * 圆的周长
	 */
	public double zhouchang() {
		return 2*Math.PI*r;
		
	}
	
}
