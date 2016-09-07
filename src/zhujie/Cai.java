package zhujie;

public class Cai {

	private int caiCount = 0;
	
	/**
	 * ��ʦ��һ�ݲ�
	 */
	public void addCai(){
		synchronized (this) {
			try {
				Thread.sleep((int) java.lang.Math.random()*2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (caiCount >= 10) {
				caiCount=10;
				try {
					//���������߳�
					notifyAll();
					//ʹ��ǰ�̵߳ȴ�
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"->> ��ǰ�˵�����:"+caiCount);
			caiCount++;
		}
	}
	
	/**
	 *����һ�ݲ�
	 */
	public void subCai(){
		synchronized (this) {
			try {
				Thread.sleep((int)java.lang.Math.random()*2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (caiCount <2) {
				if (caiCount<0) {
					caiCount=0;
				}
				try {
					//���������߳�
					notifyAll();
					//ʹ��ǰ�̵߳ȴ�
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			caiCount--;
			System.out.println(Thread.currentThread().getName()+"->> ��ǰ�˵�����:"+caiCount);
		}
	}
	
	
}

