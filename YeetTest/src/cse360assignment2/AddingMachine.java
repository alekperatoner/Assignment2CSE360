package cse360assignment2;

/**
 * @author Alek's PC
 *
 *This is a class for an Adding Machine object.
 *It's meant to change the value of a number
 */
public class AddingMachine {
	
	/**
	 * the total of the number being operated on
	 */
	  private int total;
	  private String totalString;
	  
	  /**
	   * creates a new AddingMachine object
	   * with a total of 0
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    totalString = "0";
	  }
	  
	  /**
	   * Gets the total of this object
	   * @return the total
	   */
	  public int getTotal () {
	    return total;
	  }
	  
	  /**
	   * Adds the value to the overall total
	   * @param value Should be an int
	   */
	  public void add (int value) {
		  total = total + value;
		  totalString = totalString + " + " + value;
	  }

	  /**
	   * Subtracts the value from the overall total
	   * @param value Should be an int
	   */
	  public void subtract (int value) {
		  total = total - value;
		  totalString = totalString + " - " + value;
	  }

	  /**
	   * outputs the total and all numbers added/subtracted so far
	   */
	  public String toString () {
	    return totalString;
	  }

	  /**
	   * resets memory
	   */
	  public void clear() {
		  System.gc();
	  }
	}