package data;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Phone phone=new Phone("张三","122345", "123@163.com");
		PhoneBook.add(phone);
		System.out.println(PhoneBook.search("张三"));
	}

}
