package j05_캐스팅;

public class Casting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char char_a = 'a';
		int num = (int) char_a;//업캐스팅:큰걸로 갈때는 생략해줘도 됨;
		char char_b = (char) (num+1);//다운캐스팅:낮은걸로 갈때는 무조건 해줘야함;
		System.out.println(char_b);
		
	}

}
