package test1;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import test1.DianHuaBenDao;
import test1.Phone;

public class Main {

	/**
	 * ��ӡ��ʾ��Ϣ
	 */
	private static void outInfo(){
		System.out.println("******************************");
		System.out.println("********   1.��ӵ绰      *******");
		System.out.println("********   2.ɾ���绰      *******");
		System.out.println("********   3.�޸ĵ绰      *******");
		System.out.println("********   4.��ѯ�绰      *******");
		System.out.println("********  ����exit�˳�     *******");
		System.out.println("******************************");
	}
	
	/**
	 * ��ӡ��ѯ�绰��ʾ��Ϣ
	 */
	private static void outQueryWhereInfo(){
		System.out.println("******************************");
		System.out.println("********   1.������ѯ      *******");
		System.out.println("********   2.�绰��ѯ      *******");
		System.out.println("********   3.ID��ѯ         *******");
		System.out.println("********   4.ȫ���ѯ      *******");
		System.out.println("********   exit������һ�� *****");
		System.out.println("******************************");
	}

	static Scanner scanner = new Scanner(System.in);
	static String temp = "";
	static DianHuaBenDao dianHuaBenDao = new DianHuaBenDao();
	public static void main(String[] args) {
		try {
			while (true) {
				outInfo();
				temp = scanner.next();
				if ("exit".equalsIgnoreCase(temp)) {
					break;
				}
				if ("1".equals(temp)) {
					if (addPhone()) {
						System.out.println("����ɹ�");
					}else{
						System.out.println("����ʧ��");
					}
				}else if("2".equals(temp)){

				}else if("3".equals(temp)){

				}else if("4".equals(temp)){
					query();
				}else{
					System.out.println("�޷�ʶ��,������������Ϣ��");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void query() throws SQLException{
		while(true){
			outQueryWhereInfo();
			temp = scanner.next();
			if ("exit".equalsIgnoreCase(temp)) {
				break;
			}
			if ("4".equals(temp)) {
				allQuery();
			}else if("1".equals(temp)){
				temp = scanner.next();
				whereQuery("select * from phone where name='"+temp+"'");
			}else if("2".equals(temp)){
				temp = scanner.next();
				whereQuery("select * from phone where phone='"+temp+"'");
			}else if("3".equals(temp)){
				temp = scanner.next();
				whereQuery("select * from phone where id=1");
			}else {
				System.out.println("�޷�ʶ��,������������Ϣ��");
			}
		}
		
	}
	
	/**
	 * ������ѯ
	 * @throws SQLException
	 */
	public static void whereQuery(String tempPhone) throws SQLException{
		List<Phone> phoneList = dianHuaBenDao.query(tempPhone);
		System.out.println("ID\t����\t�绰");
		for (Phone phone : phoneList) {
			System.out.println(phone.getId()+"\t"+phone.getName()+"\t"+phone.getPhone());
		}
	}
	
	/**
	 * ȫ���ѯ
	 * @throws SQLException
	 */
	public static void allQuery() throws SQLException{
		List<Phone> phoneList = dianHuaBenDao.query("select * from phone");
		System.out.println("ID\t����\t�绰");
		for (Phone phone : phoneList) {
			System.out.println(phone.getId()+"\t"+phone.getName()+"\t"+phone.getPhone());
		}
	}
	
	
	/**
	 * ��ӵ绰
	 * @return
	 * @throws SQLException
	 */
	public static boolean addPhone() throws SQLException{

		System.out.println("������绰��Ϣ-->���� �绰(ps:���� \",\"�ָ�)");
		String[] phones = null;
		while(true){
			temp = scanner.next();
			phones = temp.split(",");
			if (phones.length == 2) {
				break;
			}
			System.out.println("������Ϣ����,����������:");
		}

		Phone phone = new Phone();
		phone.setName(phones[0]);
		phone.setPhone(phones[1]);
		return dianHuaBenDao.add(phone);
	}

}
