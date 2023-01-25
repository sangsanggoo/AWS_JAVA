package J12_배열;

public class Array4  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J12_User[] user = new J12_User[3];
		J12_User[] user2 =  new J12_User[] { 
		new J12_User ("aaa" , "1234" , "김종환" , "bagume61@naver."),
		new J12_User("bbb" , "3456" , "이상현" , "bagume239@naver.com"),
		new J12_User("ccc" , "5678" , "고구마" , "sweetpotato@naver.com")
		};
		
		J12_User[] User3 = {
				new J12_User ("aaa" , "1234" , "김종환" , "bagume61@naver."),
				new J12_User("bbb" , "3456" , "이상현" , "bagume239@naver.com"),
				new J12_User("ccc" , "5678" , "고구마" , "sweetpotato@naver.com")
		};
		user[0] = new J12_User("aaa" , "1234" , "김종환" , "bagume61@naver.");
		user[1] = new J12_User("bbb" , "3456" , "이상현" , "bagume239@naver.com");
		user[2] = new J12_User("ccc" , "5678" , "고구마" , "sweetpotato@naver.com");
		for( int i = 0 ; i < 3 ; i++) {
			System.out.println(user[i].toString());
		}
		for( int i = 0 ; i < 3 ; i++) {
			System.out.println(user2[i].toString());
		}
		for( int i = 0 ; i < 3 ; i++) {
			System.out.println(User3[i].toString());
		}
	}

}
