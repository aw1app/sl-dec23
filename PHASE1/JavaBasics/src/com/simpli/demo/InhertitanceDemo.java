package com.simpli.demo;

import people.customer.InPatient;

public class InhertitanceDemo {

	public static void main(String[] args) {
		InPatient inPatient1 = new InPatient();
		
		// calling an inherited method 
		inPatient1.prescription(); 
		
		// calling an overridden method 
		inPatient1.disease();
	}

}
