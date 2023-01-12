package J17_스태틱;

public class Student {
	private static final int CODE = 20230000;
	
	private static int ai = 1; //auto_increment
	
	private int studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = CODE+ ai;
		ai++;
		this.name = name;
	}
	public static int getAutoIncrement() {
		System.out.println("현재 AI : " + ai);
//		System.out.println("현재 이름 : " + name); 
//		getAutoIncrement는 객체 생성없이도 static이므로 사용 가능한데
//		name은 static이 아니라서 생성이 안될경우 사용이 불가능 하기 때문
		return ai;
	}
	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}
	
}
