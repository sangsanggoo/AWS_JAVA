package J17_스태틱.싱글톤;

public class Main {
	public static void main(String[] args) {
//		A a =  A.getInstance(); //students 배열 3개를 만듬
		B b = new B(); //B b = new B(new(A());
		C c = new C(); 
		// 또같은 A 하나를  B와 C에 둘다 넣어줘야할때 
		for(int i = 0 ; i < 4 ; i++) {
			b.insertStudent();
		}
		System.out.println("C에서 학생 전부 출력");
		c.showall();
	}
}
