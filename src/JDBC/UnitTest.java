package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import org.junit.Before;

public class UnitTest {
/*
	//最先执行  初化
	@Before
	public void fs(){
		System.out.println("before");
	}
	*/
	
	//单元测试代码
	/*
	@org.junit.Test
	public void out1(){
		System.out.println("out1");
	}
    */
	
	//最后执行  关闭资源
	/*
	@org.junit.After
	public void after(){
		System.out.println("after");
	}
	*/
	//单元测试代码
	@org.junit.Test
	public void out() throws SQLException{
		Connection conn =null;
		Statement statement = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				//获取链接
				//处理乱码
				String url = "jdbc:mysql://127.0.0.1:3306/sys?useUnicode=true&characterEncoding=UTF-8";
				//String url = "jdbc:mysql://120.76.155.46:3306/test";
				String userName = "root";
				String passWord = "";
				conn = java.sql.DriverManager.getConnection(url,userName,passWord);
				//创建会话
				statement = conn.createStatement();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		System.out.println("**************");
		System.out.println("*****1.添加*****");
		System.out.println("*****2.删除*****");
		System.out.println("*****3.修改*****");
		System.out.println("*****4.查询*****");
		System.out.println("**************");
		Scanner input =new Scanner(System.in);
		System.out.println("请选择操作方式：");
		int a = input.nextInt();
		switch (a) {
		case 1:
			//添加数据
			for (int i = 0; i < 3; i++) {
				statement.addBatch("insert into zou(id,name,sex,age,address) values ('1','小雨','女',19,'中国')");
				statement.addBatch("insert into zou(id,name,sex,age,address) values ('2','蜡笔小新','男',20,'上海')");
			}
			int[] b = statement.executeBatch();	
			break;
		case 2:
			//删除数据
			statement.addBatch("delete from zou where name='小雨'");
			statement.addBatch("delete from zou where name='蜡笔小新'");
			int[] d = statement.executeBatch();
			break;
		case 3:
			//修改数据
			statement.addBatch("update zou set id='15' where name= '蜡笔小新'");
			statement.addBatch("update zou set id='16' where name= '小雨'");
			int[] f = statement.executeBatch();
			break;
		case 4:
			//查询数据
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