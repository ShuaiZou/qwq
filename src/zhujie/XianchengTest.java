package zhujie;

public class XianchengTest {

	public static void main(String[] args) throws IllegalThreadStateException{
		// TODO Auto-generated method stub
		//创建线程方法1
		/*System.out.println("主线程");
		Xiancheng xiancheng=new Xiancheng();
		//调用run和调用start方法，调用run只是单纯调用普通方法，只有调用start方法才是启动一个线程
		xiancheng.start();
		System.out.println("主线程执行完毕");
	//	xiancheng.run();
	//	XianchengTest.run();
	}
	public static void run() {
		System.out.println("主线程的run方法");
	}
*/
		//创建线程方法2
		System.out.println("主线程");
		S s=new S();
		Xiancheng xiancheng=new Xiancheng(s);
		Thread thread=new Thread(xiancheng);
		thread.start();
		thread.setName("线程1");
		
		
		
		//多线程
		Xiancheng xiancheng1=new Xiancheng(s);
		Thread thread1=new Thread(xiancheng1);
		thread1.start();
		thread1.setName("线程2");
		
		
		
		Xiancheng xiancheng2=new Xiancheng(s);
		Thread thread2=new Thread(xiancheng2);
		thread2.start();
		thread2.setName("线程3");
		
		Xiancheng xiancheng3=new Xiancheng(s);
		Thread thread3=new Thread(xiancheng3);
		thread3.start();
		thread3.setName("线程4");
		
		Xiancheng xiancheng4=new Xiancheng(s);
		Thread thread4=new Thread(xiancheng4);
		thread4.start();
		thread4.setName("线程5");
		
	}
	
}
