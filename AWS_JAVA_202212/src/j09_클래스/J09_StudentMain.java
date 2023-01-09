package j09_클래스;

public class J09_StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J09_Student student1 = new J09_Student();
		J09_Student student2 = new J09_Student();
		student1.age = 10;
		student1.name= "이상현";
//		System.out.println(student1); //student1의 주소
//		System.out.println(student2); //student2의 주소
		student1.printInfo();
		
		student2.printInfo();
		
	}

}
