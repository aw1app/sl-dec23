package package1;

public class B {
	
	public void mB() {
		A a = new A();
		
		a.x1=23;
		a.x2=23;
		a.x3=23;
		
		// Compiler error
		// because private stuff of one class 
		// cannot be accessed in other classes
		// a.x4=23;
		
	}

}
