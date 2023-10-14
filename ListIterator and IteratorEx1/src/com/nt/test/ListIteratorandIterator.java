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
	 List<String> list = new ArrayList<String>();
	 
     list.add("FIRST");

     list.add("SECOND");

     list.add("THIRD");

     ListIterator listIterator = list.listIterator();

     while (listIterator.hasNext())
     {
         //Getting index of next element

         System.out.println(listIterator.nextIndex()+" : "+listIterator.next());
     }

     //        OUTPUT :
     //        0 : FIRST
     //        1 : SECOND
     //        2 : THIRD

     while (listIterator.hasPrevious())
     {
         //Getting index of previous element

         System.out.println(listIterator.previousIndex()+" : "+listIterator.previous());
     }

     //        OUTPUT :
     //        2 : THIRD
     //        1 : SECOND
     //        0 : FIRST

	
	}

}
