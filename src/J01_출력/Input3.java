package J01_출력;

import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String Name = null;
		int Nai = 0 ;
		String Jooso = null;
		String Phone = null;
		
		System.out.print("이름 : ");
		Name = in.next();
		System.out.print("나이 : ");
		Nai = in.nextInt();
		System.out.print("주소 : ");
		Jooso = in.nextLine();// 그냥 next뒤에 nextLine을 사용할경우
		Jooso = in.nextLine();// nextLine사이에 한번 써서 버퍼를 없애줘야함 
		System.out.print("연락처 : ");
		Phone = in.next();
		
		System.out.println("사용자의 이름은 " + Name + "이고 나이는 " + Nai + "살입니다.");
		System.out.println("주소는 " + Jooso + "에 거주중입니다.");
		System.out.println("연락처는 " + Phone + " 입니다.");
		
	}


}
