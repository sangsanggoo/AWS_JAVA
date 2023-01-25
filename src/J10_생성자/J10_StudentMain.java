package J10_생성자;

public class J10_StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J10_Student st1 = new J10_Student(10 , "이상현");
		J10_Student st2 = new J10_Student(15 , "상현구");
		st1.printInfo();
		st2.printInfo();
	}

}
