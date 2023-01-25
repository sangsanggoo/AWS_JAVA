package J17_스태틱.싱글톤;

public class A {
	private Student[] students;
	private static A instance = null;
	private A() {
		students = new Student[3];
	}
	public static A getInstance(){ //만들면서 유일한 하나의 객체를 생성
		if(instance == null) {
			instance = new A();
		}
		return instance;
	}
	public void addStudent(Student student) {
		
		for(int i = 0 ; i <students.length ; i++) {
			if(students[i] == null) {
				students[i] = student;
				return; // 메소드가 멈추게 하는 역할
			}
		}
		
		System.out.println("더 이상 학생을 추가할 수 없습니다.");
		System.out.println();
	}
	
	public void showStudents () {
		for(int i  = 0 ; i <students.length ; i++) {
			System.out.println(students[i]);
		}
		System.out.println();
	}
}
