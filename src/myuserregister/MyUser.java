package myuserregister;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MyUser {
	String userName;
	String passWord;
	String name;
	String email;
}
