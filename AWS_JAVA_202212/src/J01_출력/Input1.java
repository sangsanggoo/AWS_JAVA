package J01_출력;

import java.util.Scanner;

import J17_스태틱.싱글톤.KIA;

public class Input1 {

	public static void main(String[] args){
		// Ctrl + Space + Enter 추천 받기
		// Ctrl + Shift + O (한번에 임포트 다해버리기~)
		int Num1 = 0;
		int Num2 = 0;
		int Num3 = 0;
		int Num4 = 0;
		int Num5 = 0; //변수 선언은 앞쪽에서 몰아서 그리고 0으로 초기화
		Scanner in = new Scanner(System.in);
		System.out.print("1번 : ");
		Num1 = in.nextInt();
		System.out.print("2번 : ");
		Num2 = in.nextInt();
		System.out.print("3번 : ");
		Num3 = in.nextInt();
		System.out.print("4번 : ");
		Num4 = in.nextInt();
		System.out.print("5번 : ");
		Num5 = in.nextInt();
		System.out.println("합은 : " + (Num1 + Num2 + Num3 + Num4 + Num5));
		KIA.getInstance().printCompnayName();

	}

}
