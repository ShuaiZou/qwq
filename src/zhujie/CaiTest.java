package zhujie;

public class CaiTest {
	
	public static void main(String[] args) {
		Cai cai = new Cai();
		XiaoFeiThread xiaoFeiThread1 = new XiaoFeiThread(cai);
		xiaoFeiThread1.setName("�������߳�1");
		xiaoFeiThread1.start();
		XiaoFeiThread xiaoFeiThread2 = new XiaoFeiThread(cai);
		xiaoFeiThread2.setName("�������߳�2");
		xiaoFeiThread2.start();
		
		ChuShiThread chuShiThread1 = new ChuShiThread(cai);
		chuShiThread1.setName("��ʦ�߳�1");
		chuShiThread1.start();
		ChuShiThread chuShiThread2 = new ChuShiThread(cai);
		chuShiThread2.setName("��ʦ�߳�2");
		chuShiThread2.start();
		
	}
	
}

