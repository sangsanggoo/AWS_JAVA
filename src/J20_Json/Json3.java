package J20_Json;

import com.google.gson.Gson;

import one.Company;

public class Json3 {
	public static void main(String[] args) {
		Gson gson = new Gson();
		gson.toJson(null); 				//object - > json
		
		gson.fromJson("",Class.class); 	//json   - > object
		
	}
}
