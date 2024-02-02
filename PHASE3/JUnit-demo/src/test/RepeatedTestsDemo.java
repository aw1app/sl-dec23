package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

import com.ecommerce.Calculator;

public class RepeatedTestsDemo {
	
	@RepeatedTest(5)
	void testAddPositiveValues() {

		Calculator cal = new Calculator();

		int a = 2;
		int b = 5;

		assertTrue(7 == cal.add(a, b));
	}

}
