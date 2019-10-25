package com.fode;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//How to declare
		ArrayList<String> vector = new ArrayList<>();
		
		//How to add
		vector.add("a");
		vector.add("c");
		vector.add("v");
		vector.add("b");
		vector.add("g");
		vector.add("h");
		vector.add("i");
		vector.add("k");
		vector.add("z");
		vector.add("t");
		
		//How To remove
		vector.remove("b");
		
		//How to sort
		Collections.sort(vector);
		
		//How to write
		for(String a : vector) {
			System.out.println(a);
		}
	}

}
