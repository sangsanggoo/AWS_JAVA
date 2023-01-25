package j04_연산자;

public class Operation6 {
	public static void main(String[] args) {
		/*
		 * 
		 *시험 성적을 학점으로 계산하는 프로그램
		 *
		 *정수자료형 score변수 선언
		 *88으로 초기화
		 *
		 *조건
		 *score가 0점보다작거나 100점보다 크면 X를 출력
		 *score가 90 ~ 100이면 A학점
		 *score가 80 ~ 89이면 B학점
		 *score가 70 ~ 79이면 C학점
		 *score가 60 ~ 69이면 D학점
		 *score가 0 ~ 59이면 F학점
		 */
		int score = 86;
		char grade = (score > 100 || score < 0) ? grade = 'X' 
				: score > 89 ? 'A' 
				: score > 79 ? 'B' 
				: score > 69 ? 'C' 
				: score > 59 ? 'D' : 'F';
		System.out.print("점수(" + score + "): " + grade);
		char plus = ((score % 10 > 4 ) && score > 50 && score <  100) ? '+' : '\0';
		System.out.println(plus + "학점");
	}
}
