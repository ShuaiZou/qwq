package com.zou3.java;

public class Link {

	public Node head;
	
	public void sort(boolean b) {
		Node curr=head;
		Node currs=null;
		Node temp=null;
		while (curr.getNext()!=null) {
			curr=curr.getNext();
			currs=curr.getNext();
			while (curr.getNext()==null) {
				while (currs.getNext()==null) {
					
				//if (curr.getData()>currs.getData()) {
					temp=curr.getNext();
					currs.addNext(curr);
					curr.addNext(temp);
				}}
				currs=currs.getNext();
			}
			curr=curr.getNext();
		}
	//}
	public void add(String data){
		if(head == null){
			head = new Node();
			head.setData(data);
		}else{
			Node node = new Node();
			node.setData(data);
			Node curr = head;
			while (true) {
				if (curr.getNext() == null) {
					curr.addNext(node);
					break;
				}
				curr = curr.getNext();
			}
		}
	}
	
	public void list(){
		Node curr = head;
		do{
			System.out.print(curr.getData()+",");
			curr = curr.getNext();
		}while (curr != null);
	}
	
	/**
	 * ����ĳ���
	 * @return
	 */
	public int length(){
		if (head == null) {
			return 0;
		}
		int length = 0;
		Node curr = head;
		do{
			length++;
			curr = curr.getNext();
		}while (curr != null);
		return length;
	}
	
	/**
	 * ɾ���ڵ�
	 * @param index
	 * @return
	 */
	public String remove(int index){
		int length = length();
		String str = null;
		//Ҫɾ���ڵ��±겻����������������
		if (index > length || index < 0) {
			return null;
		}
		if (index == 0) {
			Node tempNode = head.getNext();
			head.addNext(null);
			str = head.getData();
			head = tempNode;
			return str;
		}
		int start = index - 1;
		int end = index + 1;
		int temp = -1;
		Node startNode = null;
		Node endNode = null;
		Node curr = head;
		do{
			temp++;
			if (temp == start) {
				startNode = curr;
			}
			if (temp == index) {
				str = curr.getData();
			}
			if (temp == end) {
				endNode = curr;
			}
			curr = curr.getNext();
		}while (curr != null);
		startNode.addNext(endNode);
		return str;
	}
	
	/**
	 * ���ݽڵ��±���ҽڵ��Ӧ������
	 * @param data
	 * @return
	 */
	public String find(int index){
		int length = length();
		//Ҫɾ���ڵ��±겻����������������
		if (index > length || index < 0) {
			return null;
		}
		int temp = -1;
		Node curr = head;
		do{
			temp++;
			if (temp == index) {
				return curr.getData();
			}
			curr = curr.getNext();
		}while (curr != null);
		return null;
	}
	
	
	/**
	 * �������ݲ��ҽڵ��Ӧ���±�
	 * @param data
	 * @return
	 */
	public int find(String data){
		//Ҫɾ���ڵ��±겻����������������
		int temp = -1;
		Node curr = head;
		do{
			temp++;
			if (curr.getData().equals(data)) {
				return temp;
			}
			curr = curr.getNext();
		}while (curr != null);
		return temp;
	}
}
