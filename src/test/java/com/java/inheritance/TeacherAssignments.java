package com.java.inheritance;

public class TeacherAssignments extends SchoolAssignments{

	public static void main(String[] args) {
		TeacherAssignments obj = new TeacherAssignments();
		obj.displayAssignmentSubject();
		//obj.displayAdditionalAssignments();
		obj.displayResultsDate();
		//protected  methods cane be called using child class object
	}

}
