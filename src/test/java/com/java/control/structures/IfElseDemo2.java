package com.java.control.structures;

public class IfElseDemo2 {

	public static void main(String[] args) {
		
		// in if..else control structure, if is mandatory and else is optional
		
		int empSal = 1500;
		
		if(empSal > 3000) { // 1500 > 3000 --> false
			System.out.println("Emp has to pay 30% tax");
		}
		else if(empSal > 2000){ //1500 > 2000 --> false
			System.out.println("Emp has to pay 20% tax");
		}
		else {
			System.out.println("Emp has to pay no tax");
		}
	}

}
