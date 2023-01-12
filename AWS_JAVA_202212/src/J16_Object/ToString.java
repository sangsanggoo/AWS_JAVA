package J16_Object;

public class ToString {

	public static void main(String[] args) {
		
		Student student1 = new Student("조병철", 34);
		Student student2 = new Student("김동민", 33);
		Student student3 = new Student("김두영", 32);
		Student student4 = new Student("강의진", 31);
		Student student5 = new Student("이상현", 30);
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		System.out.println(student5);
		
		System.out.println();
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());
		System.out.println(student5.toString());
		
		//toString이 생략되어있다
		//대입 할때는 .toString() 생략이 불가능
//		String name = s 는 안되고
//		String name = s.toString()으로 해야함
}
}
