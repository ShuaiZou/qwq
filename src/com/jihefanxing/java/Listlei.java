package com.jihefanxing.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Listlei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������������20����������ż����ӡ����
		List<Integer>list=new ArrayList<>();
		Random random=new Random();
		for (int i = 0; i < 20; i++) {
			//System.out.println(list.get(i));//ȡ
			int a=random.nextInt(100);
			list.add(a);
			
		}
		
		System.out.println("�����20������"+list);
		System.out.print("����ż��Ϊ��");
		for (int i = 0; i < 20; i++) {
			if (list.get(i)%2==0) {
				int b=list.get(i);
				System.out.print(b+",");
				}
		}
		
		
		//list����
		/*List<Integer> list=new ArrayList<>();
		Random random=new Random();
		for (int i = 0; i < 12; i++) {
			//System.out.println(list.get(i));//ȡ
			int a=random.nextInt(100);
			list.add(a);
		}
		System.out.println("����ǰ��"+list);
		for (int i = 0; i <list.size(); i++) {
			System.out.print(list.get(i)+",");//ȡ
			
		}
		//list.sort(null);
		Collections.sort(list);
		System.out.println("�����"+list);*/
		
		/*List<Student> students=new ArrayList<>();
		students.add(new Student(2, "a") );
		students.add(new Student(3, "b") );
		for (int i = 0; i < students.size(); i++) {
			System.out.print(students.get(i)+",");
		}
		Map<String, Student>map=new HashMap<>();
		map.put("��1", new Student(5, "����"));
		map.put("��2", new Student(6, "��5"));
		for (String key : map.keySet()) {
			System.out.println("key= "+ key + " and value= " + map.get(key));
		}*/
		
		/*Map<String, Student>map=new HashMap<>();
		for (Map.Entry<String, Student>temp : map.entrySet()) {
			System.out.println(temp.getKey()+","+temp.getValue().name);      //Map����
		}*/
		//list.get(i)������str1.compareTo
		/*String str1="c";
		String str2="b";
		List<String>list2=new ArrayList<>();
		list2.add(str1);
		list2.add(str2);
		Collections.sort(list2);
		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i)+",");
		}
		System.out.println(str1.compareTo(str2));*/
	}

}
