/* Many are of the assumption that multiple insertion and removal operations on ArrayList will decrease the performance of an application.
 *  But, there will be no significant change in the performance of an application if you use ArrayList instead of arrays.
 *   Below example shows time taken to add 1000 string elements to ArrayList and array.*/

package com.nt.test;

import java.util.ArrayList;

public class ArrayList_Insert_Delete_Time {

	public static void main(String[] args) {
		
		String[] namesArray = new String[1000];
		 
        long startTime = System.currentTimeMillis();
 
        for (int i = 0; i < namesArray.length; i++)
        {
            namesArray[i] = "Name"+i;
        }
 
        long endTime = System.currentTimeMillis();          
 
        System.out.println("Time taken by Array : "+(endTime - startTime)+"ms");
 
        ArrayList<String> nameList = new ArrayList<String>();     
 
        startTime = System.currentTimeMillis();
 
        for (int i = 0; i <= 1000; i++)
        {
            nameList.add("Name"+i);
        }
 
        endTime = System.currentTimeMillis();
 
        System.out.println("Time taken by ArrayList : "+(endTime-startTime)+"ms");

	}

}
