package com.net;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClisentSocket {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket=new Socket("192.168.203.20",8089);//ip��ַ������ӿ�
		PrintStream print=new PrintStream(socket.getOutputStream());
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������Ϣ��");
		print.print(scanner.nextLine());
		print.close();
		socket.close();
		scanner.close();
	}

}
