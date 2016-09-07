package com.zou.java;

public class StuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu stu1=new Stu("张三", 21, "男", 1);
		Stu stu2=new Stu("李四", 22, "女", 2);
		Stu stu3=new Stu("王五", 23, "男", 3);
		Stu stu=new Stu();
		stu.name="zhangsan";
		stu.age=21;
		stu.sex="男";
		stu.num=4;
		stu1.dajia(6, 3);
		stu2.dajia(5, 5);
		stu3.dajia(7, 8);
		stu1.eat();
		System.out.println(stu.name);
		System.out.println(stu);
	}

}
