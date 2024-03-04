import java.util.*;
import java.io.*;
/*
	Author: 
	Date: 
*/


class starter {
	public static void main(String args[]) {
		// Create an ArrayList
		// Ask the user for how many values they'd like in the ArrayList and how large of numbers they would like.
		// Use the 2 methods below to randomly add numbers to the ArrayList and print it.
		// Use your Bubble Sort method and show a before and after version of the ArrayList.
		// Check the labOutput for insight

		// Create 2 more ArrayLists
		// Ask the user for how many values they'd like in the ArrayList and how large of numbers they would like.
		// Use the 2 methods below to randomly add numbers to BOTH ArrayLists and print it.
		// Use your Selection Sort method and show a before and after version of the ArrayList.
		// Use your Insertion Sort method and show a before and after version of the ArrayList.
		// Check the labOutput for insight
		
	}
	
	// Write your Bubble Sort Method below. Create Bubble Sort for ArrayLists
	
	//
	
	// Write your Selection Sort Method below. Create Selection Sort for ArrayLists
	
	//

	// Write your Insertion Sort Method below. Create Insertion Sort for ArrayLists
	
	//
	
	
	public static void addValuesInt(ArrayList<Integer> arr, int num, int val){
		for(int i = 0; i < num; i++){
			arr.add((int)(Math.random()*val));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		System.out.println("------------------------------");
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
	}
}
