package myuserregister;

import com.google.gson.Gson;

public class MyUserService {
	private MyUserRepository myUserRepository ;
	Gson gson;
	private static MyUserService instance;
	public static MyUserService getInstance() {
		if(instance == null) {
			instance = new MyUserService();
		}
		return instance;
	}
	
	public MyUserService() {
		
	}
	
}
