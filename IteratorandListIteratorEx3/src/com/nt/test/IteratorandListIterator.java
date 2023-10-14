package com.nt.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorandListIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		 
        list.add("FIRST");
 
        list.add("SECOND");
 
        list.add("THIRD");
 
        list.add("FOURTH");
 
        list.add("FIFTH");
 
        //Iterating list from index 2 using ListIterator
 
        ListIterator<String> listIterator = list.listIterator(2);
 
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
 
        //        OUTPUT :
        //        THIRD
        //        FOURTH
        //        FIFTH


	}

}
