package com.zou1.java;

public class ChangfangtiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Changfangti changfangti=new Changfangti();
		changfangti.setH(5);
		changfangti.setL(3);
		changfangti.setW(4);
		System.out.println("表面积："+changfangti.biaomianji());
		System.out.println("体积："+changfangti.tiji());
		System.out.println("周长："+changfangti.zhouchang());
	}

}
