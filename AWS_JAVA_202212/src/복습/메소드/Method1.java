package 복습.메소드;

public class Method1 {
	public static int sum(int x, int y) {
		int result = x + y;
		return result;
	}
	
	public static void main(String[] args) {
		int a1 = 10;
		int b1 = 20;
				
		int a2 = 20;
		int b2 = 30;
				
		System.out.println(sum(a1,b1));
		System.out.println(sum(a2,b2));
				
	}
}
