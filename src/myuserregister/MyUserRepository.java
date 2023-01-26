package myuserregister;

import java.util.ArrayList;
import java.util.List;

import usermanagement.repository.UserRepositoryArrayList;

public class MyUserRepository {
	private List<MyUser> MyUserDataList ;
	private static MyUserRepository instance;
	public static MyUserRepository getIngetInstance() {
		if(instance == null) {
			instance = new MyUserRepository();
		}
		return instance;
	}
	// 싱글톤 사용
	
	public MyUserRepository() {
		// TODO Auto-generated constructor stub
		MyUserDataList = new ArrayList<>(); 
	}
	
	
	
	
	
	
}
