package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.ResultSetMetaData;

public class Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//����mysql��������
			Class.forName("com.mysql.jdbc.Driver");
			
			//��ȡ����
			String url="jdbc:mysql://120.76.155.46:3306/test?userUnicode=//true&characterEncoding=UTF-8";
			String userName="test";
			String password="test";
			Connection conn=java.sql.DriverManager.getConnection(url, userName, password);
			
			//�����Ự//Ԥ����
			PreparedStatement statement=conn.prepareStatement("select *from t_user where id=? and user_name=? ");
			statement.setInt(1, 1);
			statement.setString(2, "sex");
			statement.executeUpdate();
			//executeUpdate��������ɾ��
			boolean a=statement.execute("insert into PHONE(phone,name,emails,address) values('7758','��','173@163.com','������')");
//			System.out.println(a);
//			int e=statement.executeUpdate("update t_user set user_name='ССT��'  where id=37");
//			boolean b=statement.execute("update t_user set user_name='ССT��'  where id=36");
//			boolean c=statement.execute("update t_user set password='2234' where id=36");
//			boolean d=statement.execute("update t_user set sex='Ů' where id=36");
			ResultSet f=statement.executeQuery("select *from t_user");//executeQuery����ѯ
			//ResultSetMetaData meta=f.getMetaData();
			ResultSetMetaData meta=(ResultSetMetaData) f.getMetaData();
			for (int i = 1; i <= meta.getColumnCount(); i++) {
				System.out.println(meta.getColumnName(i));
			}
			while (f.next()) {
				int id=f.getInt(1);
				String user=f.getString("sex");
				String passwordCopy=f.getString("password");
				String sex=f.getString("sex");
				String create_time=f.getString("create_time");
				System.out.println("id="+id+",user="+user+",passwordCopy="+password+",sex="+sex+",create_time="+create_time);
			}
			//�ر�����
			conn.close();
//			System.out.println(b);
//			System.out.println(c);
//			System.out.println(d);
//			System.out.println(e);
			//System.out.println(f);
			//������
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�Ҳ������������࣬��������ʧ�ܣ�");
			e.printStackTrace();
		}
	}

}
