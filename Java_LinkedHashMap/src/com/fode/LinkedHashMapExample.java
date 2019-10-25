package com.fode;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		// HashMap Declaration
        LinkedHashMap<Integer, String> lhmap = 
                new LinkedHashMap<Integer, String>();

        //Adding elements to LinkedHashMap
        lhmap.put(22, "Erik");
        lhmap.put(33, "Roman");
        lhmap.put(1, "Fausto");
        lhmap.put(2, "Adolfo");
        lhmap.put(100, "Jesus");

        // Generating a Set of entries
        Set set = lhmap.entrySet();

        // Displaying elements of LinkedHashMap
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
           Map.Entry me = (Map.Entry)iterator.next();
           System.out.print("Key is: "+ me.getKey() + " & Value is: "+me.getValue()+"\n");
        }
		
	}

}
