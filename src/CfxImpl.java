
public class CfxImpl implements CfxI {

	private int c;
	private int w;
	
	public CfxImpl () {
		
	}
	
	public CfxImpl (int c,int w) {
		this.c=c;
		this.w=w;
	}	
	@Override
	
	public int zhouchang() {
		// TODO Auto-generated method stub
		return c+w;
	}

	@Override
	public int mianji() {
		// TODO Auto-generated method stub
		return c*w;
	}

}
