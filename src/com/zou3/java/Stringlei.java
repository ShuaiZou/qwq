package com.zou3.java;

public class Stringlei {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ��ϰ1��ȥ���м�ո�ת�ɴ�д
		 */
		String str = "afds jly Fjkp";
		String str1 = str.replaceAll(" ", "");  //�á����滻�� ��
		System.out.println(str1.toUpperCase());
		/**
		 * ��ϰ2�����ַ������Ÿĳ���������
		 */
		String str2 = "abc,efd,yui";
		String[] strArray = null;
		strArray = str2.split(","); 
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]+" ");
			
		}
		/**
		 * �ж��Ƿ������ַ�����ef��
		 */
		System.out.println(str2.contains("ef"));
		/**
		 * ��ϰ3����һ���ַ����н�ȡ�ַ�����sdf��
		 */
		String str3="iuewrfsdfhiw";
		System.out.println(str3.substring(6,9));
		/**
		 * ��ϰ4���ж������ַ����Ƿ����
		 */
		String a = "abd"; 
		String b="fsdfew";
		System.out.println(a.equals(b));
		/**
		 * ��ϰ5���ж��ǲ��ǿ��ַ���
		 */
		String  c= "fsd";
		System.out.println(c.isEmpty());
		/**
		 * ��ϰ6������ĳ���ַ��������ַ������м���ĳ�ַ�
		 */
		String d = "�����й��ˣ��Ұ����Լ�";
		for (int i = 0; i < d.length(); i++) {
			System.out.println();
		}
		int count=0;int start=0;
		while( start!=d.length()){//
			int index = d.indexOf("��",start);//���û�ҵ�����ֵ-1��
			if (index!=-1) {
				count++;
				start=index+1;
			}else{
			break;
		}
		}	
		System.out.println(count);
	}}
