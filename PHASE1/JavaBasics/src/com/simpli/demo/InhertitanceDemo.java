package com.simpli.demo;

import people.customer.InPatient;
import people.customer.Patient;

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
		
		System.out.println("\n Patient 1 :");
		Patient patient1 = new  Patient(2, "Prabhu", 51);
		patient1.prescription();
		patient1.disease();	
		
		System.out.println("\n Display Patient's disease :");
		displayDisease(patient1);
		displayDisease(inPatient2);
	}
	
	public static void displayDisease(Patient pat) {		
		pat.disease();	
		System.out.println(" Discount : "+pat.discount );
		System.out.println(" Age : "+pat.age );
	}

}
