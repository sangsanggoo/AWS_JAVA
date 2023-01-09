package j07_반복문;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean loopFlag1 = true;
		while(loopFlag1) {
			char select = '\0';
			System.out.println("========<메뉴>========");
			System.out.println("1. 김밥천국");
			System.out.println("2. 탄탄면");
			System.out.println("3. 홍대개미");
			System.out.println("4. 롯데리아");
			System.out.println("======================");
			System.out.println("q. 프로그램 종료");
			System.out.println("======================");
			System.out.print("식당 선택 : ");
			
			select = scanner.next().charAt(0);
			
			if(select == 'q') {
				loopFlag1 = false;
			} else if ( select == '1') {
				boolean loopFlag2 = true;
				while(loopFlag2) {
				System.out.println();
				System.out.println("=======<< 김밥천국 >>======");
				System.out.println("1. 라면");
				System.out.println("2. 돌솥비빔밥");
				System.out.println("3. 오므라이스");
				System.out.println("4. 김치볶음밥");
				System.out.println("===========================");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 종료하기");
				System.out.println("===========================");
				System.out.println("메뉴 선택 : ");
				select = scanner.next().charAt(0);
				if (select == 'b') {
					loopFlag2 = false;
				} else if (select == 'q') {
					loopFlag2 = false;
					loopFlag1 = false;
				} else if (select == '1') {
					System.out.println("라면을 선택했습니다.");
				} else if (select == '2') {
					System.out.println("돌솥비빔밥을 선택했습니다.");
				} else if (select == '3') {
					System.out.println("오므라이스를 선택했습니다.");
				} else if (select == '4') {
					System.out.println("김치볶음밥을 선택했습니다.");
				} else {
					System.out.println("사용할수 없는 번호입니다.");
					System.out.println("다시 입력해주세요");
				}
				}
			} else if ( select == '2') {
				boolean loopFlag2 = true;
				while(loopFlag2) {
				System.out.println();
				System.out.println("=======<< 탄탄면 >>======");
				System.out.println("1. 탄탄면");
				System.out.println("2. 안탄탄면");
				System.out.println("3. 물렁면");
				System.out.println("4. 안물렁면");
				System.out.println("===========================");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 종료하기");
				System.out.println("===========================");
				System.out.println("메뉴 선택 : ");
				select = scanner.next().charAt(0);
				if (select == 'b') {
					loopFlag2 = false;
				} else if (select == 'q') {
					loopFlag2 = false;
					loopFlag1 = false;
				} else if (select == '1') {
					System.out.println("탄탄면을 선택했습니다.");
				} else if (select == '2') {
					System.out.println("안탄탄면을 선택했습니다.");
				} else if (select == '3') {
					System.out.println("물렁면을 선택했습니다.");
				} else if (select == '4') {
					System.out.println("안물렁면을 선택했습니다.");
				} else {
					System.out.println("사용할수 없는 번호입니다.");
					System.out.println("다시 입력해주세요");
				}
				}
			} else if ( select == '3') {
				boolean loopFlag2 = true;
				while(loopFlag2) {
				System.out.println();
				System.out.println("=======<< 홍대개미 >>======");
				System.out.println("1. 홍대개미");
				System.out.println("2. 건대개미");
				System.out.println("3. 한양대개미");
				System.out.println("4. 서울대개미");
				System.out.println("===========================");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 종료하기");
				System.out.println("===========================");
				System.out.println("메뉴 선택 : ");
				select = scanner.next().charAt(0);
				if (select == 'b') {
					loopFlag2 = false;
				} else if (select == 'q') {
					loopFlag2 = false;
					loopFlag1 = false;
				} else if (select == '1') {
					System.out.println("홍대개미를 선택했습니다.");
				} else if (select == '2') {
					System.out.println("건대개미를 선택했습니다.");
				} else if (select == '3') {
					System.out.println("한양대개미를 선택했습니다.");
				} else if (select == '4') {
					System.out.println("서울대개미를 선택했습니다.");
				} else {
					System.out.println("사용할수 없는 번호입니다.");
					System.out.println("다시 입력해주세요");
				}
				}
			} else if ( select == '4') {
				boolean loopFlag2 = true;
				while(loopFlag2) {
				System.out.println();
				System.out.println("=======<< 롯데리아 >>======");
				System.out.println("1. 데리버거");
				System.out.println("2. 불고기버거");
				System.out.println("3. 행운버거");
				System.out.println("4. 게살버거");
				System.out.println("===========================");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 종료하기");
				System.out.println("===========================");
				System.out.println("메뉴 선택 : ");
				select = scanner.next().charAt(0);
				if (select == 'b') {
					loopFlag2 = false;
				} else if (select == 'q') {
					loopFlag2 = false;
					loopFlag1 = false;
				} else if (select == '1') {
					System.out.println("데리버거를 선택했습니다.");
				} else if (select == '2') {
					System.out.println("불고기버거를 선택했습니다.");
				} else if (select == '3') {
					System.out.println("행운버거를 선택했습니다.");
				} else if (select == '4') {
					System.out.println("게살버거를 선택했습니다.");
				} else {
					System.out.println("사용할수 없는 번호입니다.");
					System.out.println("다시 입력해주세요");
				}
				}
				
			} else {
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}
		}
		System.out.println("프로그램 정상 종료~!");
	}
}
