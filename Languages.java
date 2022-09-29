/*	1.Create a list of elements as shown below into the LinkedList and name it as languages.

	C
	C++
	Java
	Kotlin
	Python
	Perl
	Ruby

	Display the created list.

	Remove an element at index 5 and display the list

	Remove ‘Kotlin’ and display the list

	Remove all the scripting languages (Python, Ruby, Perl) with one statement and display the list.

	Remove all the elements from the list and display the list.


*/
package com.testexercise.bll;

import java.util.Arrays;
import java.util.LinkedList;

public class Languages {

	public static void main(String[] args) {
		
		LinkedList<String> languages = new LinkedList<String>();
		
		languages.add("C");
		languages.add("C++");
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("Python");
		languages.add("Perl");
		languages.add("Rubi");

		//System.out.println(languages);
		
		//Display all elements
		System.out.println("Display all elements");
		for(String language :languages) {
			System.out.println(language);
		}
		
		//Remove index 5
		languages.remove(5);
		System.out.println("************************************************");
		System.out.println("Display all elemens after remove index 5");
		for(String language :languages)
			System.out.println(language);
		
		//Remove kotlin element
		languages.remove("Kotlin");
		System.out.println("************************************************");
		System.out.println("Display all elemens after remove kotlin element :");
		for(String language :languages)
			System.out.println(language);

		//Remove all the scripting languages (Python, Ruby, Perl)		
		languages.removeAll(new LinkedList<> (Arrays.asList("Python","Rubi","Perl")));
		
		System.out.println("************************************************");
		System.out.println("Display all elemens after remove all "
						+ "the scripting languages (Python, Ruby, Perl) :");
		for(String language :languages)
			System.out.println(language);
		
		//Remove all elements
		languages.removeAll(languages);
		System.out.println("************************************************");
		System.out.println("List after remove all elements :");
		for(String language :languages)
			System.out.println(language);
		
	}

}
