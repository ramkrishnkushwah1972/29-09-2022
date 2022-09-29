package com.testexercise.bll;
import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

		@Override
		public int compare(Student std1, Student std2) {
			String name1 = std1.getStudentName();
			String name2 = std2.getStudentName();

			return name1.compareTo(name2);
			
		}

	}


