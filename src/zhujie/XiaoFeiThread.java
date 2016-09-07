package zhujie;

public class XiaoFeiThread extends Thread{

	private Cai cai;
	public XiaoFeiThread(Cai cai){
		this.cai = cai;
	}
	
	@Override
	public  void run() {
		while (true) {
			cai.subCai();
			//stop();
		}
	}
	
}

