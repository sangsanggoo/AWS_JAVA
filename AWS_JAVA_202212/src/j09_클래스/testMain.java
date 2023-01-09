package j09_클래스;

import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count = 0;
		test t1 = new test();
		test t2 = new test();
		test t3 = new test();
		
		System.out.print("몇명을 등록 할껀가용?~! : ");
		count = in.nextInt();
		in.nextLine();
		for(int i = 0;i < count;i++) {
			System.out.print(i+ "번 " + "Id 입력 : ");
			t1.id = in.nextLine();
		}

	}

}
