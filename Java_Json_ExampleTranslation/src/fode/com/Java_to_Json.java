package fode.com;

import com.google.gson.Gson;

public class Java_to_Json {
	
	public static void main(String[] args) {
		Person persona = new Person();
	    persona.setName("Erik");
	    persona.setAge(26);

	    Gson gson = new Gson();        
	    System.out.println(gson.toJson(persona));
	}

}
