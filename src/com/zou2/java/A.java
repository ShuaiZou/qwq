package com.zou2.java;

public class A {
	public static int x=8;
	public int temp;
	public void caishuzi (int x,int temp) {
		 if(temp-x==0){
				System.out.println("��ʾ����ϲ�㣬�¶���");
			}else if (temp-x>=5||temp-x<=-5) {
			System.out.println("��ʾ��̫���̫С��");
		}else if (temp-x<5||temp-x>-5) {
			System.out.println("��ʾ���е�С��");
		}
	}
}
