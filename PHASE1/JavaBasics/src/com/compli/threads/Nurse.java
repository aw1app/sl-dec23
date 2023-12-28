package com.compli.threads;

import people.customer.Patient;

public class Nurse implements Runnable {

	Patient patient;

	public Nurse(Patient patient) {
		this.patient=patient;
	}

	@Override
	public void run() {

		synchronized (patient) {			
		
			System.out.println(Thread.currentThread().getName() + " Attending Patient " +patient.name);
			try {	Thread.sleep(10);		} catch (InterruptedException e) {		};
	
			System.out.println(Thread.currentThread().getName() + " Boilng water for injection to "+patient.name);
			try {	Thread.sleep(10);		} catch (InterruptedException e) {		};
	
			System.out.println(Thread.currentThread().getName() + " Filing the medicine for injection to "+patient.name);
			try {	Thread.sleep(10);		} catch (InterruptedException e) {		};
	
			System.out.println(Thread.currentThread().getName() + " Injecting the Patient "+patient.name);
			try {	Thread.sleep(10);		} catch (InterruptedException e) {		};
		
		}

	}

}
