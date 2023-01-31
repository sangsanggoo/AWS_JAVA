package J24_람다;

@FunctionalInterface // 람다용 인터페이스다 표시
public interface Instrument {
	public abstract String play(String instrument);
	
	public default void testPrint() {
		System.out.println("테스트");
	}
//	디폴트 메소드는 가능하다
	
//	public abstract String play2(String instrument);
//	메소드 2개는 안됨..
}

