package com.simpli.demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer s= new StringBuffer("Hello");
		
		
		System.out.println("s= "+s);
		
		 s.append(" World");
		 
		 System.out.println("s= "+s);
		 
		 s.replace(0,1, "She");
		 
		 System.out.println("s= "+s);
		 
		 String str =  s.toString();
		 
		 
		 String a1 = "Hi";
		 StringBuffer a2 = new StringBuffer(a1);
		 

	}

}
