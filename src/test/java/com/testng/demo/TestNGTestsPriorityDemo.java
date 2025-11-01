package com.testng.demo;

import org.testng.annotations.Test;

public class TestNGTestsPriorityDemo {
	@Test (priority = 4)
	public void firstTest() {
		System.out.println("first test complete");
	}

	@Test (priority = 2)
	public void secondTest() {
		System.out.println("second test complete");
	}

	@Test (priority = 1)
	public void thirdTest() {
		System.out.println("third test complete");
	}

	@Test (priority = 3)
	public void fourthTest() {
		System.out.println("fourth test complete");
	}
}
