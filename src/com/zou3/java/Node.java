package com.zou3.java;

public class Node {

	//每个节点存的数据
	private String data;
	//下一个节点
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

