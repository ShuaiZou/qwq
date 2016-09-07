package com.zouzuoye.java;

public class Zuoye22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 字符串中提取数字
		 */
		String str = "q23w4e5rt3y7";
		String str2=" ";
		for(int i=0;i<str.length();i++){
		if(str.charAt(i)>=48 && str.charAt(i)<=57){
		str2+=str.charAt(i);
		}}
		System.out.println(str2);
	}

}
