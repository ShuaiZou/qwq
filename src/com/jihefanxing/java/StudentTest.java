package com.jihefanxing.java;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Student<String> student=new Student();
		student.setSex("ÄĞ");*/
		
		/*String sex=student.getSex();
		System.out.println(sex);*/
		
		StudentImpl student1=new StudentImpl();
		student1.eat("Èâ");
		
		StudentImpl<String> student2=new StudentImpl<>();
		student2.eat("Ñ¼");
		
		out(3);
	}
	public static <T> T out(T args) {
		return args;
	}
}
