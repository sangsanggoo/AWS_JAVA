package J17_스태틱.싱글톤;

public class C {
	public C() {
	}
	public void showall() {
//		A a = b.getA();
		A.getInstance().showStudents();
	}
	
}
