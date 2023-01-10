package J13_상속.casting2;

public class Subway extends Transportation {
	
	@Override //@시작하는 문법을 어노테이션이라 한다.
	public void go() {
		System.out.println("지하철을 타고 출발");
	}
	
	@Override //@Override 재정의 되었다고 표시하는거
	public void stop() {
		System.out.println("지하철을 타고 도착");
	}
	
	public void checkRoute() {
		System.out.println("지하철 노선 확인");
	}

}
