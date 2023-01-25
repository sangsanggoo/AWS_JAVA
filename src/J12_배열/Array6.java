package J12_배열;

public class Array6 {
	public static void main(String[] args) {
		String[] names = {"박성진" , "조병철", "황창욱"};
		for(int i = 0;i<3 ; i ++) {
			System.out.println(names[i
			                         ]);
		}
		System.out.println("==========<for each>=======");
		for(String name : names) //배열 리스트를 사용 처음부터 끝까지 출력 
		{
			System.out.println(name);
		}
}
	}