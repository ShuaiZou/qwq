package com.jihefanxing.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		/*Map<String, Phone>phones=new HashMap<>();
		phones.put("����", new Phone("123456789", "����", "1234567@qq.com", "����"));
		phones.put("1236859474", new Phone("1236859474", "����", "1236859474@163.com", "����"));
		System.out.println("������������Ϣ��");
		String temp=input.nextLine();
		Phone phone = phones.get(temp);
		if (phone == null) {
			System.out.println("û���ҵ�����Ҫ����Ϣ");
			}else{
			System.out.println(phone);
		}
*/		
		Phone phone1=new Phone("213456789", "����", "1234567@qq.com", "����");
		Phone phone2=new Phone("353456789", "����", "1234567@qq.com", "����");
		Phone phone3=new Phone("783456789", "����", "1234567@qq.com", "����");
		PhoneBook.add(phone1);
		PhoneBook.add(phone2);
		PhoneBook.add(phone3);
		System.out.println(phone1);
		/////r (Map.Entry<String, Phone>phone :Phhonese)ee. 			
		
		System.out.println(PhoneBook.search("213456789"));
		//PhoneBook.remove("����");
		phone3.address="���ڱ���";
		PhoneBook.updata(phone3);System.out.println(phone3);
		System.out.println(PhoneBook.search("����"));
		//System.out.println(phone3);
		
		/*Map<String, String>map=new HashMap<String,String>();
		map.put("a", "aa");
		map.put("a", "bb");
		System.out.println(map);*/
	}

}
