package zhujie;

//实现线程方法1
/*public class Xiancheng  extends Thread{

	@Override
	
		public void run() {
			System.out.println("线程启动");
		}*/

//实现线程方法2
/*public class Xiancheng implements   Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"线程启动");
		for (int i = 0; i <10; i++) {
			System.out.println(Thread.currentThread().getName()+"->"+i);
		}
	}*/
/*public class Xiancheng implements   Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"线程启动");
		for (int i = 0; i <5; i++) {
			System.out.println(Thread.currentThread().getName()+"->"+i);
		}
		while (true) {
			if (S.getI()<0) {
				break;
			}
			System.out.println(Thread.currentThread().getName()+"->"+S.getI());
			S.sub();
		}
	}
	}
	*/
public class Xiancheng implements Runnable{

	private S s;
	public Xiancheng(S s) {
		this.s = s;
	}
	@Override
	public void run() {
		while (true) {
			s.print();
			if (s.i <= 0) {
				break;
			}
		}
	}
}



