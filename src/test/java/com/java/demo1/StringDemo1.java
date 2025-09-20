package com.java.demo1;

public class StringDemo1 {
	
	public static void main(String[] args) {
		//A String in java is collection of alphabet or chars
		String empName = "John Legend";
		/*
		 * empName[0] = J
		 * empName[1] = o
		 * empName[2] = h
		 * empName[3] = n
		 * empName[4] = 
		 * empName[5] = L
		 * empName[6] = e
		 * empName[7] = g
		 * empName[8] = e
		 * empName[9] = n
		 * empName[10] = d Or empName[empName.length()-1] = d
		 * 
		 * empName.length() = 11
		 * String empName = "John Legend";
		 * */
		
		System.out.println(empName.toLowerCase());
		System.out.println("  **********  ");
		System.out.println(empName.toUpperCase());
		System.out.println("  **********  ");
		System.out.println(empName.charAt(10));
		System.out.println("  **********  ");
		System.out.println(empName.startsWith("John"));
		System.out.println("  **********  ");
		System.out.println(empName.endsWith("theend"));
		System.out.println("  **********  ");
		System.out.println(empName.equals("John"));
		System.out.println("  **********  ");
		System.out.println(empName.equals("John Legend"));
		System.out.println("  **********  ");
		System.out.println(empName.equalsIgnoreCase("john legend"));
		System.out.println("  **********  ");
		System.out.println(empName.concat(" is really a legend!!!"));
		System.out.println("  **********  ");
		System.out.println(empName.isEmpty());
		System.out.println("  **********  ");
		System.out.println(empName.length());
		System.out.println("  **********  ");
		System.out.println(empName.replace('e', 'X'));
		System.out.println("  **********  ");
		System.out.println(empName.indexOf("Legend"));
		
		System.out.println("  ++++++++++++++++++++  ");
		
		System.out.println(100 + 200); // 300 --> Integer
		
		System.out.println("100" + "200"); // 100200 --> String
	
		System.out.println(100 + "200"); //100200 --> String
		
		System.out.println("ABC" + "-" + "XYZ");
	}

}
