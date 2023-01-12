package j09_클래스;

public class test {
	String id;
	String password;
	String email;
	String phone;
	
	public void Info() {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + password);
		System.out.println("이메일 : " + email);
		System.out.println("전화번호 : " + phone);
		System.out.println();
	}

	@Override
	public String toString() {
		return "test [id=" + id + ", password=" + password + ", email=" + email + ", phone=" + phone + "]";
	}
}