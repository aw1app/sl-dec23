package com.simpli.demo;

import com.compli.threads.LabTechnician;
import com.compli.threads.Thread1;
import com.compli.threads.Thread2;

public class ThreadDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		for(int j=0;j<5;j++) {
			System.out.println(Thread.currentThread().getName() + " j="+j);
		}
		
		Thread1 t1 = new Thread1();
		t1.setPriority(10);// Priorities can be set by us. But they may be IGNORED by the OS.
		t1.setName("Doctor");
		t1.start();
		
		Thread1 t2 = new Thread1();
		t1.setPriority(1);
		t2.setName("Surgeon");
		t2.start();
		
		Thread2 rt1 = new Thread2(); // The runnable object
		Thread th1 = new Thread(rt1); // the thread object
		th1.setName("Receptionist");
		th1.setPriority(10);
		th1.start();
		
		LabTechnician lb = new LabTechnician();
		Thread th2 = new Thread(lb);
		th2.setName("LabTechnician Sanju:");
		th2.start();
		
		
		System.out.println(Thread.currentThread().getName());
		for(int k=0;k<25;k++) {
			System.out.println(Thread.currentThread().getName() + " k="+k);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {				
			}
		}
		
		

	}

}
