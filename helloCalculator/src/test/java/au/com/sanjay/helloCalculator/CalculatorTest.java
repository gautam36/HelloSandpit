package au.com.sanjay.helloCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator myCalculator = new Calculator();
		double result = myCalculator.add(10.1, 20.3);
		assertEquals(30.40, result, 2);
	}
	
	@Test
	public void testSubstract() {
		Calculator myCalculator = new Calculator();
		double result = myCalculator.substract(10.1, 20.3);
		assertEquals(-10.20, result, 2);
	}

}
