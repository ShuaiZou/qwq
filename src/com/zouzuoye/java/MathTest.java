package com.zouzuoye.java;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math math=new Math();
		System.out.println("两个数之和："+math.add(2, 3));
		System.out.println("三个数之和："+math.add(3, 4, 5));
		System.out.println("两个数之积："+math.ji(2, 3));
		System.out.println("三个数之积："+math.ji(2, 3, 4));
		System.out.println("两个数之幂："+math.mi2(2));
		System.out.println("三个数之幂："+math.mi3(2));
	}

}
