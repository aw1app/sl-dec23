package com.simpli.demo;

public class StaticDemo {

	public static void main(String[] args) {
	
		A a1 = new A();
		a1.x = 200;
		
		A a2 = new A();
		a2.x = 300;
		
		System.out.println("Initailly A's was 100 : ");
		System.out.println(a1.s); // 100
		System.out.println(a2.s); // 100
		System.out.println(A.s); // 100
		
		A.s = 110;
		
		System.out.println("A.s = 110  gives : ");
		System.out.println(a1.s); // 110
		System.out.println(a2.s); // 110
		System.out.println(A.s); // 110
		
		a1.s = 150;
		
		System.out.println("a1.s=150 gives : ");
		System.out.println(a1.s); // 150
		System.out.println(a2.s); // 150
		System.out.println(A.s); // 150
		
		// static method demo
		System.out.println(" ** static method demo ** . \n We can invoke static methods on the \n object a1, or a2 or the class A itself!!");
		a1.s1();
		a2.s1();
		A.s1();
		
		
		// static inner class  demo
		System.out.println("** static inner class  demo **");
	    A.B b1 = new A.B();
	    System.out.println("b1.b="+b1.b);
	    
				
	}

}

class A {
	// class level properties (static property)
	static int s = 100;

	// instance properties
	int x = 100;

	// class level methods
	static public void s1() {
		System.out.println("Inside static method s1");
	}

	static class B {
		int b = 20;
	}

}
