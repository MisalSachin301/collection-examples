/*As ArrayList implements RandomAccess, you can get,
 *  set, insert and remove elements of the ArrayList from  any arbitrary position.*/

package com.nt.test;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		 
        //Adding elements to ArrayList
 
        list.add(10);
 
        list.add(20);
 
        list.add(30);
 
        list.add(40);
 
        System.out.println(list);     //Output : [10, 20, 30, 40]
 
        //Retrieving element at index 2
 
        System.out.println(list.get(2));     //Output : 30
 
        //Setting value of element at index 2
 
        list.set(2, 2222);
 
        System.out.println(list);      //Output : [10, 20, 2222, 40]
 
        //Inserting element at index 1
 
        list.add(1, 1111);
 
        System.out.println(list);     //Output : [10, 1111, 20, 2222, 40]
 
        //Removing element from index 3
 
        list.remove(3);
 
        System.out.println(list);    //Output : [10, 1111, 20, 40]
	
	}

}
