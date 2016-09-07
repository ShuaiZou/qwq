package com.zou4.java;

public class ChushuweilingTest {

	public static void main(String[] args) throws ChushuweilingException, Exception {
		// TODO Auto-generated method stub
		Math  math=new Math();
		//System.out.println(math.chufa(5, 0));
		try {
			System.out.println(math.chufa(5, 1));
		} catch (ChushuweilingException e) {
			// TODO: handle exception
			System.out.println("自定义异常：分母不能为0");
		}
	}

}
