package people.staff; 


public class Doctor {
	// Fields/ Properties / Variables
	String name;
	float age;
	
	// Operations/ Methods
	void surgery(){
		System.out.println("doing surgery..");
	}
	
	void examinePatient(){
		System.out.println("examining patient..");
	}
	
	public String toString() {		
		return "name is "+this.name + " and age is "+ this.age;		
	}

}
