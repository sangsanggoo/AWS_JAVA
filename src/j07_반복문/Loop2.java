package j07_반복문;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int startNumber = 0;
		int endNumber = 0;
		System.out.println("시작 : ");
		startNumber = in.nextInt();
		System.out.println("끝 : ");
		endNumber = in.nextInt();
		int total1 = 0;
		int total2 = 0;
		for(int i= 0; i < startNumber;i++) {
			total1 += i;
		}
		for(int i= 0; i < endNumber;i++) {
			total2 += i+1;
		}
		System.out.println("총합 : " + (total2-total1) );
	
	}
}
