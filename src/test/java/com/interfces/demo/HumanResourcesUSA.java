package com.interfces.demo;

public class HumanResourcesUSA implements EmployerInterface{

	// class extends another class
	// class implements another interface
	public static void main(String[] args) {
		HumanResourcesUSA obj = new HumanResourcesUSA();
		obj.displayHolidays();
		System.out.println(obj.getEmployeeBonus());
		obj.displayIncentive(500);
	}

	@Override
	public void displayHolidays() {
		System.out.println("Holidays updates are Coming Soon!");
	}

	@Override
	public int getEmployeeBonus() {
		return 2000;
	}

	@Override
	public void displayIncentive(int incentive) {
		System.out.println("Incetnive is " + incentive + "$");
	}

}
