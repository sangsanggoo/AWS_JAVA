package j09_클래스;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J09_User user1 = new J09_User();
		J09_User user2 = new J09_User();
		
		user1.username = "ABC";
		user1.password = "BCA";
		user1.name = "이상현";
		user1.email = "bagume61@naver.com";
		
		user2.username = "QWE";
		user2.password = "WQE";
		user2.name = "상현이";
		user2.email = "bagume16@naver.com";
		
		user1.printUserInfo();
		user2.printUserInfo();
	}

}
