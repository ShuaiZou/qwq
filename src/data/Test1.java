package data;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    
		OutputStream out=null;

		PrintStream printStream=null;
		/**
		 * ��ӡ1-100��ż��
		 */
		/*try {
			printStream=new PrintStream("C:\\�½��ļ���\\abc.txt");
			for (int i = 0; i <= 100; i++) {
				if (i%2==0) {
					printStream.print(i+"\t");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			printStream.close();
		}*/
		/**
		 * ��ӡ9*9�˷���
		 */
		try {
			printStream=new PrintStream("C:\\�½��ļ���\\abcd.txt");
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <=i; j++) {
					int a=0;
					a=i*j;
					printStream.print(i+"*"+j+"="+a);
					printStream.print("\t");
					
				}
				printStream.println();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			printStream.close();
		}
	}

}
