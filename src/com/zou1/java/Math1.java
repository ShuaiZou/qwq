package com.zou1.java;

public class Math1 {
	
	public static int add(int x,int y){
		return x+y;
		
	}
	public static int  jian(int x,int y) {
		return x-y;
		
	}
	public static int ji(int x,int y) {
		return x*y;
		
	}
	public static Object  chu(int x,int y) {
		if (y==0) {
			return "输入有误，除数不能为0";
		}else{
		return x/y;}
		
	}
}
