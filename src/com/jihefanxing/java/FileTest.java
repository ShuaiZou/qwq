package com.jihefanxing.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try {
			File file=new File("C:\\student\\day9");
			//System.out.println(file.exists());//��ʾ�ļ��Ƿ����
			if (file.exists()) {
				System.out.println();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		/**
		 * File�ഴ��20���ļ��У�ÿ���ļ�������20��Ŀ¼
		 *//*
		try {
			File root=new File("C:\\�½��ļ���");
			if (!root.exists()) {
				root.mkdir();
			}
			for (int i = 0; i < 20; i++) {
				File temp=new File(root, "dir"+i);
				temp.mkdir();
				for (int j = 0; j < 20; j++) {
					new File(temp,"fire"+j+".txt").createNewFile();
				}
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		try {
			InputStream inputStream=new FileInputStream(new File("C:\\�½��ļ���")) ;
			byte[]temp=new byte[1024];
			int index=0;
			int context=0;
			while ((context=inputStream.read()) !=-1) {
				temp[index]=(byte) context;
				index++;
				
			}
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
