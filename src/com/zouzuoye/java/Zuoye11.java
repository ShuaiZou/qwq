package com.zouzuoye.java;

import java.util.Scanner;

public class Zuoye11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入数据n:");
		int n=input.nextInt();
		int n1=1;int n2=1;
		int sum=0;
		if (n<=0) {
			System.out.println("输入数字有误！");
			return;
		}else if (n==1||n==2) {
			sum=1;
		}else  {
			for (int i = 3; i <=n; i++) {
				sum=n1+n2;
				n1=n2;
				n2=sum;
			}
		}
		System.out.println(sum);
	}

}
