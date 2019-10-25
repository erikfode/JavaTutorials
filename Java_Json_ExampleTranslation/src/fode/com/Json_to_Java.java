package fode.com;

import com.google.gson.Gson;

public class Json_to_Java {

	public static void main(String[] args) {
		String json = "{\"name\":\"Unai\",\"age\":28}";

	    Gson gson = new Gson();

	    Person persona = (Person) gson.fromJson(json, Person.class);    

	    System.out.println(persona.getName());
	    System.out.println(persona.getAge());
	}

}
