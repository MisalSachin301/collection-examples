/* Elements can be inserted at or deleted from a particular position.*/

package com.nt.test;

import java.util.ArrayList;

public class Array_List_Dynamically_Growable {

	public static void main(String[] args) {
		     
		 ArrayList<String> list = new ArrayList<String>();
		 
	        list.add("ZERO");
	 
	        list.add("TWO");
	 
	        list.add("FOUR");
	 
	        System.out.println(list);     //Output : [ZERO, TWO, FOUR]
	 
	        list.add(2, "THREE");       //Inserting an element at index 2
	 
	        list.add(1, "ONE");     //Inserting an element at index 1
	 
	        System.out.println(list);    //Output : [ZERO, ONE, TWO, THREE, FOUR]
	 
	        list.remove(3);       //Removing an element from index 3
	 
	        System.out.println(list);    //Output : [ZERO, ONE, TWO, FOUR]

	}

}
