package J13_상속;

public class KiaCar extends Car {
	public KiaCar() {
		super(); //나의 부모 상위객체(Car)
		System.out.println("자식");
		
		
		
	}
	@Override 
	public int discountPrice(int percentage) {
		// TODO Auto-generated method stub
		return super.discountPrice(percentage); 
//		이걸 만들어 주면 이걸 통해서 Car로 가서 사용 
	}
//	public void test() {
//		KiaCar kc = this; 본인의 주소를 변수로 사용하고 싶을경우
//	}
}
