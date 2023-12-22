package people.staff; 


public class Doctor {
	// Fields/ Properties / Variables
	public String name;
	public float age;
	
	public Doctor() {		
	}
	
	public Doctor(String name1,float age1 ) {
		this.name=name1;
		this.age=age1;
	}
	
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
