package j06_조건문;

public class Conditional1 {
	public static void main(String[] args) {
		int num = 10;
		int num2 = 10;
		
		if(num == num2) { 
			System.out.print("둘이 ");
			System.out.println("같다");
		} // if 문에서 두개 이상 실행할 경우 {}중괄호로 묶는다		
		else {
			if(num < num2) {
				System.out.println("num2가 크다");		
			}
			else {
				System.out.println("num이 크다");
			}
		}
	}
}
