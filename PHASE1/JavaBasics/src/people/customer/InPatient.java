package people.customer;

public class InPatient extends Patient{

	int roomId;
	int bedId;
	
	void adminsterMedicine(String med){
		System.out.println(" Gave medicine "+med + " to the in-patient");
	}
	
	@Override
	public void disease(){
		System.out.println("Disease found. It is being treated..");
	}
	
}
