/* ArrayList can hold multiple null elements.*/

package com.nt.test;

import java.util.ArrayList;

public class ArrayList_Null_ElementsEx {

	public static void main(String[] args) {
		
		 ArrayList<Integer> list = new ArrayList<Integer>();     
		 
	        list.add(100);
	 
	        list.add(null);
	 
	        list.add(null);
	 
	        System.out.println(list);     //Output : [100, null, null]


	}

}
