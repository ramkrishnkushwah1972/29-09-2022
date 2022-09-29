/*	2.	Create an ArrayList object students, and store the following students in that list.

		Studen
			studentcode
			studentname
			age
			state

Student Code	Student Name	Age	State
AF0216223	Aryan Raj	21	Andra Pradhesh
AF0216224	Bivor Kumar	22	Andra Pradhesh
AF0216227	SUSHMITA KUMARI	23	Madhya Pradesh
AF0216231	Ragiv Zafar	24	Maharashtra
AF0216232	RAHUL MAHTO	25	Orissa
AF0216234	Nainsi Kumari	19	Gujarath
AF0216236	MD ALI	26	Madhya Pradesh
AF0216238	ABHISHEK KUMAR	22	Andra Pradhesh
AF0216240	AFROZ ANSARI	21	Maharashtra
AF0216259	RITIK RAJ	20	Orissa
AF0216263	Anant Kumar	25	Andra Pradhesh
AF0216305	BABU KUMAR	24	Gujarath
AF0216307	NIKITA KUMARI	23	Madhya Pradesh
AF0216353	PRANAV PANDEY	22	Orissa
AF0216964	Radheshyam Kumar	21	Maharashtra
AF0216973	Ankur Utpal	19	Gujarath
AF0217607	Banty Mishra	18	Madhya Pradesh
AF0217615	RIYA KUMARI	20	Karnataka
AF0217791	Priyadarshani Kumari	21	Maharashtra
AF0223373	Chanchal Thakur	22	Orissa
AF0221549	SATENDRA KUMAR	23	Maharashtra
AF0216212	Pappi Verma	24	
AF0216244	Ramkrishna Kushwah	25	Andra Pradhesh
AF0216245	Yogita Tamoliya	26	Orissa

Find the students aged over 20

Find students from the state Andhra Pradhesh

Sort students by their age.

	Sort students by state and student name.
*/

package com.testexercise.bll;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		Student std1 = new Student("AF0216223","Aryan Raj",21,"Andra Pradhesh");
		Student std2 = new Student("AF0216224","Bivor Kumar",22,"Andra Pradhesh");
		Student std3 = new Student("AF0216227","SUSHMITA KUMARI",23,"Madhya Pradesh");
		Student std4 = new Student("AF0216231","Ragiv Zafar",24,"Maharashtra");
		Student std5 = new Student("AF0216232","RAHUL MAHTO",25,"Orissa");
		Student std6 = new Student("AF0216234","Nainsi Kumari",19,"Gujarath");
		Student std7 = new Student("AF0216236","MD ALI",26,"Madhya Pradesh");
		Student std8 = new Student("AF0216238","ABHISHEK KUMAR",22,"Andra Pradhesh");
		Student std9 = new Student("AF0216240","AFROZ ANSARI",21,"Maharashtra");
		Student std10 = new Student("AF0216259","RITIK RAJ",20,"Orissa");
		Student std11 = new Student("AF0216263","Anant Kumar",25,"Andra Pradhesh");
		Student std12 = new Student("AF0216305","BABU KUMAR",24,"Gujarath");
		Student std13 = new Student("AF0216307","NIKITA KUMARI",23,"Madhya Pradesh");
		Student std14 = new Student("AF0216353","PRANAV PANDEY",22,"Orissa");
		Student std15 = new Student("AF0216964","Radheshyam Kumar",21,"Maharashtra");
		Student std16 = new Student("AF0216973","Ankur Utpal",19,"Gujarath");
		Student std17 = new Student("AF0217607","Banty Mishra",18,"Madhya Pradesh");
		Student std18 = new Student("AF0217615","RIYA KUMARI",20,"Madhya Pradesh");
		Student std19 = new Student("AF0217791","Priyadarshani Kumari",21,"Maharashtra");
		Student std20 = new Student("AF0223373","Chanchal Thakur",22,"Orissa");
		Student std21 = new Student("AF0221549","SATENDRA KUMAR",23,"Maharashtra");
		Student std22 = new Student("AF0216212","Pappi Verma",24,"");	
		Student std23 = new Student("AF0216244","Ramkrishna Kushwah",25,"Andra Pradhesh");
		Student std24 = new Student("AF0216245","Yogita Tamoliya",26,"Orissa");

		
		//Add all object in students list
		Collections.addAll(students, std1,std2,std3,std4,std5,std6,std7,std8,std9,std10,
							std11,std12,std13,std14,std15,std16,std17,std18,std19,std20,std21,std22,std23,std24);

		
		System.out.println("Display Total Students : "+students.size());
		for(Object s: students){
			System.out.println(s);
		}
		System.out.println("**************************************************************"
				+"\n**************************************************************");
		
		
		//Find the students aged over 20
		System.out.println("List of Students above 20 years : ");
		for(Student s: students) {
			if(s.getAge()>20)
			System.out.println(s);
		}
		System.out.println("**************************************************************"
				+"\n**************************************************************");
	
		
		//Find students from the state Andhra Pradhesh
		System.out.println("List of Students of Andhra Pradhesh : ");
		for(Student s: students)
		{
			if(s.getState().equals("Andra Pradhesh"))
				System.out.println(s);
		}

		System.out.println("**************************************************************"
						+"\n**************************************************************");
		//Sort students by their age.
		System.out.println("Sorted students by age ascending order : ");
		Collections.sort(students);
		//Traversing list through Iterator
		Iterator<Student> itr=students.iterator();
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		
		System.out.println("**************************************************************"
				+"\n**************************************************************");
		//Sort students by student State and Name.
		System.out.println("Sort students by State and Name...");  
		Collections.sort(students,new StateAndNameComparator());
		
		Iterator<Student> itr2 =students.iterator();
		while(itr2.hasNext())
			System.out.println(itr2.next());
	}
}


