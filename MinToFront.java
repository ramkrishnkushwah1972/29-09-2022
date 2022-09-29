/*
	Write a method minToFront that takes an ArrayList of integers as a parameter and that moves the 
	minimum value in the list to the front, otherwise preserving the order of the elements. 
**	For example, if a list stores the following values: {3, 8, 92, 4, 2, 17, 9} and you make 
	this call: minToFront(list); it should store the following values after the call: {2, 3, 8, 92, 4, 17, 9} 
	You may assume that the list stores at least one value
*/
package com.testexercise.bll;

import java.util.ArrayList;
import java.util.Arrays;

public class MinToFront {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3,8,92,4,2,17,9));
		
		System.out.println("Before list :"+list);
		
		int min = minToFront(list);//call minToFront method
		
		list.remove(new Integer(min));//remove minimum number
		
		list.add(0,min);//add min number at first position
		
		System.out.println("After list"+list);

	}
	public static int minToFront(ArrayList<Integer> list) {
		
		int minimum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (minimum > list.get(i))
                minimum = list.get(i);
        }
        return minimum;
	}

}
