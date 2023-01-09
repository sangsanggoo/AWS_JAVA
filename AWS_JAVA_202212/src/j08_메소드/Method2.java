package j08_메소드;

public class Method2 { 
//	메소드 : 클래스 안에서 사용
//	함수 : 클래스 밖에서 사용
//	매개변수 : x, 반환 : x
	public static void method1() {
		System.out.println("단순실행");
	}
//	매개변수 : o, 반환 : x
	public static void method2(int num) {
		System.out.println("num : " + num);
	}
//	매개변수 : int 2개, 반환 : x
	public static void method3(int num, int num2) {
		System.out.println("num : " + num);
		System.out.println("num2 : " + num2);
		System.out.println();
	}
	
	public static String method4() {
		return "데이터 반환";
	}
	
	public static String method5(int age) {
		String ageStr = age + "살";
		return ageStr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1(); //함수 호출
		method2(100);
		method3(200, 300);
		
		System.out.println(method4());
		System.out.println();
		
		String data1 = method4();
		System.out.println(data1);
		System.out.println();
		
		String data2 = method5(10);
		System.out.println(data2);
	}


}
