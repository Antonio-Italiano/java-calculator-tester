package org.java.calcTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.Random;

import org.junit.jupiter.api.RepeatedTest;

public class CalculatorTest {		
	
	Calculator c = new Calculator();
	Random rnd = new Random();
	
		@RepeatedTest(10)
		public void addTest() throws Exception{
			
			final float num1 = rnd.nextFloat(0, 100);
			final float num2 = rnd.nextFloat(0, 100);
			
			final float attRes = num1 + num2;
			final float res = c.add(num1, num2);
			
			assertEquals(attRes, res, "addizione tra float");
	}
		
		@RepeatedTest(10)
		public void subtractTest() throws Exception{
			final float num1 = rnd.nextFloat(0, 100);
			final float num2 = rnd.nextFloat(0, 100);
			
			final float attRes = num1 - num2;
			final float res = c.subtract(num1, num2);
			
			assertEquals(attRes, res, "sottrazzione tra float");
	}
		
		@RepeatedTest(10)
		public void divideTest() throws Exception{
			final float num1 = rnd.nextFloat(0, 100);
			final float num2 = rnd.nextFloat(0, 100);
			
			assumeTrue(num2 != 0.00);
			
			final float attRes = num1 / num2;
			final float res = c.divide(num1, num2);
			
			assertEquals(attRes, res, "divisione tra float");
	}
		@RepeatedTest(10)
		public void divideExcTest() {
			
			final float num1 = rnd.nextFloat(0, 100);
			final float num2 = rnd.nextFloat(0, 100);
			
			assumeTrue(num2 == 0.00);
			
			assertThrows(Exception.class,
					() -> c.divide(num1, num1),
					"Deve sollevare eccezione");
		}
		
		@RepeatedTest(10)
		public void multiplyTest() throws Exception{
			
			final float num1 = rnd.nextFloat(0, 100);
			final float num2 = rnd.nextFloat(0, 100);
			
			final float attRes = num1 * num2;
			final float res = c.multiply(num1, num2);
			
			assertEquals(attRes, res, "moltiplicazione tra float");
	}
}
