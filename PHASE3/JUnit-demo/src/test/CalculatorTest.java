package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.ecommerce.Calculator;

@DisplayName("Calculator class Test cases")
class CalculatorTest {
	
	static Calculator calculator = null;
	
	@BeforeAll
	public static void testAddDoSomeThingBeforeExecutingTheFirstTestCase() {
		System.out.println(" INSIDE BEFORE ALL testAddDoSomeThingBeforeExecutingTheFirstTestCase method\n\n");
		calculator = new Calculator();
	}
	
	@AfterAll
	public static void testAddDoSomeThingAfterExecutingTheLastTestCase() {
		System.out.println(" INSIDE AFTER ALL testAddDoSomeThingAfterExecutingTheLastTestCase method\n\n");
		calculator = null;
	}
	
	@BeforeEach
	public void testAddDoSomeThingBeforeExecutingTestcase() {		
		System.out.println(" INSIDE BEFORE EACH testAddDoSomeThingBeforeExecutingTestcase method\n");
	}
	
	@AfterEach
	public void testAddDoSomeThingAfterExecutingTestcase() {
		System.out.println(" INSIDE AFTER EACH testAddDoSomeThingAfterExecutingTestcase method\n");
		
	}
	
	@Disabled
	@Test
	@DisplayName(" Test case for add method for +,+ inputs")
	public void testAdd1() {		
		System.out.println(" INSIDE testAdd1 method");	
		
		
		int a=7;
		int b=3;
		int expectResult = 10;
		
		int actualResult = calculator.add(a, b);
		
		assertEquals(expectResult, actualResult);		
	}
	
	@Tag(value="important-test")
	@Test
	public void testAddWhenPositiveNegative() {
		System.out.println(" INSIDE testAddWhenPositiveNegative method");

		int a = 10;
		int b = -6;
		int expectedvalue = 4;		

		int result = calculator.add(a, b);

		assertEquals(result, expectedvalue);
	}

}
