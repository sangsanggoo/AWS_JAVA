package j04_연산자;

public class Operation1 { 
//	main + Ctrl + Space + Enter 메인문 단축키
	public static void main(String[] args) {
		int add = 1 + 2;
		int sub = 10 - 5;
		int mul = 10 * 2;
		int div = 10 / 5;
		int remaider = 10 % 5; // 나머지
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(remaider);
		System.out.println(remaider == 0 ? "5의 배수이다" : "5의 배수가 아니다");
		
	}
}
