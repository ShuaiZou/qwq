package zhujie;

public class S {
		/*private static int i=10;
		 private static Object obj=new Object();
		public  static void sub() {
			synchronized(obj){
			i--;}
		}
		public static int getI() {
			return i;
		}
		public static void setI(int i) {
			synchronized Ëø(obj){
			S.i = i;}
		}*/
	
	static Object obj = new Object();
	public int i = 50;
	public void print(){
		synchronized (obj) {
			System.out.println(Thread.currentThread().getName()+"->"+i);
			if (i<1) {
				i=0;
			}else{
			i--;}
		}
	}


		
}
