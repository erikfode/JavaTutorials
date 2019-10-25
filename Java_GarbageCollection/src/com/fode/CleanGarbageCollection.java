package com.fode;

public class CleanGarbageCollection {

	public static void main(String[] args) {
		
		String a = null;
		
		String b = null;
		
		b = new String("Something");
		
		a=b;
		
		System.out.println(a);		

		System.gc();

		System.out.println(a);
		
	}
	
}
