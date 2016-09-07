package com.zouzuoye.java;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird=new Bird("小鸟", "红色");
		bird.shout();
		bird.out();
		Dog dog=new Dog("小狗", "公");
		dog.shout();
		dog.out();
		Person person=new Person("张三", "男", 30);
		person.shout();
		person.out();
		Student student=new Student("小敏", "女", 16, 7758);
		student.shout();
		student.out();
	}

}
