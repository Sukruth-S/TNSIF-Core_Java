package com_tnsif_constructor;

public class ConstructorDemo {
	public static void main(String [] args) {
		 System.out.println("Creating a Person object using the default constructor:");
	        Person person1 = new Person();
	        System.out.println(person1.toString());
	        

//	         Using the parameterized constructor
	        System.out.println("Creating a Person object using the parameterized constructor:");
	        
	        Person person2 = new Person("Ram", 101, "Bengaluru");
	        System.out.println(person2.toString());
	}
}
