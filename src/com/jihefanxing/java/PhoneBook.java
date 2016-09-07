package com.jihefanxing.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
	
	/*static Map<String, Phone> phones = new HashMap<>();
	//static List<Phone>phones=new ArrayList<>();
	Scanner input=new Scanner(System.in);
	

	//添加电话信息
	public static boolean add(Phone phone) {
		phones.put(phone.name,phone);
		phones.put(phone.phone,phone);
		
		return true;
	}
	
	
	//搜索相关信息（可以通过用户名，电话来搜索）
	public static Phone search(String args){
		return phones.get(args);
	}
		
	
	//删除
	public static void remove(String args) {
		Phone phone=search(args);
		if (phone!=null) {
			phones.remove(phone.name);
			phones.remove(phone.phone);
		}
	}
	//改
	public static void updata(Phone phone) {
		add(phone);
	}
	*/
	
	//static Map<String, Phone> phones = new HashMap<>();
	static List<Phone>phones=new ArrayList<>();
	Scanner input=new Scanner(System.in);
	

	//添加电话信息
	public static boolean add(Phone phone) {
	
		return phones.add(phone);
		
		
	}
	
	
	//搜索相关信息（可以通过用户名，电话来搜索）
	public static Phone search(String args){
		//return phones.get(args);
		if (args==null||"".equals(args)) {
			return null;
		}for (int i = 0; i < PhoneBook.phones.size(); i++) {
			if (args.equals(PhoneBook.phones.get(i).name)||args.equals(PhoneBook.phones.get(i).phone)) {
				return PhoneBook.phones.get(i);
			}
		}
		return null;
	}
		
	
	//删除
	public static void remove(String args) {
		phones.remove(search(args));
	}
	//改
	public static boolean updata(Phone phone) {
		Phone temp=search(phone.phone);
		if (temp==null) {
			temp=search(phone.name);
			if (temp!=null) {
				temp.name=phone.name;
				temp.phone=phone.phone;
				temp.email=phone.email;
				temp.address=phone.address;
				return true;
			}
			
			return false;
		}
				return false;
	}
		
}
