/* You can define ArrayList as re-sizable array. Size of the ArrayList is not fixed. ArrayList can grow and shrink dynamically.
*/

package com.nt.test;

import java.util.ArrayList;

public class Array_List_Dynamically_Growable {

	public static void main(String[] args) {
		      
		 ArrayList<String> list = new ArrayList<String>();
		 
	        list.add("ONE");
	 
	        list.add("TWO");
	 
	        list.add("THREE");
	 
	        System.out.println(list.size());     //Output : 3
	 
	        //Inserting some more elements
	        list.add("FOUR");
	 
	        list.add("FIVE");
	 
	        System.out.println(list.size());    //Output : 5
	 
	        //Removing an element
	        list.remove("TWO");
	 
	        System.out.println(list.size());    //Output : 4


	}

}
