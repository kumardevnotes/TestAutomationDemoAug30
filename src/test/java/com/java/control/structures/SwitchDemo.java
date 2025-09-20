package com.java.control.structures;

public class SwitchDemo {

	public static void main(String[] args) {

		String workingDay = "Sunday";

		switch (workingDay) { 
		case "Monday":
			System.out.println("Its Monday and workingday!");
			break;
		case "Tuesday":
			System.out.println("Its Tueday and workingday!");
			break;
		case "Wedneday":
			System.out.println("Its Wednesday and workingday!");
			break;
		case "Thursday":
			System.out.println("Its Thursday and workingday!");
			break;
		case "Friday":
			System.out.println("Its Friday and workingday!");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("Enjoy..Its a holiday!");
		}
	}

}
