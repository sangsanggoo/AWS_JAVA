package 복습.메소드;

public class Method3 {
	public static int method1() {
		return 100;
	}
	public static int method1(int a) {
		return a+100;
	}
	public static int method1(int a, int b) {
		return a+b;
	}
	public static int method1(int a, String b) {
		System.out.println(b);
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println(method1());
		System.out.println(method1(100));
		System.out.println(method1(100,200));
		System.out.println(method1(100,"안녕"));
	}
	
}
