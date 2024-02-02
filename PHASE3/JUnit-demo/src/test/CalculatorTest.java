package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ecommerce.Calculator;

class CalculatorTest {
	
	@Test
	@DisplayName(" Test case for add method for +,+ inputs")
	public void testAdd1() {
		
		Calculator calculator = new Calculator();
		
		int a=7;
		int b=3;
		int expectResult = 10;
		
		int actualResult = calculator.add(a, b);
		
		assertEquals(expectResult, actualResult);
		
	}

}
