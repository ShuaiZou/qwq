package com.zouzuoye.java;

import java.util.Scanner;

public class Zuoye14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("��������Ҫ��ѯ�ĳɼ���");
		int grade=input.nextInt();
		switch (grade/10) {
		case 10: case 9:
			System.out.println("��ϲ�����ĳɼ�Ϊ���㣡");
			break;
		case 8:
			System.out.println("���ĳɼ�Ϊ���ã�");
			break;
		case 6: case 7:
			System.out.println("���ĳɼ�Ϊ����");
			break;
		case 5 : case 4: case 3: case 2: case 1: case 0:
			System.out.println("���ź������ĳɼ�������");
			break;
		

		default:
			break;
		}
	}

}
