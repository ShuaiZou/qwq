package com.zou.java;

public class Stu {
	public String name;//姓名
	public int age;//年龄
	public String sex;//性别
	public int num;//学号
	
	public Stu(){
		
	}
	public Stu (String name,int age,String sex,int num) {
		System.out.println("姓名："+name+"，性别："+sex+"，学号："+num);
	}
	 public void eat() {
		System.out.println("给我来个鸡腿 外加一个鸭蛋");
	}
	public void dajia(int x,int y) {
		if (x<y) {
			System.out.println("甲打架胜利");
		}else if (x==y) {
			System.out.println("丙打架胜利");
		}
		else {
			System.out.println("乙打架胜利");
		}
		
		
	}
	@Override
	public String toString() {
		return "Stu [name=" + name + ", age=" + age + ", sex=" + sex + ", num=" + num + "]";
	}
	
	
}
