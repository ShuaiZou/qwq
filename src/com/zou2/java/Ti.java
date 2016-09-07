package com.zou2.java;

public class Ti extends Xing {
	
	public int gao;
	/**
	 * 长方体面积
	 */
	@Override
	public int mianji() {
		// TODO Auto-generated method stub
		return (chang*kuan+chang*gao+kuan*gao)*2;
	}
	/**
	 * 长方体周长
	 */
	@Override
	public int zhouchang() {
		// TODO Auto-generated method stub
		return (chang+kuan+gao)*2;
	}
	/**
	 * 长方体体积
	 * @param x
	 * @param y
	 * @param z
	 */
	private Ti() {
		// TODO Auto-generated method stub

	}
	public  Ti(int x, int y,int z) {
		super(x,y);
		this.gao=z;
		//System.out.println("长方体体积为："+x*y*z);
		
	}
	
	

}
