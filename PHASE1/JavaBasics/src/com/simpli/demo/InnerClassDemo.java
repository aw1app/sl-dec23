package com.simpli.demo;

class VIP {
	private int ccNo=345454646;
	
	class PersonalSecretary {
		
		public void m1() {
			// Inner class has access to privte stuff of the outer class.
			System.out.println("ccNo of my master is " +ccNo);
		}

	}

}

public class InnerClassDemo{
	
	public static void main(String[] args) {
		
		VIP vip1 = new VIP();
		
		
		VIP.PersonalSecretary pSec1 = vip1.new PersonalSecretary();
		
		pSec1.m1();
		
	}
}
