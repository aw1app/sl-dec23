package com.simpli.demo;

import people.customer.InPatient;

public class InhertitanceDemo {

	public static void main(String[] args) {
		System.out.println("\n In-Patient 1:");
		InPatient inPatient1 = new InPatient();

		// calling an inherited method
		inPatient1.prescription();

		// calling an overridden method
		inPatient1.disease();
		
		System.out.println("\n In-Patient 2:");

		InPatient inPatient2 = new InPatient(1, "Somu", 34, 12, 101);

		// calling an inherited method
		inPatient2.prescription();

		// calling an overridden method
		inPatient2.disease();
	}

}
