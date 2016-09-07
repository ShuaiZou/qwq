package com.zouzuoye.java;

public class Picture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =1; i<=4; i++) {
			for (int j =7; j >2*i-1; j--) {
				System.out.print(" ");
				//System.out.print("*");
			}
			
			for (int k =1; k <=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
