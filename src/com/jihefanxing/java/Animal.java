package com.jihefanxing.java;



public interface Animal<T> {
//public interface Animal<T extends String> {//表示T类型是String类的子类
		public void eat(T food);
}
