package zuoye8d1;

public class Teacher extends People {

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("老师尊尊教导");
	}
	
	public final void work() {
		System.out.println("老师教书");
	}
	
	public void play() {
		System.out.println("老师们在唱歌");
	}
}
