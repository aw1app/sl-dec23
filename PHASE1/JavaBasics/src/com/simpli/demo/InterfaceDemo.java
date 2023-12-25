package com.simpli.demo;

public class InterfaceDemo {

	public static void main(String[] args) {
		X x1 = new A2();
		x1.sayHi("Thambi");
		System.out.println("my salary is "+x1.getSalary());
	}

}

interface X{
	
	public void sayHi(String name);
	
	public int getSalary();
	
}

class A1 implements X {

	@Override
	public void sayHi(String name) {		
		System.out.println("Hi "+ name);
	}

	@Override
	public int getSalary() {		
		return 0;
	}	
}

class A2 implements X {

	@Override
	public void sayHi(String name) {		
		System.out.println("Hi Hi "+ name);
	}

	@Override
	public int getSalary() {		
		return 1000;
	}
	
}
