/*If you know the element, you can retrieve the position of that element.*/

package com.nt.test;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		
		 ArrayList<String> list = new ArrayList<String>();
		 
	        //Adding elements to ArrayList
	 
	        list.add("First");
	 
	        list.add("Second");
	 
	        list.add("Third");
	 
	        list.add("Fourth");
	 
	        System.out.println(list);    //Output : [First, Second, Third, Fourth]
	 
	        //Retrieving position of "Second" element
	 
	        System.out.println(list.indexOf("Second"));     //Output : 1
	
	}

}
