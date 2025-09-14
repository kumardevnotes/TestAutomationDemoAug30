package com.test;

public class MyStringDemo2 {

	public static void main(String[] args) {
		String city1 = "Newyork", city2 = "NewJersy";
		System.out.println(city1 + " " + city2);

		// String city1 = "Newyork"; // 7 chars // String always stores values starting from  position 0
		// city1[0] = N
		// city1[1] = e
		// city1[2] = w
		// city1[3] = y
		// city1[4] = o
		// city1[5] = r
		// city1[6] = k // the position of last char in a given string is always lenth -1

		System.out.println(city1.toUpperCase());
		System.out.println(city1.toLowerCase());
		System.out.println(city1.charAt(4));
		System.out.println(city1.contains(city2)); // NewyorkIsGreat contains Newyork
		System.out.println(city1.equals(city2));
		System.out.println(city1.startsWith("New"));
		System.out.println(city1.endsWith("york"));
		System.out.println(city1.isEmpty());
		System.out.println(city1.replace('N', 'O'));
		System.out.println(city1.length());
	}
}
