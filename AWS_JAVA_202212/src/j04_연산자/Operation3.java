package j04_연산자;

public class Operation3 {
	public static void main(String[] args) {
		int num = 11;
		
		boolean flag1 =  true;
		boolean flag2 =  false;
		boolean flag3 = num % 2 == 0;
		
		System.out.println(flag1 && flag2);
		System.out.println(flag1 && flag3);
		System.out.println(!flag1 || flag3 && flag1);
		
	}
}
