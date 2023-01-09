package j05_캐스팅;

public class Casting1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'a';
		int num_1= a; //자동형변환
		System.out.println((double)a);//이게 진짜 형변환
		System.out.println((char) 97);//97을 char로 변환
		System.out.println((byte)300);//byte는 -128~127 이라 44가되버림
	}
}
