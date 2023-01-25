package J12_배열;

public class J12_UserMain  {
	public static void main(String[] args) {
		J12_User[] user = new J12_User[0];
		J12_User[] user2 = new J12_User[100];
		
		J12_UserRepository userRepository = new J12_UserRepository(user);
		J12_UserRepository userRepository2 = new J12_UserRepository(user2);
		
		J12_UserServie service  = new J12_UserServie(userRepository);
		service.run();
		service.stop();
	}
	}
	                         