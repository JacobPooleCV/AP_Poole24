import pkg.*;
import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws FileNotFoundException {
		WrittenWork [] arr = new WrittenWork[5];
			
		arr[0] = new Poem("Edgar Allan Poe", 125);
		arr[0].importWork("./Works/Raven.txt");
		arr[0].printWork();

		arr[1] = new Haiku("Matsuo Basho", 3);
		arr[1].importWork("./Works/TheOldPond.txt");
		arr[1].printWork();

		arr[2] = new Haiku(3, "Kobayashi Issa", true);
		arr[2].importWork("./Works/AWorldOfDew.txt");
		arr[2].printWork();
		
		arr[3] = new Poem(24, "Traditional");
		arr[3].importWork("./Works/DoNotGoGentleIntoThatGoodNight.txt");
		arr[3].printWork();

		Scanner sc = new Scanner(System.in);
		System.out.print("How many lines is your Written Work? ");
		int numLines = sc.nextInt();
		sc.nextLine();
		System.out.print("What is your name? ");
		String name = sc.nextLine();
		
		arr[4] = new WrittenWork(numLines, name);
		arr[4].importWork("./Works/YourOwn.txt");
		arr[4].printWork();

		
	}
}
