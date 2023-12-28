package com.compli.threads;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		
		for(int x=0;x<10;x++) {
			System.out.println(Thread.currentThread().getName() + " x="+x);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {				
			}
		}
		
	}
}


//Create a LabTechnician class. This class should be launchable as a Thread.
//The job of the LabTechnician tgread is to print "Tested patient " 1, 2.. upto 10.

