package J19_컬렉션;

import java.util.ArrayList;

public class ListStringMain {
	public static void main(String[] args) {
		String[] strArray = new String[] {"java" , "python" , "C++"};
		String[] strArray2 = new String[strArray.length+1];
		for(int i = 0 ; i < strArray.length ; i++) {
			strArray2[i] = strArray[i]; 
		}
		strArray2[strArray.length] = "html";
		
		for(int i = 0 ; i < strArray.length ; i++) {
			System.out.print(strArray[i] + " ");
		}
		System.out.println();
		for(int i = 0 ; i < strArray2.length ; i++) {
			System.out.print(strArray2[i] + " ");
		}
			System.out.println();
		//////////////////////////////////////////////////////
		new ArrayList<>().add("test");
		ArrayList<String> strList = new ArrayList<>();
		strList.add("자바");
		strList.add("python");
		strList.add("C++");
		strList.add("C++");
		strList.remove("C++"); //제거
		strList.add(1, "C"); // 원하는 인덱스에 추가
		strList.remove(1); // 1번 인덱스 삭제
		System.out.println(strList);
		
		for(int i = 0 ; i < strList.size();i++) {
			System.out.print("[" + i + "]: ");
			System.out.println(strList.get(i));
		}
	}
}
