package J18_제네릭;

public class Main2 {
	public CMRespDto<?> reponse(CMRespDto<?> cmRespDto) {
//		public CMRespDto<? extends Person> : Person을 상속받은 칭구들은 가능 ex)학생,선생님
//		public CMRespDto<? super Student> : Student 상위객체들만 가능 ex) 학생,사람
//		? : 와일드카드 아무자료형이나 사용가능
//		Object로도 사용 가능 최상위 자료형이니까아~
		System.out.println("응답데이터");
		return cmRespDto;
	}
	public static void main(String[] args) {
		Main2 main = new Main2();
		CMRespDto<String> hello = new CMRespDto<String>(200,"성공","안녕하세요");
		CMRespDto<Integer> score = new CMRespDto<Integer>(200,"성공",85);

		// reponse 메소드는 Main2가 생성되야 사용 가능한데
//		메인문은 static이니까 생성안되도 사용 가능하기 때문에
//		메인문에서 main2를 주소를 할당 해야 사용 가능함
		System.out.println("hello");
		System.out.println(main.reponse(hello));
		System.out.println("score");
		System.out.println(main.reponse(score));
		// 안녕하세요.
	}
}
