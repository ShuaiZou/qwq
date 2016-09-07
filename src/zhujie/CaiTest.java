package zhujie;

public class CaiTest {
	
	public static void main(String[] args) {
		Cai cai = new Cai();
		XiaoFeiThread xiaoFeiThread1 = new XiaoFeiThread(cai);
		xiaoFeiThread1.setName("消费者线程1");
		xiaoFeiThread1.start();
		XiaoFeiThread xiaoFeiThread2 = new XiaoFeiThread(cai);
		xiaoFeiThread2.setName("消费者线程2");
		xiaoFeiThread2.start();
		
		ChuShiThread chuShiThread1 = new ChuShiThread(cai);
		chuShiThread1.setName("厨师线程1");
		chuShiThread1.start();
		ChuShiThread chuShiThread2 = new ChuShiThread(cai);
		chuShiThread2.setName("厨师线程2");
		chuShiThread2.start();
		
	}
	
}

