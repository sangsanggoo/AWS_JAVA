package j06_조건문;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String select = null;
		System.out.println("선택(A~D) : ");
		select = in.next();
		
		switch(select) {
			case "A" :
				System.out.println("PC(A)를 연결합니다.");
				break;
			case "B" :
				System.out.println("PC(B)를 연결합니다.");
				break;
			case "C" :
				System.out.println("PC(C)를 연결합니다.");
				break;
			case "D" :
				System.out.println("PC(D)를 연결합니다.");
			default :
				System.out.println("else와 같은 역할");
		}
	}
}
