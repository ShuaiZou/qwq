package com.zouzuoye.java;

import java.util.Scanner;

public class Zuoye14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你要查询的成绩：");
		int grade=input.nextInt();
		switch (grade/10) {
		case 10: case 9:
			System.out.println("恭喜，您的成绩为优秀！");
			break;
		case 8:
			System.out.println("您的成绩为良好！");
			break;
		case 6: case 7:
			System.out.println("您的成绩为及格！");
			break;
		case 5 : case 4: case 3: case 2: case 1: case 0:
			System.out.println("很遗憾，您的成绩不及格！");
			break;
		

		default:
			break;
		}
	}

}
