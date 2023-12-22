package package2;

import package1.A;

public class C extends A{
	
	
	public void mB() {
		A a = new A();

		a.x1 = 23;

		// Compiler error
		// because default stuff of one class
		// cannot be accessed in other package classes
		//a.x2 = 23;
		
		// Compiler error
		// because protected stuff just like default stuff of one class
		// cannot be accessed in other package classes
		// a.x3 = 55;
		
		//but through inherited data member, we can access it.
		this.x3=55;

		// Compiler error
		// because private stuff of one class
		// cannot be accessed in other classes
		// a.x4=23;
		
		//a.mA();

	}

}
