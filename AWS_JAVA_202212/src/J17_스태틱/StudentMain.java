package J17_스태틱;

public class StudentMain {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		students[0] = new Student("일상현");
		students[1] = new Student("이상현");
		students[2] = new Student("삼상현");
		students[3] = new Student("사상현");
		students[4] = new Student("오상현");
		
		Teacher[] teachers = new Teacher[5];
		
		teachers[0] = new Teacher("김준일1");
		teachers[1] = new Teacher("김준일2");
		teachers[2] = new Teacher("김준일3");
		teachers[3] = new Teacher("김준일4");
		teachers[4] = new Teacher("김준일5");
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(students[i]);
			System.out.println(teachers[i]);
			System.out.println();
		}
//		     객체 변수     배열
		int j = 0;
		for(Student s : students) {
			System.out.println(s);
			System.out.println(teachers[j]);
			j++;
			System.out.println();
		}
		
		
		
		
		System.out.println(Student.getAutoIncrement());
		}
}

