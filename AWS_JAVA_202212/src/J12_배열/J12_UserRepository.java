package J12_배열;

import java.util.Scanner;

public class J12_UserRepository  {
	
	private J12_User[] userTable;
	private Scanner scanner = new Scanner(System.in);
	public J12_UserRepository(J12_User[] userTable) {
		this.userTable = userTable;
	}
	public J12_User[] getUserTable() {
		return userTable;
	}
	
	public void saveUser(J12_User user) {
		extendArrayOne();
		userTable[userTable.length-1] = user;
		
	}
/*	private void extendArray(int length) {
		J12_User[] newArray = new J12_User[userTable.length+length];
		userTable = newArray;
	}*/
	private void extendArrayOne() {
		J12_User[] newArray = new J12_User[userTable.length+1];
		saveArray(userTable,newArray);
		userTable = newArray;
	}
	private void saveArray(J12_User[] oldArray,J12_User[] newArray) {
		for( int i = 0 ; i < oldArray.length;i++) {
			newArray[i] = oldArray[i];
		}
	}
	
	public J12_User findUserByUsername(String username) {
		// 유저 이름으로 찾기~!
		
		J12_User user = null;
		for(J12_User u : userTable) {
			if(u == null) {
				continue;
			}
			if(u.getUsername().equals(username)) {
				user = u;
				break;
			}
		}
		
	
		return user;
	
	}
}
