package one;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class one_main {
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Company com = new Company(100,"apple"
				,"Apple Computer Inc. 1 infinite Loop"
				,"Cupertino"
				,"CA"
				,"95014");
		System.out.println(gson.toJson(com));
		
		
	}
	
	
}
