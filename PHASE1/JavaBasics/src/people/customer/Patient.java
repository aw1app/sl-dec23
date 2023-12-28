package people.customer; 

public class Patient {
	public String name;
	public float age=0;
	int id;
	public int discount=0;
	
	public Patient() {
		
	}
			
	public Patient(int id, String name,float age) {
		System.out.println("Inside Patient constructor ");
		this.name=name;
		this.age=age;
		this.id=id;
	}
	
	public void disease(){
		System.out.println(name + ": Disease found..");
	}
	
	public void prescription(){
		System.out.println("Prescribed..");
	}

}