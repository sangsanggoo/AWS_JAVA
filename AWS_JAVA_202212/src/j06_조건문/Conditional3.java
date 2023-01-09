package j06_조건문;

import java.util.Scanner;

public class Conditional3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int score = 0;
		String grade = null;
		
		System.out.print("점수 입력 : ");
		score = in.nextInt();
		/*
		 *시험 성적을 학점으로 계산하는 프로그램
		 *조건
		 *score가 0점보다작거나 100점보다 크면 X를 출력
		 *score가 90 ~ 100이면 A학점
		 *score가 80 ~ 89이면 B학점
		 *score가 70 ~ 79이면 C학점
		 *score가 60 ~ 69이면 D학점
		 *score가 0 ~ 59이면 F학점
		 * 5점 이상이면 +
		 */
	/*
		if(score > 100 || score < 0) {
			System.out.println("계산불가");
		}
		else {
			{if(score > 94){
			grade = "A+";
		}
		else if(score > 89){
			grade = "A";
		}
		else if(score > 84){
			grade = "B+";
		}
		else if(score > 79){
			grade = "B";
		}
		else if(score > 74){
			grade = "C+";
		}
		else if(score > 69){
			grade = "C";
		}
		else if(score > 64){
			grade = "D+";
		}
		else if(score > 59){
			grade = "D";
		}
		else {
			grade = "F";
		}
		*/
		if (score > 100 || score < 0) {
			grade = null;
			} else if(score > 89) {
			grade = "A";
			} else if(score > 79) {
			grade = "B";
			} else if(score > 69) {
			grade = "C";
			} else if(score > 59) {
			grade = "D";
			} else {
			grade = "F";
			}
		
		if ((score > 59 && score < 101 && (score % 10 > 4 || score == 100))) {
		grade += "+";//문자열도 더하기가 가능한듯
		}
		
		if (grade == null) {
			System.out.println("출력 불가");
		}else {
		System.out.println("점수(" + score + "):" + grade + "학점");			
		}
	}
}
