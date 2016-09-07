package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
	
	
	
	
	private final static File file=new File("C:\\新建文件夹\\abc.txt");
	
	//添加电话信息
	public static boolean add(Phone phone) throws IOException {
		OutputStream out=null;
		PrintStream printStream=null;
		try {
			out=new FileOutputStream(file,true);
			printStream=new PrintStream(out);
			printStream.print("\r\n"+phone.name+"\t"+phone.phone+"\t"+phone.email);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
			
		}finally {
			out.close();
			printStream.close();
		}
		
		
	}
	
	
	//搜索相关信息（可以通过用户名，电话来搜索）
	public static Phone search(String args) throws FileNotFoundException{
		Scanner scanner=new Scanner(file);
		
			while (scanner.hasNext()==true) {
				String temp=scanner.nextLine();
			if (scanner.nextLine().contains(args)) {
				String[] s=temp.split("\t");
				return new Phone(s[0], s[1], s[2]);
			}
		}
		
		return null;
	}
		
	
	/*//删除
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
	}*/
		
}
