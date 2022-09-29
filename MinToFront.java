package com.testexercise.bll;

import java.util.ArrayList;
import java.util.Arrays;

public class MinToFront {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3,8,92,4,2,17,9));
		
		System.out.println("Before list :"+list);
		
		int min = minToFront(list);//call minToFront method
		
		list.remove(new Integer(2));//remove 2
		
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
