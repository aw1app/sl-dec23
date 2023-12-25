package com.simpli.demo;

public class StaticDemo {

	public static void main(String[] args) {
	
		A a1 = new A();
		a1.x = 200;
		
		A a2 = new A();
		a2.x = 300;
		
		System.out.println(a1.s); // 100
		System.out.println(a2.s); // 100
		System.out.println(A.s); // 100
		
		A.s = 110;
		
		System.out.println("A.s = 110  gives : ");
		System.out.println(a1.s); // 110
		System.out.println(a2.s); // 110
		System.out.println(A.s); // 110
		
		a1.s = 150;
		
		System.out.println("a1.s=100 gives : ");
		System.out.println(a1.s); // 150
		System.out.println(a2.s); // 150
		System.out.println(A.s); // 150

	}

}

class A{
	// class level properties (static property)
	static int s=100;

	// instance properties
	int x=100;
	
}
