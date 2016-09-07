package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import org.junit.Before;

public class UnitTest {
/*
	//����ִ��  ����
	@Before
	public void fs(){
		System.out.println("before");
	}
	*/
	
	//��Ԫ���Դ���
	/*
	@org.junit.Test
	public void out1(){
		System.out.println("out1");
	}
    */
	
	//���ִ��  �ر���Դ
	/*
	@org.junit.After
	public void after(){
		System.out.println("after");
	}
	*/
	//��Ԫ���Դ���
	@org.junit.Test
	public void out() throws SQLException{
		Connection conn =null;
		Statement statement = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				//��ȡ����
				//��������
				String url = "jdbc:mysql://127.0.0.1:3306/sys?useUnicode=true&characterEncoding=UTF-8";
				//String url = "jdbc:mysql://120.76.155.46:3306/test";
				String userName = "root";
				String passWord = "";
				conn = java.sql.DriverManager.getConnection(url,userName,passWord);
				//�����Ự
				statement = conn.createStatement();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		System.out.println("**************");
		System.out.println("*****1.���*****");
		System.out.println("*****2.ɾ��*****");
		System.out.println("*****3.�޸�*****");
		System.out.println("*****4.��ѯ*****");
		System.out.println("**************");
		Scanner input =new Scanner(System.in);
		System.out.println("��ѡ�������ʽ��");
		int a = input.nextInt();
		switch (a) {
		case 1:
			//�������
			for (int i = 0; i < 3; i++) {
				statement.addBatch("insert into zou(id,name,sex,age,address) values ('1','С��','Ů',19,'�й�')");
				statement.addBatch("insert into zou(id,name,sex,age,address) values ('2','����С��','��',20,'�Ϻ�')");
			}
			int[] b = statement.executeBatch();	
			break;
		case 2:
			//ɾ������
			statement.addBatch("delete from zou where name='С��'");
			statement.addBatch("delete from zou where name='����С��'");
			int[] d = statement.executeBatch();
			break;
		case 3:
			//�޸�����
			statement.addBatch("update zou set id='15' where name= '����С��'");
			statement.addBatch("update zou set id='16' where name= 'С��'");
			int[] f = statement.executeBatch();
			break;
		case 4:
			//��ѯ����
			ResultSet c = statement.executeQuery("select * from zou");
			while (c.next()) {
				int id = c.getInt("id");
				String name = c.getString("name");
				String sex = c.getString("sex");
				int age = c.getInt("age");
				String address = c.getString("address");
				System.out.println("id="+id+",,name="
				       +name+",sex="+sex+",age="+age+",address="+address);
				
			}
			break;
		default:
			break;
		}
		conn.close();
	}
}