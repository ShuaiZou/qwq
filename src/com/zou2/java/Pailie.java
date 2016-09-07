package com.zou2.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Pailie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int a[ ]=new int[5];
		for (int i = 0; i <a.length; i++) {
			System.out.println("请输入第"+(i+1)+"个数字:");
			a[i]=input.nextInt();
		}
		/*Arrays.sort(a);
		for (int i = 0; i <a.length; i++) {
			
				System.out.print(a[i]);}*/
		for (int i = 1; i <= a.length; i++) {
			for (int j = 0; j < 5-i; j++) {
				if (a[j]>a[j+1]) {
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("按照从小到大顺序排列：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
}
