package com.zou4.java;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.xml.crypto.Data;

import com.zou.java.Stu;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.name="王二";
		Student student2=new Student();
		student2.name="王二";
		System.out.println(student.equals(student2));
		
		
		
		/*Object student1=new Student();
		Object str=new String();
		System.out.println(str instanceof String);*/
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date(System.currentTimeMillis());
		System.out.println(simpleDateFormat.format(date));
		
		
		try {
			Object student3=new Student();
					String str=(String)student3;//类转换异常
			int x=0/0;
			System.out.println("执行完成！");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("分母不能为0");
		}
	}

		
	
}
