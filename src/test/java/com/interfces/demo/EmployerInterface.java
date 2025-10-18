package com.interfces.demo;

public interface EmployerInterface {
	
	/*interface is similar to  class  where it contains abstract methods 
	 * that means methods with signature but without body
	 * 
	 */
	
	//Below is example for abstract Method
	public void displayHolidays();
	
	//Below is one more abstract method getEmployeeBonus()
	public int getEmployeeBonus();
	
	//Below is another abstract method with one Param
	public void displayIncentive(int incentive);

}
