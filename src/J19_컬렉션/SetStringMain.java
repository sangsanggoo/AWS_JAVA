package J19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> setStr = new HashSet<>();
		List<String> listStr = new ArrayList<>();
		
		listStr.add("임나영");
		listStr.add("이강용");
		listStr.add("최해혁");
		listStr.add("임준렬");
		
		setStr.add("김상현");
		setStr.add("강대협");
		setStr.add("손지호");
		setStr.add("최해혁");
		setStr.add("최해혁");
		setStr.addAll(listStr);// 서로 더할수 있음
		listStr.addAll(setStr);// 서로 더할수 있음
		System.out.println("리스트");
		System.out.println(listStr);
		System.out.println("셋");
		System.out.println(setStr);
		
		String searchName = "손지호";
		
		for(String name : setStr) {
			if(name.equals(searchName)) {
				System.out.println(name);
			}
		}
		
		Iterator<String> iterator = setStr.iterator(); {
			while(iterator.hasNext()) {
				String n = iterator.next();
				if(n.equals(searchName)) {
					System.out.println(n);
				}
			}
		}
		
	}

}
