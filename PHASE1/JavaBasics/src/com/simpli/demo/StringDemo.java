package com.simpli.demo;

public class StringDemo {

	public static void main(String[] args) {
		String s="HiHi";
		
		String r1 = s.toLowerCase();
		
		String r2 =  s.replace("H", "h");
		
		System.out.println("r2= "+r2);
		
		System.out.println("s= "+s);
		
		s = s.toUpperCase();
		
		System.out.println("s= "+s);

	}

}
