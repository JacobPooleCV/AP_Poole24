import java.util.*;

class starter3 {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		System.out.println();
		System.out.println();
		System.out.println("There are " + twoInARow(arr1) + " values that are the same in a row.");
		System.out.println();
		System.out.println();
		removeDup(arr1);		//Create this method.
		printValuesInt(arr1);
	}

	public static void removeDup(ArrayList<Integer> arr){
		// This method should remove all duplicates within the ArrayList
	}

	public static int twoInARow(ArrayList<Integer> arr){
		// This method should return the number of numbers that are the exact same in a row.
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add((int)(Math.random()*100));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
}
