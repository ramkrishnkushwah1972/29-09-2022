package com.testexercise.bll;
import java.util.Comparator;

public class StateComparator implements Comparator<Student>{

		@Override
		public int compare(Student std1, Student std2) {
			String state1 = std1.getState();
			String state2 = std2.getState();

			return state1.compareTo(state2);
			
		}

	}


