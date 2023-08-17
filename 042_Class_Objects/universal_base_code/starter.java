import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman spidey1 = new Spiderman();								// Default constructor
		Spiderman spidey2 = new Spiderman("Tobey Maguire");					// String constructor
		Spiderman spidey3 = new Spiderman("Andrew Garfield", 39);			// String, int constructor
		Spiderman spidey4 = new Spiderman("Tom Holland", "The Vulture");	// String, String constructor

		// Default Prints
		spidey1.print();
		spidey2.print();
		spidey3.print();
		spidey4.print();

		System.out.println("--------------NOW TO CHANGE THE DATA--------------");

		//Mutator methods
		spidey2.setAge(47);
		spidey2.setVillain("Green Goblin");
		spidey2.print();

		spidey3.setVillain("Electro");
		spidey3.print();

		spidey4.setAge(26);
		spidey4.print();

	}
}
