/**
 * 
 */
package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Priyanka
 *
 */
public class CalculatorTest {

	/**
	 * Test method for {@link cse360assign3.Calculator#Calculator()}.
	 */
	@Test
	public void testCalculator() {
		Calculator c = new Calculator();
		assertTrue(c != null);
		
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#getTotal()}.
	 */
	@Test
	public void testGetTotal() {
		//Creating a new object of class Calculator
		Calculator c = new Calculator();
		//Get total should return 0 because the default value is set to 0
		assertEquals(0 , c.getTotal());
		//Adding 2 to the total to update its value
		c.add(2);
		//Checking if the value is updated or not
		assertEquals(2 , c.getTotal());
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#add(int)}.
	 */
	@Test
	public void testAdd() {
		//Creating a new object of class Calculator
		Calculator c = new Calculator();
		//Adding 2 to the total
		c.add(2);
		assertEquals(2, c.getTotal());
		//Adding 5 to the total
		c.add(5);
		assertEquals(7, c.getTotal());
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#subtract(int)}.
	 */
	@Test
	public void testSubtract() {
		//Creating a new object of class calculator
		Calculator c = new Calculator();
		//Subtracting 4 from the total
		c.subtract(4);
		assertEquals(-4 , c.getTotal());
		//Subtracting 7 from the total
		c.subtract(7);
		assertEquals(-11 , c.getTotal());
		
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#multiply(int)}.
	 */
	@Test
	public void testMultiply() {
		//Creating a new object of class Calculator
		Calculator c = new Calculator();
		//Multiplying the total by 12
		c.multiply(12);
		assertEquals(0 , c.getTotal());
		//Multiplying the total by 8
		c.multiply(8);
		assertEquals(0, c.getTotal());
		//Adding 4 to the total
		c.add(4);
		assertEquals(4 , c.getTotal());
		//Multiplying the total by 2
		c.multiply(2);
		assertEquals(8, c.getTotal());
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#divide(int)}.
	 */
	@Test
	public void testDivide() {
		//Creating a new object of class Calculator
		Calculator c = new Calculator();
		//Dividing the total by 10
		c.divide(10);
		assertEquals(0 , c.getTotal());
		//Adding 15 to the total
		c.add(15);
		assertEquals(15, c.getTotal());
		//Dividing the total by 3
		c.divide(3);
		assertEquals(5 , c.getTotal());
		//Dividing the total by 0
		c.divide(0);
		assertEquals(0 , c.getTotal());
		
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#getHistory()}.
	 */
	@Test
	public void testGetHistory() {
		//Creating a new object of class Calculator
		Calculator c = new Calculator();
		//getHistory should return empty string as no operations have been performed
		assertEquals("" , c.getHistory());
		//Adding 15 to the total
		c.add(15);
		assertEquals("0 + 15" , c.getHistory());
		//Subtracting 3 from the total
		c.subtract(3);
		assertEquals("0 + 15 - 3" , c.getHistory());
		//Dividing total by 4
		c.divide(4);
		assertEquals("0 + 15 - 3 / 4" , c.getHistory());
		//Multiplying total by 2
		c.multiply(2);
		assertEquals("0 + 15 - 3 / 4 * 2" , c.getHistory());
	
	}

}
