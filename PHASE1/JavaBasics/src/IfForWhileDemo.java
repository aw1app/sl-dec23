import java.util.Scanner;

public class IfForWhileDemo {

	public static void main(String[] args) {
		int x = 10;
		float y = 5.5f;

		// Logic demo
		if (x < y) {
			System.out.println(x + " is less than " + y);
		} else {
			System.out.println(x + " is greater than " + y);
		}
		;

		// Looping demo
		System.out.println("\n Looping demo");
		for (int i = 0; i < 5; i++) {
			System.out.println("i=" + i);
		}

		Scanner sc = new Scanner(System.in);
		// Looping demo with break
		System.out.println("\n Looping demo with break");
		for (int i = 0; i < 50; i++) {
			
			System.out.println("Enter some number :");
			int n = sc.nextInt();
			if (n == 7)
				break;

			System.out.println("i=" + i);
		}

		// Looping demo with continue
		System.out.println("\n Looping demo with continue");
		for (int i = 0; i < 10; i++) {			
			System.out.println("hello i= " + i);
			
			if (i % 2 == 0)	
				continue;

			System.out.println("bye i= " + i);
		}

		System.out.println("DONE");

	}

}
