package J17_스태틱.싱글톤;

public class KIA {
	private static KIA instance = null;
	private KIA() {}
	public static KIA getInstance(){ //만들면서 유일한 하나의 객체를 생성
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	// 위에 코드는 모든 싱글톤을 이렇게 만듬
	public void printCompnayName() {
		System.out.println(getClass().getSimpleName());
	}
}
