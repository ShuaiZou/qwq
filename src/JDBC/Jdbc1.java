package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Jdbc1 {
	public static void main(String [] args){
		try {
			//加载Mysql的驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取链接
			String url = "jdbc:mysql://120.76.155.46:3306/test?useUnicode=true&characterEncoding=UTF-8";
			String userName = "test";
			String password = "test";
			Connection conn = java.sql.DriverManager.getConnection(url, userName, password);
			/*conn.setAutoCommit(true);
			
			//PreparedStatement statement = conn.prepareStatement("select*from t_user where id =? and user_name=? and password=? and create_time=?");
			PreparedStatement statement = conn.prepareStatement("insert into t_user(user_name,sex)values(?,?)");
			statement.setString(1,"Miss");
			statement.setString(2, "女");
			System.out.println(statement.executeUpdate());*/
			
			Statement statement = conn.createStatement();
			for (int i = 0; i < 100; i++) {
				statement.addBatch("insert into t_user(name) values ('哈撒给')");
				
			}
			int b[]=statement.executeBatch();
			//statement.addBatch("insert into t_user(user_name) values ('a')");
		//	statement.addBatch("delete from t_user where ");
			//statement.addBatch("insert into t_user(user_name)values ('c')");
			
			//创建对话
//			Statement statement = connection.createStatement();
			//executeUpdate()可以传入增、删、改
//			boolean b =statement.execute("insert into t_user(user_name,password,sex)value('神坑','187','男')");
//			System.out.println(b);
			
			//executeQuery()做查询
//			ResultSet b = statement.executeQuery("select*from t_user");
//			ResultSetMetaData meta = b.getMetaData();
//			for (int i = 1; i <= meta.getColumnCount(); i++) {
//				System.out.println(meta.getColumnName(i));
//			}
//			List<List<Object>> list = new ArrayList<>();
//			while () {
//				
//				
//			}
//			
			
			
//			ResultSet b = statement.executeQuery("select*from t_user");
//			while (b.next()) {
//				int id = b.getInt("id");
//				String user = b.getString("user_name");
//				String passwordCopy = b.getString("password");
//				String sex = b.getString("sex");
//				String create_time = b.getString("create_time");
//				System.out.println("id="+id+",user="+user+",passwordCopy="+passwordCopy+",sex="+sex+",create_time="+create_time);
//			}
			
			//关闭资源
			conn.close();
		} catch (Exception e) {
			System.out.println("驱动加载失败");
			e.printStackTrace();
		}
	}
}
