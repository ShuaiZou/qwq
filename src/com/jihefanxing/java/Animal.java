package com.jihefanxing.java;



public interface Animal<T> {
//public interface Animal<T extends String> {//��ʾT������String�������
		public void eat(T food);
}
