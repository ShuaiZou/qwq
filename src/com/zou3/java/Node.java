package com.zou3.java;

public class Node {

	//ÿ���ڵ�������
	private String data;
	//��һ���ڵ�
	private Node next;
	public void setData(String data){
		this.data = data;
	}
	public String getData(){
		return this.data;
	}
	public void addNext(Node next){
		this.next = next;
	}
	public Node getNext(){
		return this.next;
	}
}

