package com.jihefanxing.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		/*Map<String, Phone>phones=new HashMap<>();
		phones.put("张三", new Phone("123456789", "张三", "1234567@qq.com", "地球"));
		phones.put("1236859474", new Phone("1236859474", "张三", "1236859474@163.com", "地球"));
		System.out.println("请输入搜索信息：");
		String temp=input.nextLine();
		Phone phone = phones.get(temp);
		if (phone == null) {
			System.out.println("没有找到你想要的信息");
			}else{
			System.out.println(phone);
		}
*/		
		Phone phone1=new Phone("213456789", "张三", "1234567@qq.com", "地球");
		Phone phone2=new Phone("353456789", "张四", "1234567@qq.com", "地球");
		Phone phone3=new Phone("783456789", "张五", "1234567@qq.com", "地球");
		PhoneBook.add(phone1);
		PhoneBook.add(phone2);
		PhoneBook.add(phone3);
		System.out.println(phone1);
		/////r (Map.Entry<String, Phone>phone :Phhonese)ee. 			
		
		System.out.println(PhoneBook.search("213456789"));
		//PhoneBook.remove("张五");
		phone3.address="深圳宝安";
		PhoneBook.updata(phone3);System.out.println(phone3);
		System.out.println(PhoneBook.search("张五"));
		//System.out.println(phone3);
		
		/*Map<String, String>map=new HashMap<String,String>();
		map.put("a", "aa");
		map.put("a", "bb");
		System.out.println(map);*/
	}

}
