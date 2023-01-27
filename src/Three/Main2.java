package Three;

import java.util.ArrayList;
import java.util.List;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		students.add(new Student(1001, "홍길동"));
		students.add(new Student(1002, "강철수")); 
		// list 두번째값이 null 이라 출력이 안되니까
		// 2번째 값을 넣어줘야 실행이 됩니다
		students.add(new Student(1003, "김영희"));
	
	for(Student student : students) {
		student.showStudent();
	}

	}
}