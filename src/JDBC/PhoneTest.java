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
			//����mysql��������
			Class.forName("com.mysql.jdbc.Driver");
			
			//��ȡ����
			String url="jdbc:mysql://120.76.155.46:3306/test?userUnicode=//true&characterEncoding=UTF-8";
			String userName="test";
			String password="test";
			Connection conn=java.sql.DriverManager.getConnection(url, userName, password);
			PreparedStatement statement=conn.prepareStatement("select *from t_user");
			//��
			boolean a=statement.execute("insert into PHONE(phone,name,emails,address) values('7758','��','173@163.com','������')");
			System.out.println(a);
		//ɾ
			boolean c=statement.execute("delete from PHONE where address='���� '");
			System.out.println(c);
			//��
			boolean b=statement.execute("update PHONE set phone='1234'  where name='��'");
//			boolean c=statement.execute("update PHONE set password='2234' where id=36");
//			boolean d=statement.execute("update PHONE set sex='Ů' where id=36");
			System.out.println(b);
			int e=statement.executeUpdate("update PHONE set phone='1234'  where name='��'");
			ResultSet f=statement.executeQuery("select *from PHONE");
//			while (f.next()) {
//				String user=f.getInt("id");
//			}
			System.out.println(f);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�Ҳ������������࣬��������ʧ�ܣ�");
			e.printStackTrace();
		}
		
	}
	public void add() {
		
	}
}
