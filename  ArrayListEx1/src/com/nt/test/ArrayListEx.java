/*Size of the ArrayList is not fixed. 
It can increase and decrease dynamically as we add or delete the elements
*/

package com.nt.test;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		//ArrayList with no size defined
		 
        ArrayList<Integer> list = new ArrayList<>();
 
        //Adding elements to ArrayList
 
        list.add(10);
 
        list.add(20);
 
        list.add(30);
 
        list.add(40);
 
        System.out.println(list.size());     //Output : 4
 
        //Removing an element at index 0
 
        list.remove(0);
 
        System.out.println(list.size());    //Output : 3

	}

}
