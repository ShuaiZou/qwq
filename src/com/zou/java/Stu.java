package com.zou.java;

public class Stu {
	public String name;//����
	public int age;//����
	public String sex;//�Ա�
	public int num;//ѧ��
	
	public Stu(){
		
	}
	public Stu (String name,int age,String sex,int num) {
		System.out.println("������"+name+"���Ա�"+sex+"��ѧ�ţ�"+num);
	}
	 public void eat() {
		System.out.println("������������ ���һ��Ѽ��");
	}
	public void dajia(int x,int y) {
		if (x<y) {
			System.out.println("�״��ʤ��");
		}else if (x==y) {
			System.out.println("�����ʤ��");
		}
		else {
			System.out.println("�Ҵ��ʤ��");
		}
		
		
	}
	@Override
	public String toString() {
		return "Stu [name=" + name + ", age=" + age + ", sex=" + sex + ", num=" + num + "]";
	}
	
	
}
