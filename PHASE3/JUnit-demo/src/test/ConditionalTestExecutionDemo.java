package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import com.ecommerce.Calculator;

public class ConditionalTestExecutionDemo {
	
	@Test
	@EnabledOnOs({ OS.WINDOWS })
	public void testAddOnWindows() {
		
		System.out.println("INSIDE testAddOnWindows");
		
		Calculator cal = new Calculator();

		int x = 2;
		int y = 5;

		assertEquals(7, cal.add(x, y));
	}

}
