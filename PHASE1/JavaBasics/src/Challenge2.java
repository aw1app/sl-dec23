
public class Challenge2 {

	public static void main(String[] args) {
		Doctor d1 = new Doctor();

		d1.name = "abc";
		d1.age = 28.4f;

		Doctor d2 = new Doctor();
		d2.name = "xyz";
		d2.age = 25.2f;

		if (d1.age > d2.age) {
			System.out.println(d1.name + " has highest age");
		} else
			System.out.println(d2.name + " has highest age");

	}

}
