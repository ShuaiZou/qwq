package com.zou4.java;

public class Math {
	
	public static int chufa(int a,int b)throws ChushuweilingException,Exception {
		
		if (b==0) {
			throw new ChushuweilingException("��ĸ����Ϊ0");
		}
		return a/b;
	}
}
