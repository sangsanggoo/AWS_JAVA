package J17_스태틱.싱글톤;

import java.util.Scanner;

public class B {

	
	public B() {
	
	}
	public void insertStudent() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학생 이름:");
		String name = scanner.nextLine();
		
		Student student = new Student(name);
		A.getInstance().addStudent(student);
		A.getInstance().showStudents();
	}
}
