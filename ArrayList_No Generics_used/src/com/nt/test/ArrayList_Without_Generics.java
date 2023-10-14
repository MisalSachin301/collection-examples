/* If generics are not used, ArrayList can hold any type of objects.*/

package com.nt.test;

import java.util.ArrayList;

public class ArrayList_Without_Generics {

	public static void main(String[] args) {
		      
		 ArrayList list = new ArrayList();     //ArrayList without generics
		 
	        list.add("ZERO");    //adding string type object
	 
	        list.add(1);        //adding primitive int type
	 
	        list.add(20.24);    //adding primitive double type
	 
	        list.add(new Float(23.56));   //Adding Float wrapper type object
	 
	        list.add(new Long(25));      //Adding Long wrapper type object
	 
	        System.out.println(list);     //Output : [ZERO, 1, 20.24, 23.56, 25]
	}
}
