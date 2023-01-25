package J19_컬렉션;

import java.util.HashSet;
import java.util.Set;

public class StudentHashSet {
	
	private static Student searchStudent(Set<Student> students, String searchName) {
		Student student = null;
		for (Student st :students) {
			if(st.getName().equals(searchName)) {
				student = st;
				break;
			}
		}
		return student;
		
		
	}
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		
		students.add(new Student("이현수",22));
		students.add(new Student("삼현수",23));
		students.add(new Student("사현수",24));
		students.add(new Student("오현수",25));
		students.add(new Student("육현수",26));
		students.add(new Student("칠현수",27));
		
		System.out.println(students);
		Student student = searchStudent(students, "칠현수");
		if(student == null) {
			System.out.println("검색실패");
		} else {
			System.out.println("검색성공");
			System.out.println(student.getName() + "는 " + student.getYear() + "살입니다.");
		}
	}
}
