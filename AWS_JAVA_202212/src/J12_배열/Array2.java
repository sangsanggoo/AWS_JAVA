package J12_배열;

public class Array2 {

	public static void printNames(String[] names) {
		for(int i = 0 ; i < names.length ; i++) {
			System.out.println("이름[" + (i+1) + "] = " + names[i]);
		}
		
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[3]; //		들어갈 공간이 확실하고 어떤 입력이 들어갈지 모를때
		names[0] = "김상현";
		names[1] = "이상현";
		names[2] = "박상현";
		
		String[] names2 = new String[] { "이상현" , "손지호" , "이강용", "바보탱", "멍충이", "축구" };
		String[] names3 = {"김두영" , "강대협" , "이현수","닐리리맘보0."};
	}		
}			