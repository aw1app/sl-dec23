package com.compli.threads;

public class OfficeWaitingThreadDemo {

	public static void main(String[] args) {
		Office office = new Office(); // common object
		
		OfficeStaff os = new OfficeStaff(office);
		Thread mt1 = new Thread(os);
		
		OfficeCustomer oc = new OfficeCustomer(office);
		Thread mt2 = new Thread(oc);
		
		mt1.start();
		mt2.start();

	}

}
