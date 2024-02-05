import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a width: ");
		int width = sc.nextInt();
		System.out.print("Please enter a height: ");
		int height = sc.nextInt();

		System.out.println("Come find the treasure! X marks the spot!");
		System.out.println("Given the map below, you need to dig for the treasure!");
		System.out.println("- 0 means, the spot is untouched");
		System.out.println("- 1 means, the spot has been dug up");
		System.out.println("- 2 means, that's the spot you're currently on");
		System.out.println("- 3 means, that spot has been dug and you're on it");
		System.out.println("- 7 is the treasure!");

		Map merp = new Map(width, height);
		merp.generateTreasure();
		merp.printMap();

		while(true){
			System.out.println("What action would you like to take? Type the number in:");
			System.out.println("1 - Move Single");
			System.out.println("2 - Move Row/Column");
			System.out.println("3 - Dig");
			System.out.println("4 - Print Map");
			System.out.println("5 - Print Instructions");
			System.out.println("9 - Give Up");
			System.out.println();
			int ans = sc.nextInt();
			System.out.println();

			if(ans == 1){
				System.out.println("What direction would you like to move in?");
				System.out.println("1 - Up");
				System.out.println("2 - Down");
				System.out.println("3 - Left");
				System.out.println("4 - Right");
				System.out.println("5 - LeftUp");
				System.out.println("6 - RightUp");
				System.out.println("7 - LeftDown");
				System.out.println("8 - RightDown");
				System.out.println();
				int m = sc.nextInt();
				System.out.println();
				System.out.println();
				if(merp.move(m)){
					System.out.println("You moved successfully!");
				}
				else{
					System.out.println("Invalid move, try again!");
				}

			}
			else if(ans == 2){
				System.out.println("Remember we start counting at 0!");
				System.out.println("What row would you like to move to?");
				int r = sc.nextInt();
				System.out.println("What column would you like to move to?");
				int c = sc.nextInt();
				System.out.println();
				if(merp.move(r,c)){
					System.out.println("You moved successfully!");
				}
				else{
					System.out.println("Invalid move, try again!");
				}
			}
			else if(ans == 3){
				if(merp.dig()){
					System.out.println("You found the treasure!");
					merp.printTreasureLoc();
					return;
				}
				else{
					System.out.println("You didn't find the treasure. Keep trying!");
				}
			}
			else if(ans == 4){
				merp.printMap();
			}
			else if(ans == 5){
				System.out.println("- 0 means, the spot is untouched");
				System.out.println("- 1 means, the spot has been dug up");
				System.out.println("- 2 means, that's the spot you're currently on");
				System.out.println("- 3 means, that spot has been dug and you're on it");
				System.out.println("- 7 is the treasure!");
			}
			else if(ans == 9){
				System.out.println("Sad to see you go!");
				merp.printTreasureLoc();
				return;
			}
			else{
				System.out.println("Wrong Input, try again!");
				System.out.println();
			}
			System.out.println("------------------------------");
			System.out.println();
		}




	}
}
