package zhujie;

public class ChuShiThread extends Thread{

	private Cai cai;
	public ChuShiThread(Cai cai){
		this.cai = cai;
	}

	@Override
	public void run() {
		while (true) {
			cai.addCai();
		//	stop();
		}
	}
}
