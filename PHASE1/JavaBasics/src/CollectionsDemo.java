import java.util.*;

import people.customer.Patient;
import people.staff.Doctor;

public class CollectionsDemo {

	public static void main(String[] args) {

		List doctorList = new LinkedList();

		Doctor d0 = new Doctor("Sid", 101);
		Doctor d1 = new Doctor("Monish", 55);
		Doctor d2 = new Doctor("Tanveer", 33);

		long[] mobiles1 = { 9464664646L, 464646466L };
		Doctor d3 = new Doctor("Jimmy", 4, mobiles1);
		long[] mobiles2 = { 9464664646L, 464646466L };
		Doctor d4 = new Doctor("Binny", 23, mobiles2);

		doctorList.add(d0);
		doctorList.add(d1);
		doctorList.add(d2);
		doctorList.add(d3);
		doctorList.add(d4);

		Patient p = new Patient();
		doctorList.add(p);

		//
		System.out.printf("There are %s doctors in the doctorList \n", doctorList.size());

		doctorList.remove(d2);

		System.out.printf("There are %s doctors in the doctorList \n", doctorList.size());

		// Looping through all the doctor
		System.out.println("\n Approach 1 Looping a list demo");
		for (int i = 0; i < doctorList.size(); i++) {
			if (doctorList.get(i) instanceof Doctor)
				System.out.printf("Doctor name %s age %s \n", ((Doctor) doctorList.get(i)).name,
						((Doctor) doctorList.get(i)).age);
		}

		System.out.println("\n Approach 2 Looping a list demo");
		for (Object d : doctorList) {
			if (d instanceof Doctor) {
				Doctor doc = (Doctor) d;
				System.out.printf("Doctor name %s age %s \n", doc.name, doc.age);
			}
		}
		;

		List<Doctor> doctorList1 = new ArrayList<Doctor>();

		doctorList1.add(d0);
		doctorList1.add(d1);
		doctorList1.add(d2);
		doctorList1.add(d3);
		doctorList1.add(d4);

		// doctorList1.add(p);

		System.out.println("\n Approach 1 Looping a list demo");
		for (int i = 0; i < doctorList1.size(); i++)
			System.out.printf("Doctor name %s age %s \n", doctorList1.get(i).name, doctorList1.get(i).age);

		System.out.println("\n Approach 2 Looping a list demo");
		for (Doctor d : doctorList1) {
			System.out.printf("Doctor name %s age %s \n", d.name, d.age);
		}
		;

		System.out.println("\n Approach 3 Looping a list demo");
		doctorList1.forEach(d -> {
			System.out.printf("Doctor name %s age %s \n", d.name, d.age);
		});

//		List<String> doctorNamesList= new ArrayList<String>();	
//		doctorNamesList.add("Santosh");

		// Sort the doctors by age
		doctorList1.sort((doc1, doc2) -> (int) (doc1.age - doc2.age));

		System.out.println("\n doctorList1 Sorted by Age");
		for (Doctor d : doctorList1) {
			System.out.printf("Doctor name %s age %s \n", d.name, d.age);
		}
		;

		// Sort the doctors by name
		doctorList1.sort((doc1, doc2) -> doc1.name.compareTo(doc2.name));

		System.out.println("\n doctorList1 Sorted by name");
		for (Doctor d : doctorList1) {
			System.out.printf("Doctor name %s age %s \n", d.name, d.age);
		}

	}

}
