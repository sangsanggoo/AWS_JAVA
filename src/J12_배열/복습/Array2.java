package J12_배열.복습;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class User {
	
	private String username;
	private String password;
}

public class Array2 {
	public static void main(String[] args) {
		User user1 = new User("aaa","1234");
		User user2 = new User("aaa","1234");
		User user3 = new User("aaab","234");
		User[] users = new User[] {
				new User("aaa","1234"),
				new User("aaa","1234"),
				new User("aaab","234")
		};
		for(int i = 0 ; i < users.length ; i++) {
			System.out.print(users[i].getUsername() + " ");
			System.out.println(users[i].getPassword());
		}
		
		for(User u : users) { 
			System.out.println(u.getUsername());
		}
		
		List<User> userList = Arrays.asList(users);
		System.out.println(userList);
}

}