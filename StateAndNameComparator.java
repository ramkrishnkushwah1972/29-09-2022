package com.testexercise.bll;
import java.util.Comparator;

public class StateAndNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		String state1 = student1.getState();
		String state2 = student2.getState();
		String name1 = student1.getStudentName();
		String name2 = student2.getStudentName();
	
		if(state1.compareTo(state2)==0) {
			if(name1.compareTo(name2)==0) {
				return 0;
			}
			else if(name1.compareTo(name2) >0) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else if(state1.compareTo(state2)>0) {
			if(name1.compareTo(name2)==0) {
				return 0;
			}
			else if(name1.compareTo(name2) >0) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}
	}
}
		


