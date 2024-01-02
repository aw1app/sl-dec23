package com.compli.threads;

public class OfficeCustomer implements Runnable{
	
	public Office office;

	public OfficeCustomer(Office office) {
		this.office = office;
	}
	
	@Override
	public void run() {
		int counter = 1;
		System.out.println("Inside OfficeCustomer Thread :" );		
		
		synchronized (office) {	 // syn block end	
		
			while(true) {
				System.out.println("OfficeCustomer:  checking for door open " + counter++ +"th time");
							
				if (office.doorOpen == true) {
					System.out.println("OfficeCustomer: Entered the office. My job is done! \n");
					break;
				}else {
					//try{Thread.sleep(10);}catch(InterruptedException e){}; // 100 ms
					try{office.wait();}catch(InterruptedException e){};
				}
			}
		
		}// syn block end
		
	}

}
