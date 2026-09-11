package com.Abstraction;
//.Create a parent class Student with method calculateGrade().
//Create child classes EngineeringStudent, MedicalStudent, ManagementStudent overriding it with their own grading criteria.
//Accept marks from user.
//Use a parent class reference to hold child objects.
//Demonstrate runtime polymorphism by calling calculateGrade().

public interface Student {
	
	//marks 
	//choices
	//name
	  void calculateGrade(String name,int marks);

	
}
