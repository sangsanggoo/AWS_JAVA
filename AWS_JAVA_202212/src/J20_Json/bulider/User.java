package J20_Json.bulider;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
	private String username;
	private String password;
	private String name;
	private String email;
//	public static UserBuilder builder() {
//		return new UserBuilder();
//	}
//	@Data
//	public static class UserBuilder { 
//		private String username;
//	}
	
}
