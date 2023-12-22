import java.util.Scanner;

import people.customer.Patient;
import people.staff.Doctor;

public class MainProgram {

	public static void main(String[] args) {
		
		// Demo creating Doctor object
		Doctor d0 = new Doctor("Sid",101);
		Doctor d1 = new Doctor();
		
		// Create a doctor whose has 2 mobiles		
		long[] mobiles = {9464664646L,464646466L};  
		Doctor d2 = new Doctor("Jimmy",23, mobiles);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter doctor's name :");
		d1.name=sc.nextLine();
		System.out.println("Enter doctor's age :");
		d1.age = sc.nextFloat();
				
//		d1.name="Sudhir";
//		d1.age = 51.2f;
//		
//		System.out.println("Doctor's name is     " + d1.name);
//		System.out.println("Doctor's age is "+ d1.age);
		
		System.out.println(d1.toString());
		
		// demo method invocation
		d1.examinePatient();
		
		
		//Demo creating Patient object
		Patient p= new Patient();
		p.name="xyz";
		
		p.disease();
		
		
		sc.close();
	}

}
