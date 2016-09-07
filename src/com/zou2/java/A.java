package com.zou2.java;

public class A {
	public static int x=8;
	public int temp;
	public void caishuzi (int x,int temp) {
		 if(temp-x==0){
				System.out.println("提示：恭喜你，猜对了");
			}else if (temp-x>=5||temp-x<=-5) {
			System.out.println("提示：太大或太小了");
		}else if (temp-x<5||temp-x>-5) {
			System.out.println("提示：有点小了");
		}
	}
}
