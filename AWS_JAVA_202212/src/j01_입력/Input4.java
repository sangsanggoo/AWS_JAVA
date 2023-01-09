package j01_입력;

import java.util.Scanner;

public class Input4  {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		
		int max = 0;
		int min = 0;
		
		System.out.print("정수 3개 입력 : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		max = (a >= b && a >= c) ? a
				: (b >= a && b >= c) ? b
				: c;
		min = (a <= b && a <= c) ? a 
				:(b <= a && b <= c) ? b
				: c;
		
		/*
		 * max = a;
		 * max = b > max  ? b : max;
		 * max = c > max  ? c : max;
		 * 
		 * min = a;
		 * min = b < mix  ? b : min;
		 * min = c < mix  ? c : min;
		 */
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
