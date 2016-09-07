package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOTest {
	static OutputStream out=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			out=new FileOutputStream(new File("C:\\新建文件夹\\abc.txt")) ;
			out.write("今天奥运会".getBytes("GBK"));
				
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
