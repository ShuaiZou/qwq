package zhujie;

public class XianchengTest {

	public static void main(String[] args) throws IllegalThreadStateException{
		// TODO Auto-generated method stub
		//�����̷߳���1
		/*System.out.println("���߳�");
		Xiancheng xiancheng=new Xiancheng();
		//����run�͵���start����������runֻ�ǵ���������ͨ������ֻ�е���start������������һ���߳�
		xiancheng.start();
		System.out.println("���߳�ִ�����");
	//	xiancheng.run();
	//	XianchengTest.run();
	}
	public static void run() {
		System.out.println("���̵߳�run����");
	}
*/
		//�����̷߳���2
		System.out.println("���߳�");
		S s=new S();
		Xiancheng xiancheng=new Xiancheng(s);
		Thread thread=new Thread(xiancheng);
		thread.start();
		thread.setName("�߳�1");
		
		
		
		//���߳�
		Xiancheng xiancheng1=new Xiancheng(s);
		Thread thread1=new Thread(xiancheng1);
		thread1.start();
		thread1.setName("�߳�2");
		
		
		
		Xiancheng xiancheng2=new Xiancheng(s);
		Thread thread2=new Thread(xiancheng2);
		thread2.start();
		thread2.setName("�߳�3");
		
		Xiancheng xiancheng3=new Xiancheng(s);
		Thread thread3=new Thread(xiancheng3);
		thread3.start();
		thread3.setName("�߳�4");
		
		Xiancheng xiancheng4=new Xiancheng(s);
		Thread thread4=new Thread(xiancheng4);
		thread4.start();
		thread4.setName("�߳�5");
		
	}
	
}
