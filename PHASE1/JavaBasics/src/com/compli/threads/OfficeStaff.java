package com.compli.threads;

public class OfficeStaff implements Runnable{
	
	public Office office;

	public OfficeStaff(Office office) {
		this.office = office;
	}
	
	
	@Override
	public void run() {
		System.out.println("Inside OfficeStaff Thread , "
				+ "Just started. Warming up. \n Will open office door in 10 secs.\n");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

		} // 10s
		
		synchronized (office) {	
			this.office.doorOpen = true;
			System.out.println("OfficeStaff: I have opened the Door for customers.\n");
			office.notifyAll();
			System.out.println("OfficeStaff Thread : I have notified that door has opened.\n");
		}
		
	}

}
