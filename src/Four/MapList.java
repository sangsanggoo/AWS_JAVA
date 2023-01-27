package Four;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	public static void main(String[] args) {
		Map<String,Object> mapp = new HashMap<String, Object>();
		List<Map<String,Object>> customers = new ArrayList<Map<String,Object>>();
		mapp.put("name", "홍길동");
		customers.add(mapp);
		mapp.put("rating", "vip");
		customers.add(mapp);
		mapp.put("age", "30");
		customers.add(mapp);
		mapp.put("name", "김기영");
		customers.add(mapp);
		mapp.put("rating", "gold");
		customers.add(mapp);
		mapp.put("age", "35");
		customers.add(mapp);
		for(Map<String,Object> customer : customers) {
			System.out.println(customer);
		}
		
	}
}
