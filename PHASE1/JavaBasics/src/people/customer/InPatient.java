package people.customer;

public class InPatient extends Patient{

	int roomId;
	int bedId;
	
	void adminsterMedicine(String med){
		System.out.println(" Gave medicine "+med + " to the in-patient");
	}
	
//	@Override
//	public void disease(){
//		System.out.println("Disease found. It is being treated..");
//	}
	
	@Override
	public void disease(){
		super.disease();
		System.out.println("It is being treated..");
	}
	
}
