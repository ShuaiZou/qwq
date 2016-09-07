package com.net;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClisentSocket {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket=new Socket("192.168.203.20",8089);//ip地址，连入接口
		PrintStream print=new PrintStream(socket.getOutputStream());
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入信息：");
		print.print(scanner.nextLine());
		print.close();
		socket.close();
		scanner.close();
	}

}
