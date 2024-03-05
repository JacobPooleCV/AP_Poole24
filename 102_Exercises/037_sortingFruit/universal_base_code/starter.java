import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Create an array of 100 Fruit!
		// Fill the array with fruit using the method below
		// Print out all the Fruit
		// Sort Fruit by Quantity, then reprint.
		// Sort Fruit by Name, then reprint.

	}

	public static void sortFruitByQuantity(Fruit[] bundle){
		// Use a sorting algorithm to sort fruit by Quantity
	}

	public static void sortFruitByName(Fruit[] bundle){
		// Use a different sorting algorithm to sort fruit by name
		// Check out compareTo() for Strings. https://www.javatpoint.com/java-string-compareto
	}

	public static void printFruit(Fruit[] bundle){
		// Print all the fruit in a bundle
	}
	
	public static void pickFruit(Fruit[] bundle){
		for(int i = 0; i < bundle.length; i++){
			int rand = (int)(Math.random()*20);
			int quant = (int)(Math.random()*100);
			switch(rand){
				case 0: bundle[i] = new Fruit("Apple", quant); break;
				case 1: bundle[i] = new Fruit("Banana", quant); break;
				case 2: bundle[i] = new Fruit("Strawberry", quant); break;
				case 3: bundle[i] = new Fruit("Grape", quant); break;
				case 4: bundle[i] = new Fruit("Watermelon", quant); break;
				case 5: bundle[i] = new Fruit("Kiwi", quant); break;
				case 6: bundle[i] = new Fruit("Pineapple", quant); break;
				case 7: bundle[i] = new Fruit("Mango", quant); break;
				case 8: bundle[i] = new Fruit("Durian", quant); break;
				case 9: bundle[i] = new Fruit("Avacado", quant); break;
				case 10: bundle[i] = new Fruit("Lemon", quant); break;
				case 11: bundle[i] = new Fruit("Pear", quant); break;
				case 12: bundle[i] = new Fruit("Raspberry", quant); break;
				case 13: bundle[i] = new Fruit("Plum", quant); break;
				case 14: bundle[i] = new Fruit("Grapefruit", quant); break;
				case 15: bundle[i] = new Fruit("Cantaloupe", quant); break;
				case 16: bundle[i] = new Fruit("Guava", quant); break;
				case 17: bundle[i] = new Fruit("Cherry", quant); break;
				case 18: bundle[i] = new Fruit("Blueberry", quant); break;
				case 19: bundle[i] = new Fruit("Pomegranate", quant); break;
				default: bundle[i] = new Fruit("Apple", quant); break;
			}
		}
	}
}
