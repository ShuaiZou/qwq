package com.zouzuoye.java;

public class Zuoye21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Have you ate?";
		System.out.println(str.toUpperCase());//×ª´óÐ´
		String str2="";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)>=96) {
				str2+=(char)(str.charAt(i)-32);
			}
			if (str.charAt(i)<96) {
				//str2=str.charAt(i);
			}
		}System.out.println(str2);
	}

}
