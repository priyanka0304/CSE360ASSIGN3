package cse360assign3;

/** 
 * 
 * @author Priyanka
 * @version Feb 18, 2016
 *
 */

/** Class calculator performs 4 types of operations addition, 
 * subtraction, multiplication and division and also returns the history
 */
public class Calculator {

	private int total;
	
	/** Constructor of class Calculator **/
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	
	/** 
	 * @return sum **/
	public int getTotal () {
		return total;
	}
	
	/** Addition operation
	 * @param operand **/
	public void add (int value) {
		total = total + value;
	}
	
	/** Subtraction operation
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/** Multiplication operation
	 * 
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/** Division operation
	 * 
	 * @param value
	 */
	public void divide (int value) {
		//if divisor is 0 then total becomes 0 - handling division by 0
		if(value == 0)
			total = 0;
		else
			total = total / value;
	}
	
	/** To get the history
	 * 
	 * @return history
	 */
	public String getHistory () {
		return "";
	}
}
