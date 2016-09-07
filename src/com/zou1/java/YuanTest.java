package com.zou1.java;

import java.security.acl.Permission;

public class YuanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yuan yuan =new Yuan();
		yuan.setR(2.2);
		System.out.println("周长="+yuan.zhouchang());
		System.out.println("面积="+yuan.mianji());
		System.out.println(yuan.getR());
		//Person student=new Student();//多态
	}

}
