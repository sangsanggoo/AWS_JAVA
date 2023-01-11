package J16_Object;

public class ObjectEquals {
	public static void main(String[] args) {
		String name1 = "김준일"; 
		String name2 = "김준일"; //name1과 name2는 같은 주소
		String name3 = new String("김준일"); //name3는 new로 새로 만든거라 다른 주소
		System.out.println(name1);
		System.out.println(name2);
		
		System.out.println(name1 == name2); // 주소 비교
		System.out.println(name1 == name3); // 주소 비교
		System.out.println(name1.equals(name3)); // 값 비교

////////////////////////////////////////////////////////////////////////////////////
		
		
		System.out.println();
		Student s1 = new Student("이상현" , 24);
		Student s2 = new Student("이상현" , 24);
		Student s3 = new Student("이상현" , 24);
		System.out.println(s1.equals(s2));
	}
}
