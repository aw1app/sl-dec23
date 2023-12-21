
public class MainProgram {

	public static void main(String[] args) {
		
		Doctor d1 = new Doctor();
		d1.name="Sudhir";
		d1.age = 51.2f;
		
		System.out.println("Doctor's name is     " + d1.name);
		System.out.println("Doctor's age is "+ d1.age);
		
		// demo method invocation
		d1.examinePatient();

	}

}
