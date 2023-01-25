package J16_Object;

 class Test {
	private int num;

	public Test(int num) {
		super();
		this.num = num;
		System.out.println(num + "생성");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(num + "객체 소멸");
		
	}
}

public class ObjectFianlize {
	public static void main(String[] args) throws InterruptedException {
		Test test = null;
		for(int i = 0 ; i < 10 ; i++) {
			
			test = new Test(i);
			test = null;
			
			System.gc();
		}
		
	}
}
