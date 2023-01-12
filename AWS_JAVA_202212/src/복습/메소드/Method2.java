package 복습.메소드;

public class Method2 {
	public static void method1() {
		System.out.println("단순 실행");
	}
	public static void method2(int num) {
		System.out.println("num = " + num);
	}
	public static int method3() {
		return 100;
	}
	public static int method4(int num) {
		return num+100;
	}
	
	public static void main(String[] args) {
		method1();
		method2(100);
		System.out.println(method3());
		System.out.println(method4(100));
	}
}
