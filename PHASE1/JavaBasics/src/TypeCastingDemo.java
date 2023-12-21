
public class TypeCastingDemo {

	public static void main(String[] args) {
		// Implicit type casting
		
		int x=6;
		
		float y;
		
		y=x;
		
		// Explicit type casting
		long a = 107877777760L;
		int b;
		
		// b=a; type casting error, compiler will not allow compilation of our program
		
		b = (int) a;
		
		System.out.printf("long a = %s \n" , a);
		System.out.printf("int b = %s \n" , b);
		
		
		boolean b1=true;
		int b2;
		
		// b2=(boolean) b1;
		
		int b3 = 10;
		char c1;
		
		c1 =(char) b3;

	}

}
