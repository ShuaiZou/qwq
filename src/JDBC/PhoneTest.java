package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
			
		try {
			//加载mysql的驱动类
			Class.forName("com.mysql.jdbc.Driver");
			
			//获取链接
			String url="jdbc:mysql://120.76.155.46:3306/test?userUnicode=//true&characterEncoding=UTF-8";
			String userName="test";
			String password="test";
			Connection conn=java.sql.DriverManager.getConnection(url, userName, password);
			PreparedStatement statement=conn.prepareStatement("select *from t_user");
			//增
			boolean a=statement.execute("insert into PHONE(phone,name,emails,address) values('7758','邹','173@163.com','宝安区')");
			System.out.println(a);
		//删
			boolean c=statement.execute("delete from PHONE where address='宝安 '");
			System.out.println(c);
			//改
			boolean b=statement.execute("update PHONE set phone='1234'  where name='邹'");
//			boolean c=statement.execute("update PHONE set password='2234' where id=36");
//			boolean d=statement.execute("update PHONE set sex='女' where id=36");
			System.out.println(b);
			int e=statement.executeUpdate("update PHONE set phone='1234'  where name='常'");
			ResultSet f=statement.executeQuery("select *from PHONE");
//			while (f.next()) {
//				String user=f.getInt("id");
//			}
			System.out.println(f);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("找不到驱动程序类，加载驱动失败：");
			e.printStackTrace();
		}
		
	}
	public void add() {
		
	}
}
