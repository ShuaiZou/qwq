package zhujie;

public class Cai {

	private int caiCount = 0;
	
	/**
	 * 厨师做一份菜
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
					//唤醒其它线程
					notifyAll();
					//使当前线程等待
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"->> 当前菜的数量:"+caiCount);
			caiCount++;
		}
	}
	
	/**
	 *消费一份菜
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
					//唤醒其它线程
					notifyAll();
					//使当前线程等待
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			caiCount--;
			System.out.println(Thread.currentThread().getName()+"->> 当前菜的数量:"+caiCount);
		}
	}
	
	
}

