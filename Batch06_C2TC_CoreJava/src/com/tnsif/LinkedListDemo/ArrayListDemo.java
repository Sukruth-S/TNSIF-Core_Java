package com.tnsif.LinkedListDemo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator; // is an object which is used to traverse(visiting each and every elements once) 
							//each elements (Forward)
import java.util.ListIterator;// is an object which is used to traverse(visiting each and every elements once) 
								//each elements (Forward & Backward)

public class ArrayListDemo {
public static void main(String[] args) {
		
		List list1 = new ArrayList(); // created a empty raw ArrayList
		System.out.println("Size: "+list1.size()); // returns the number of elements in the list
		System.out.println("is list empty?" +list1.isEmpty());// check if the list is empty(return in boolean)
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("Hello");
		list1.add(56.78);
		list1.add(20);
		list1.add('A');
		list1.add(5, "Hi");
System.out.println("List is "+list1);
		
		System.out.println("Is list contains 15?" +list1.contains(15)); // checck trhe value of 15
		
		list1.remove(false); // removes the first occurence of the specified element
		System.out.println("List is "+list1);
		
		System.out.println("Element at 5 location is :"+list1.get(5));
		System.out.println("Element removed:"+list1.remove(list1.lastIndexOf(20))); // removes 20 last
		System.out.println("Element removed:"+list1.remove(list1.indexOf(20)));
// removes 20 first
		
		System.out.println("List is"+list1);

	}
}
