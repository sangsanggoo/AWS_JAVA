package j07_반복문;

import java.util.Scanner;

public class Loop3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		int total = 0;
		System.out.print("반복횟수 : ");
		count = in.nextInt();
		for(int i = 0;i < count;i++) {
			int a= 0;
			int b= 0; // 지역 변수로 for문안에서 쓰고 밖에선 안씀
			System.out.println(i + 1 + "번 반복");
			System.out.print("A : ");
			a = in.nextInt();
			System.out.print("B : ");
			b = in.nextInt();
			System.out.println(i + 1 + "번 합 : " + (a + b) + "\n");
			total += a + b;
		}
		System.out.println("A와B들의 총합은 : " + total);
	}
}
