package com.simpli.demo;

import exceptions.DoctorNotFoundException;
import people.staff.Doctor;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		Doctor d1 = new Doctor("Suma",30);
		Doctor d2 = new Doctor("Tabrez",40);
		
		try {
			meetDoctor(d1);
		} catch (DoctorNotFoundException e) {
			System.out.println(e.getMessage());
		}

		
	}
	
	
	public static void meetDoctor(Doctor d) throws DoctorNotFoundException{
		
		if(d.name.equals("Tabrez")) throw new DoctorNotFoundException(d.name + "is no longer in this hospital");
		
		System.out.println("Met the doctor " + d.name);
	}

}
