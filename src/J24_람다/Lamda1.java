package J24_람다;


// 람다를 사용할 수 있는 인터페이스는 추상메소드를 하나만 가지고 있는 인터페이스만 가능
// 장점 : 익명클래스처럼 한번에 정의하고 사용 가능하다.
public class Lamda1 {
	public static void main(String[] args) {
		Instrument instrument = new Instrument() {
			
			@Override
			public String play(String instrument) {	
				return instrument + "를(을) 연주합니다.";
			}
			
		};//클래스 정의
		Instrument instrument2 = (String itm) -> {
			return itm + "를(을) 연주합니다."; 
		}; //람다를 쓸때는 메소드가 주체가 됨
		
		// 매개변수의 자료형을 생략할 수 있다
		// 매개변수의 이름을 바꿀 수 있다.
		Instrument instrument3 = (itm2) -> {
			return itm2 + "를(을) 연주합니다."; 
		};
		
		// 매개변수가 하나이면 매개변수를 감싸는 괄호를 생략할 수 있다.
		Instrument instrument4 = itm -> {
			return itm + "를(을) 연주합니다."; 
		}; 
		
		// 구현부의 명령이 하나 일때 중괄호를 생략할 수 있다.
		// 이때 리턴 자료형이 정해져있으면 리턴값으로 사용이 된다.
		// 리턴을 생략하면 return을 생략해야한다.
		Instrument instrument5 = itm ->  itm + "를(을) 연주합니다."; 
	
		// 람다식 밖에 있는 변수를 사용 가능하기 때문에
		// 밖에 있는 변수명(전역 변수)들이랑 다르게 사용 해야한다.
		int result = 10 + 20;
		Instrument instrument6 = itm ->  itm + "를(을) 연주합니다." + result ; 
		
		
		System.out.println(instrument.play("바이올린"));
		System.out.println(instrument2.play("드럼"));
		
		System.out.println(instrument6.play("기타"));
		
		
	}
}
