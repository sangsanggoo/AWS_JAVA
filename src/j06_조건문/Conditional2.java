package j06_조건문;

import java.util.Scanner;

public class Conditional2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		int min = 0;
		
		System.out.println("정수 3개 입력 : ");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		max = a;
		min = a;
		
		if (b > max) {
			max = b;
		} else if(max > c) {
			max = c;
		}
		if (b < min) {
			min = b;
		} else if(c < min) {
			min = c;
		}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
