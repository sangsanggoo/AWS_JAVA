package J18_제네릭;
//제네릭은 래퍼 클래스만 사용 할 수 있음
public class TestData<B,T> {
	private B data1;
	private T data2; //Wrapper Class(래퍼 클래스)
	
	public TestData(B data1, T data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public String toString() {
		return "TestData [data1=" + data1 + ", data2=" + data2 + "]";
	}
	
}
