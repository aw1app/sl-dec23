package com.simpli.demo;

public class FinalKeywordDemo {

	public static void main(String[] args) {
		
		ABC a1 = new ABC();
		
		// a1.x=1000; // Err cannot re-assign final variables

	}

}

class ABC {
	final int x=100;
	
	final public void m() {
		System.out.println("Hi");		
	}
	
}

class B extends ABC {
	
	/* Err cannot overide final method of parent class
	public void m() {
		System.out.println("Hello");		
	}
	*/
	
}

final class C {	
	
}

/* Err we cannot extend a final class 
class D extends C{
	
}
*/
