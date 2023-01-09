package J12_배열;

import java.util.Scanner;

public class J12_UserServie {
	private Scanner scanner;
	private J12_UserRepository userRepository;

	public J12_UserServie(J12_UserRepository userRepository) {
		this.scanner = new Scanner(System.in);
		this.userRepository = userRepository;
	}
	public void stop() {
		for(int i = 0 ; i < 10 ; i++) {
			try {
				Thread.sleep(500);
				System.out.println("프로그램 종료중...(" + (i + 1) + "/10)" );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}
	public void run() {
		boolean loopFlag = true;
		char select = '\0';
		while(loopFlag) {
			showMainMenu();
			select = inputSelect("메인");
			loopFlag = mainMenu(select);
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
	}
	
	private char inputSelect(String menuName) {
		System.out.print(menuName + "메뉴 선택 : ");
		char select = scanner.next().charAt(0);
		scanner.nextLine();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		return select;
	}
	
	private void showMainMenu() { 
	
		System.out.println("=======<< 메인메뉴 >>=======");
		System.out.println("1. 회원 조회");
		System.out.println("2. 회원 등록");
		System.out.println("3. 회원 이름으로 사용자 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("============================");
		System.out.println("q. 프로그램 종료");
		System.out.println();
		
	}
	private void showUsers() {
		J12_User[] users = userRepository.getUserTable();
		System.out.println("====== < 회원 전체 조회 > =====");
		for (J12_User user : users) {
			System.out.println(user.toString());
		}
	}
	private void registerUser() {
		J12_User user = new J12_User();
		System.out.println("=====<<회원 등록>>=====");
		
		System.out.println("사용자이름: ");
		user.setUsername(scanner.nextLine());
		
		System.out.println("비밀번호: ");
		user.setPassword(scanner.nextLine());
		
		System.out.println("성명: ");
		user.setName(scanner.nextLine());
		
		System.out.println("이메일: ");
		user.setEmail(scanner.nextLine());
		
		userRepository.saveUser(user);
	}
	
	private String inputName() {
		String findUserName = null;
		System.out.println("찾으실 사용자 이름을 입력해주세요 : ");
		findUserName = scanner.nextLine();
		return findUserName;
	}
	
	private J12_User editMenu() {
		
		System.out.println("=====<< 수정메뉴 >>=====");
		return userRepository.findUserByUsername(inputName());
		
	}
	private void changeMenu(J12_User user) {
		
		System.out.println("========================");
		System.out.println("1. 비밀번호 변경");
		System.out.println("2. 이름 변경");
		System.out.println("3. 이메일 변경");
		System.out.println("========================");
		System.out.println("b. 뒤로가기");
		System.out.println();
		System.out.println("수정 메뉴 선택 : ");
		char select = scanner.next().charAt(0);
		scanner.nextLine();
		
		if(select == '1') {
			System.out.println("기존의 비밀 번호를 입력하세요 : ");
			String password = scanner.nextLine();
			if(user.getPassword().equals(password)) {
			if(password.equals(user.getPassword())) {
				System.out.println(" 새로운 비밀번호를 입력하세요 : ");
				String NewPassword = scanner.nextLine();
				System.out.println(" 새로운 비밀번호를 확인하세요 : ");
				String NewPassword2 = scanner.nextLine();
				if (NewPassword.equals(NewPassword2)) {
					user.setPassword(NewPassword2);
					System.out.println("비밀번호가 변경되었습니다.");
				}
				} else {
					System.out.println("새로운 비밀번호가 일치 하지 않습니다.");
				changeMenu(editMenu());
			}
			} else  {
				System.out.println("비밀번호가 일치 하지 않습니다");
				changeMenu(editMenu());
			}
		} else if(select == '2') {
			System.out.println("이름 변경은 다음에 하자");
		} else if(select == '3') {
			System.out.println("이메일 변경은 다음에 하자");
		} else if(select == 'b'){
			run();
		}
	}
		
//	리팩토링 : 이전 소스코드를 정리
	private boolean mainMenu(char select) {
		boolean flag = true;
		if(isExit(select)) {
			flag = false;
		}else {
			if (select == '1') {
				showUsers();
			} else if(select == '2') {
				registerUser();
			} else if(select == '3') {
				System.out.println(userRepository.findUserByUsername(inputName()));
			} else if(select == '4') {
				changeMenu(editMenu());
			} else {
				System.out.println(getSelectErroMessage());
			}
		}
		System.out.println();
			return flag;
	}
	
	private boolean isExit(char select) {
		return select == 'q' || select == 'Q';
	}
	private String getSelectErroMessage() {
		return "<<잘못 된 입력 입니다. 다시 입력하요.>>";
	}
}
