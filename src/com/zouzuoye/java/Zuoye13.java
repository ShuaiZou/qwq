package com.zouzuoye.java;

public class Zuoye13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=1;long sum=0;
		for (int i = 2; i <=100; i++) {
			
				n=n*i;
				sum=sum+n;
		}
		System.out.println("1到100阶乘的和为："+(sum+1));
	}

}
