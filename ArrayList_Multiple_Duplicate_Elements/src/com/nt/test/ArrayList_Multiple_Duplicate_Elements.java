/*ArrayList can hold multiple duplicate elements*/

package com.nt.test;

import java.util.ArrayList;

public class ArrayList_Multiple_Duplicate_Elements {

	public static void main(String[] args) {
		
		 ArrayList<Integer> list = new ArrayList<Integer>();     
		 
	        list.add(100);
	 
	        list.add(100);
	 
	        list.add(100);
	 
	        System.out.println(list);     //Output : [100, 100, 100]


	}

}
