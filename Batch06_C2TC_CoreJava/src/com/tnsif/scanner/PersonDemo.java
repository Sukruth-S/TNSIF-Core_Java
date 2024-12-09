package com.tnsif.scanner;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
//		Person person1 = new Person();
//		person1.setAge(20);
//		person1.setName("Virat");
//		person1.setGender("Male");
//		person1.setIncome(18000f);
//		
//		System.out.println(person1);
//		
//		
//		Person person2 = new Person(21,"Sukruth",3455.00f,"Male");
//		System.out.println(person2);
		
		
		//Initialize the object through user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the person");
		String name = sc.next();
		System.out.println("Enter the age of the person");
		int age = sc.nextInt();
		System.out.println("Enter the gender of the person");
		String gender = sc.next();
		System.out.println("Enter the salary ");
		float salary = sc.nextFloat();
		
	}

}
