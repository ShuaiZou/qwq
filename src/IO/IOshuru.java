package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class IOshuru {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*InputStream in=null;
		OutputStream out=null;*/
		/*File srcFile=new File("C:\\�½��ļ���\\MFGSTAT.zip");
		try {
			//�����������ļ�
			byte []b=new byte[1024];
			
		
			//System.out.println("createNewFile:"+srcFile.createNewFile());
			String FileName=srcFile.getName();
			//System.out.println("delete:"+srcFile.delete());
			in=new FileInputStream(srcFile);
			
			out=new FileOutputStream(new File("C:"+File.separator+"�½��ļ���")+File.separator+"abcd.zip");
			//����
			Thread.sleep(6000);
			int temp=0;
			while ((temp=in.read(b))!=-1) {
				out.write(b, 0, temp);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
			in.close();
			out.close();
			
			//ɾ���ļ�
			//File srcFile=new File("C:\\�½��ļ���\\MFGSTAT.zip");
			System.out.println("delete:"+srcFile.delete());
		}*/
		//File srcFile=new File("C:\\�½��ļ���\\abc.txt");
		
		
		/**
		 * �ۼ�
		 */
		/*try {
			out=new FileOutputStream(new File("C:\\�½��ļ���\\abc.txt"),true);
			out.write("abc\r\n".getBytes());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			out.close();
		}*/
		
		InputStream in=System.in;
		
		Scanner scanner=new Scanner("C:\\�½��ļ���\\MFGSTAT.zip");
		System.out.println();
		
		
	}

}
