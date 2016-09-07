
public class CfxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CfxI cfxI=new CfxImpl(3, 4);
		System.out.println(cfxI.mianji());
		System.out.println(cfxI.zhouchang());
		
		
		
	}
	public void copy(CfxI tuxing) {
		System.out.println(tuxing.zhouchang());
		System.out.println(tuxing.mianji());
	}
}
