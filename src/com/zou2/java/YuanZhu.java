package com.zou2.java;

public class YuanZhu extends Yuan {
	public double h;
	
	public YuanZhu () {
		
	}
	public YuanZhu (double r,double h) {
		super(r);
		this.h=h;
	}
	/**
	 * 圆柱体面积
	 */
	@Override
	public double mianji() {
		// TODO Auto-generated method stub
		return 2*Math.PI*r*h+2*Math.PI*r*r;
	}
	/**
	 * 圆柱体体积
	 * @return
	 */
	public double tiji() {
		return super.mianji()*h;
	}
	
}
