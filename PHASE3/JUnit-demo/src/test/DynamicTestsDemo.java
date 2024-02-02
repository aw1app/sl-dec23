package test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import com.ecommerce.Calculator;

class DynamicTestsDemo {

	@TestFactory
	Collection<DynamicTest> dynamicTests() {
		
		Collection<DynamicTest> dynamicTests = new ArrayList<DynamicTest>();
		
		for (int i = 0; i < 50; i++) {
			int x=i;
			dynamicTests.add(
					dynamicTest("Dynamic test for a="+x, () -> assertTrue(7 == new Calculator().add(x, 5)))
					);
		}

		return dynamicTests;
	}

}
