package J19_컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {
	/**
	 * 
	 * 
	 * CRUD
	 * C : 도서등록
	 * R
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		//* 할줄 알아야하는것
		//* 값 추가
		strList.add("java");
		strList.add("python");
		System.out.println(strList);
		
		// 값 원하는 위치 추가
		strList.add(1,"C++");
		System.out.println(strList);
		
		// * 해당 인덱스 값을 추출
		System.out.println(strList.get(1));
		
		// 리스트에 해당 값이 있는지 확인(T, F)
		System.out.println(strList.contains("android"));
		System.out.println(strList.contains("C++"));
		
		// 값 수정
		strList.set(1, "C");
		System.out.println(strList);
		
		// * 값 삭제
		strList.remove("C");
		System.out.println(strList);
		strList.remove(0);
		System.out.println(strList);
		
		// * 리스트의 크기 확인
		System.out.println(strList.size());
		
		// 리스트가 비었는지 확인
		System.out.println(strList.isEmpty());
		
		// 리스트 초기화
		strList.clear();
		System.out.println(strList.isEmpty());

		// 해당 값의 위치(index)찾기
		strList.indexOf("java");
		
//	*	배열을 리스트로 변환
//	*	Arrays.asList(배열)
		
		String[] langs = {"java" , "C++" , "python","C++" , "python"};
		List<String> tempList = Arrays.asList(langs);
		strList.addAll(tempList);
		strList.addAll(2,tempList);
		System.out.println(strList);
		
		// * 해당 값의 위치 왼쪽부터 찾기
		int findIndexLeft = strList.indexOf("python");
		System.out.println(findIndexLeft);
		
		// * 해당 값의 위치 오른쪽부터 찾기
		int findIndexRight = strList.lastIndexOf("python");
		System.out.println(findIndexRight);
		System.out.println();
//		///////////////////////////////////////////////////////
		
		strList.set(1, "java");
		System.out.println(strList);
		System.out.println(strList.subList(strList.indexOf("java")+1, strList.size()).indexOf("java"));
		System.out.println();
		
		/////////////////////////////////////////////////////////
		//fromIndex 부터 toIndex전까지 부분만 리스트를 추출
		List<String> subList = strList.subList(1, 4);
		System.out.println(subList);
		
		//======================<< 반복 >>========================
		//일반 반복문
		for(int i = 0 ; i < strList.size(); i++) {
			System.out.println("[" + i + "] : " + strList.get(i));
		}
		System.out.println();
		
		//forEeach
		for(String str : strList) {
			System.out.println("[값1] : " + str);
		}
		System.out.println();
		
		//람다식
		strList.forEach(str -> System.out.println("[값2] : " + str));
		System.out.println();
		
		//반복자
		Iterator<String> iterator = strList.iterator();
		while(iterator.hasNext()) {
			System.out.println("[값3]: " + iterator.next());
		}
}
}

