package J19_컬렉션;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapStringMain {
	public static void main(String[] args) {
		Map<String, String> strMap = new HashMap<>();
		strMap.put("a", "A");
		strMap.put("b", "B");
		strMap.put("c", "C");
		strMap.put("d", "D");
		strMap.put("e", "E");
		System.out.println(strMap);
		System.out.println(strMap.get("a"));// 키를 사용하여 출력 가능
		System.out.println(strMap.get("f"));// 존재하지 않을경우 null 출력
		for(String s : strMap.keySet()) {
			System.out.print(s + " = ");
			System.out.println(strMap.get(s));
		}
		for ( String v : strMap.values()) {
			System.out.print("value: ");
			System.out.println(v);
		}
		Set<Entry<String, String>> s = null;
		for(Entry<String, String> entry : strMap.entrySet()) {
			System.out.println(entry);
			System.out.print(entry.getKey() + ":");
			System.out.println(entry.getValue());
		}
	
	
	}

}