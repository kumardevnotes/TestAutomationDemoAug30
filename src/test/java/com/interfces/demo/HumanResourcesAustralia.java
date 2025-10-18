package com.interfces.demo;

public class HumanResourcesAustralia implements EmployerInterface{

	public static void main(String[] args) {
		HumanResourcesAustralia obj = new HumanResourcesAustralia();
		obj.displayHolidays();
		System.out.println(obj.getEmployeeBonus());
		obj.displayIncentive(1500);
		obj.displayIncentive(1000);
	}

	@Override
	public void displayHolidays() {
		System.out.println("There are 10 holidays delcared for Australia branch You will expect an emil on the holidsys list soon!");
	}

	@Override
	public int getEmployeeBonus() {
		return 5000;
	}

	@Override
	public void displayIncentive(int incentive) {
		System.out.println("We are happy to give "+ incentive + "$ as an incentive for this month :)");
	}

}
