package J17_스태틱;

public class TestA {
	// static으로 변수를 만들면 공유되서 사용 가능
	// TestA ta = new TestA(); 를 안하고도 사용 가능 
	private static int num;
	
	public static void setNum(int num) {
		TestA.num = num; 
	}
	
	public static int getNum() {
		return num;
	}
}
