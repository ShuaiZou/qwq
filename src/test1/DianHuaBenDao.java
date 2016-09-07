package test1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test1.Phone;

/**
 * �־ò�
 * �����ݿ����
 * @author ��������
 *
 */
public class DianHuaBenDao {
	
	static Connection conn = null;
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver") ; 
			//��ȡ����
			String url = "jdbc:mysql://120.76.155.46:3306/test"
					+ "?useUnicode=true&characterEncoding=UTF-8";
			String userName = "root";
			String password = "";
			conn = java.sql.DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//��ӵ绰
	public boolean add(Phone phone) throws SQLException{
		PreparedStatement prepareStatement = conn.prepareStatement("insert into phone(name,phone) values(?,?)");
		prepareStatement.setString(1, phone.getName());
		prepareStatement.setString(2, phone.getPhone());
		int size = prepareStatement.executeUpdate();
		if (size == 0) {
			return false;
		}
		prepareStatement.close();
		return true;
	}
	
	//ɾ��
	public boolean del(Phone phone) throws SQLException{
		PreparedStatement prepareStatement = conn.prepareStatement("delete from phone where name=? or phone=?");
		prepareStatement.setString(1, phone.getName());
		prepareStatement.setString(2, phone.getPhone());
		int size = prepareStatement.executeUpdate();
		if (size == 0) {
			return false;
		}
		prepareStatement.close();
		return true;
	}
	
	//�޸�
	public boolean update(Phone phone) throws SQLException{
		PreparedStatement prepareStatement = conn.prepareStatement("update phone set name=?,phone=?,address=?,email=? where id=?");
		prepareStatement.setString(1, phone.getName());
		prepareStatement.setString(2, phone.getPhone());
		prepareStatement.setInt(5, phone.getId());
		int size = prepareStatement.executeUpdate();
		if (size == 0) {
			return false;
		}
		prepareStatement.close();
		return true;
	}
	
	//��ѯ
	public List<Phone> query(String sql) throws SQLException{
		PreparedStatement prepareStatement = conn.
				prepareStatement(sql);
		ResultSet result = prepareStatement.executeQuery();
		List<Phone> phones = new ArrayList<>();
		Phone temp = null;
		while(result.next()){
			temp = new Phone();
			temp.setId(result.getInt("id"));
			temp.setName(result.getString("name"));
			temp.setPhone(result.getString("phone"));
			phones.add(temp);
		}
		prepareStatement.close();
		return phones;
	}
	
}
