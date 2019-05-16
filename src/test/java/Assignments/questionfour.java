package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class questionfour {
	
	
    
	

	
	    //method to  create an integer arraylist and perform operations
		public static void mylist1()
		{ 
			// Creating a list 
			List<Integer> list1 = new ArrayList<Integer>(); 
			list1.add(0, 1); 
			// adds 1 at 0 index 
			list1.add(1, 2);
			// adds 2 at 1 index 
			System.out.println(list1);
			

			// Creating another list 
			List<Integer> list2 = new ArrayList<Integer>(); 
			list2.add(1); 
			list2.add(2); 
			list2.add(3); 

			// Will add list l2 from 1 index 
			list1.addAll(1, list2); 
			System.out.println(list1); 

			// Removes element from index 1 
			list1.remove(1);	 
			System.out.println(list1);
			 

			// Prints element at index 3 
			System.out.println(list1.get(3)); 

			// Replace 0th element with 3 
			list1.set(0, 3); 
			System.out.println(list1);
			 
		} 
		
		public static void myset1()
		
		{
			//will add numbers to an array
			List<Integer> numberlist = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
			System.out.println(numberlist);
			//will remove the duplicates in the array and sort
			Set<Integer> myset = new HashSet<>(numberlist);
			System.out.println(myset);
		}
	} 

	
	


