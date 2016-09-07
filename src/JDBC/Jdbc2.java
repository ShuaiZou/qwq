package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Jdbc2 {
	public static void main(String[] args) {
		 try {
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			//��ȡ����
			String url = "jdbc:mysql://120.76.155.46:3306/test?useUnicode=true&characterEncoding=UTF-8";
			//String url = "jdbc:mysql://120.76.155.46:3306/test";
			String userName = "test";
			String passWord = "test";
			Connection conn = java.sql.DriverManager.getConnection(url,userName,passWord);
			//�����Ự
			Statement statement = conn.createStatement();
			
			//ɾ������
//			statement.addBatch("delete from PHONE where name='С��'");
//			statement.addBatch("delete from PHONE where name='С��'");
//			statement.addBatch("delete from PHONE where name='С�'");
//			statement.executeBatch();
			//�������
			for (int i = 0; i < 5; i++) {
				statement.addBatch("insert into PHONE(phone,name,email,address) values ('1757','С��','1229524765@qq.com','�й�')");
			}
			
			statement.addBatch("insert into PHONE(phone,name,email,address) values ('1234','С��','173276885@qq.com','�й�')");
			statement.addBatch("insert into PHONE(phone,name,email,address) values ('7758','Сޱ','173276885@qq.com','China')");
			statement.executeBatch();
			
			
			//�޸�����
			statement.addBatch("update PHONE set phone='5'  where name='��'");
			statement.executeBatch();
			ResultSet g=statement.executeQuery("select *from PHONE");
			System.out.println(g);
			
			//��ѯ
			ResultSet c = statement.executeQuery("select * from PHONE");
//			ResultSetMetaData meta = c.getMetaData();
//			List<String> columnName =new ArrayList<>();
//			for (int i = 1; i <= meta.getColumnCount(); i++) {
//				columnName.add(meta.getColumnTypeName(i));
//			}
			while (c.next()) {
				String phone =c.getString("phone");
				String name = c.getString("name");
				String email = c.getString("email");
				String address = c.getString("address");
				System.out.println("phone="+phone+",name="
				       +name+",email="+email+",address="+address);	
			}
			conn.close();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

