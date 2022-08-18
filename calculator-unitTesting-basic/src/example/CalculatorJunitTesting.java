package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorJunitTesting {

//	@Test
//	void test() {
//		fail("Not yet implemented");	
//	}

	@Test
	void testAddMethod() {
		Main testing = new Main();

		int output = testing.add(5, 5);
		// will pass
		assertEquals(10, output);
		// will fail
		// assertEquals(4, output);

	}

	@Test
	void testSubtractMethod() {
		Main testing = new Main();
		
		int output = testing.subtract(100, 90);
		
		assertEquals(10, output);

	}

	@Test
	void testMultiplyMethod() {
		Main testing = new Main();
		
		int output = testing.multiply(10, 10);
		
		assertEquals(100, output);

	}

	@Test
	void testDivideMethod() {
		Main testing = new Main();
		
		int output = testing.divide(500, 5);
		
		assertEquals(100, output);

	}

}
