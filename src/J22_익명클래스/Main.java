package J22_익명클래스;

public class Main {

	public static void main(String[] args) {
		Calculator c1 = new Addtion();
		System.out.println(c1.calc(10,20));
		////////////////////////////////////////////////////
		Calculator c2 = new Calculator() { 
//			Calculator가 인터페이스임 클래스가 아니라
//			똑같은 객체 생성은 안된다
//			한번만 사용하는 경우 클래스로 만들지 않고 사용하는게 낭비 X
			@Override
			public int calc(int x, int y) {
				// TODO Auto-generated method stub 
				return x-y;
			}
		};
		System.out.println(c2.calc(200,420));
		
//		Calculator  c1 과 Calculator c2는 같은것으로 c1을 c2를 재정의해서 다시 쓰는거
	}
	
}
