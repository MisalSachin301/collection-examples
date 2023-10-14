/* Using Iterator, you can traverse List, Set and Queue type of objects. 
 But using ListIterator, you can traverse only List objects.
*/
package com.nt.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ListIteratorandIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		 
        list.add("FIRST");
 
        list.add("SECOND");
 
        list.add("THIRD");
 
        //Traversing list elements in forward direction using Iterator
 
        Iterator iterator = list.iterator();
 
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
 
        //        OUTPUT :
        //        FIRST
        //        SECOND
        //        THIRD
 
        //Traversing list elements in forward direction using ListIterator
 
        ListIterator listIterator = list.listIterator();
 
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
 
        //        OUTPUT :
        //        FIRST
        //        SECOND
        //        THIRD
 
        //Traversing list elements in backward direction using ListIterator
 
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
 
        //        OUTPUT :
        //        THIRD
        //        SECOND
        //        FIRST

	}

}
