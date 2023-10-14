/*You can traverse an ArrayList in both the 
 * directions – forward and backward using ListIterator.*/

package com.nt.test;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_Forward_Backward_Elements_Traverse {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
        
        list.add("ONE");
         
        list.add("TWO");
         
        list.add("THREE");
         
        list.add("FOUR");
         
        ListIterator iterator = list.listIterator();
         
        System.out.println("Elements in forward direction");
         
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
         
        System.out.println("Elements in backward direction");
         
        while (iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }

	}

}
