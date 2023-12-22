package people.staff; 


public class Doctor {
	// Fields/ Properties / Variables
	public String name;
	public float age;
	
	long[] mobileNos = new long[2];
	
	public Doctor() {		
	}
	
	public Doctor(String name1,float age1 ) {
		this.name=name1;
		this.age=age1;
	}
	
	// Write a constructor that accepts name, age and mobileNos array
	// and do the initialization.
	
	public Doctor(String name1,float age1, long mobileNo1, long mobileNo2) {
		this.name=name1;
		this.age=age1;
		this.mobileNos[0] = mobileNo1;
		this.mobileNos[1] = mobileNo2;
	}
	
	public Doctor(String name1,float age1, long[] mobileNos) {
		this.name=name1;
		this.age=age1;
		this.mobileNos = mobileNos;
	}
	
	// Operations/ Methods
	void surgery(){
		System.out.println("doing surgery..");
	}
	
	public void examinePatient(){
		System.out.println("examining patient..");
	}
	
	public String toString() {		
		return "name is "+this.name + " and age is "+ this.age;		
	}

}
