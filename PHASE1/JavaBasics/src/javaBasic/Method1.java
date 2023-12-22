package javaBasic;

public class Method1 {

	public void printHello(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("Hello");
		}
	}

	public static void main(String[] args) {

		Method1 m = new Method1();
		m.printHello(6);
		
		ABC a1 =  new ABC();
	}
}

// Abstract class demo

class ABC{
	
	public void m1(int n) {
	
	}
	
}