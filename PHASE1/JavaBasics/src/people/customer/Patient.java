package people.customer; 

public class Patient {
	String name;
	float age;
	int id;
	
	public Patient() {
		
	}
			
	public Patient(int id, String name,float age) {
		this.name=name;
		this.age=age;
		this.id=id;
	}
	
	public void disease(){
		System.out.println("Disease found..");
	}
	
	public void prescription(){
		System.out.println("Prescribed..");
	}

}