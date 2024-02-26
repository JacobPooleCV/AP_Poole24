import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int numberOfLives = 10;				// Default value for number of lives
		String word = getWord();			// word stores a random word from the top 10,000 most common English words

		ArrayList<String> answerLetters = new ArrayList<String>();		// This is the correct word split into letters
		splitWord(answerLetters, word);									// Sets up the correct word split up letter by letter into the ArrayList

		ArrayList<String> guessedLetters = new ArrayList<String>();	// This is all the guessed letters from the user
		String[] guessedWord = new String[answerLetters.size()];			// This is the correctly guessed letters in their correct place
		
		for(int i = 0; i < guessedWord.length; i++){		// Fill the correctly guessed letters with empty spaces to start instead of null
			guessedWord[i] = " ";
		}
		
		System.out.println("Welcome to Manless Hang! You have " + numberOfLives + " lives to guess the word.");
		/*
			------------------THE LOOP------------------
			The loop runs while there are stil lives > 0
			The loop prints out
				1. The Number of lives
				2. Used guessed letters
				3. The current progress of the guessed word

			The loop asks for a letter from the user.
			The letter should be checked that it is just a single letter
			
			After receiving a letter, there are 3 options
				1. The letter was already used
				2. The letter was a correct guess
				3. The letter was an incorrect guess

			1. Letter already used
				- Print already used and move on
			2. Letter correctly guessed
				- Print correctly guessed
				- Reveal all correctly guessed letters in the guessedWord array
				- Add the letter to the guessed letters
			3. Letter incorrectly guessed
				- Print incorrectly guessed
				- Reduce number of lives
				- Add the letter to the guessed letters

			Lastly, the loop should check if the word has been completely guessed, end if so and print number of lives.  
		*/ 
		while(numberOfLives > 0){
			System.out.println("--------------------------------------------------------------------");
			// Write code here
			
			System.out.println("");
		}

		// After the loop, print the word. 
		
	}

	/*
		Implement this method.
		This method should print out all String values in the ArrayList with spaces between.
		Example output: 
			ArrayList stores ['h', 'e', 'l', 'l', 'o']
			Prints: h e l l o 
	*/
	public static void printLetters(ArrayList<String> letters){

	}

	/*
		Implement this method.
		This method should split all letters from a String word into individual 
		characters into each index of the ArrayList letters
	*/ 
	public static void splitWord(ArrayList<String> letters, String word){
		
	}

	/*
		Implement this method.
		This method should check if the letter given is in the ArrayList given
		This method should return true or false if so.
		This should ignore uppercase and lowercase.
	*/
	public static boolean checkWord(ArrayList<String> letters, String letter){
		
	}

	/*
		Implement this method.
		This method should reveal ALL letters of the guessed letter
		Given the guessedLetter, check the ArrayList of correctly stored letters and 
		reveal letters in the equivalent indexes in the guessingWord array.
		This should ignore uppercase and lowercase.
	*/
	public static void revealLetter(String[] guessingWord, ArrayList<String> letters, String guessedLetter){
		
	}

	/*
		Implement this method.
		This method should return true or false if the word was completely guessed.
		Given the guessedWord array, check if the word was successfully guessed.
	*/
	public static boolean checkWin(String[] guessedWord){
		
	}


	//--------------------------------------------------------------------------------------------------------------//
	//----------------------------------------The below work as intended--------------------------------------------//
	//--------------------------------------------------------------------------------------------------------------//
	/*
		This method works as intended. 
		This method returns a random word from the words.txt file.
		The words.txt file stores the 10,000 most common English words.
	*/
	public static String getWord() throws FileNotFoundException {
        File text = new File("./words.txt");
        Scanner sc = new Scanner(text);
		ArrayList<String> words = new ArrayList<String>();
        while(sc.hasNextLine()){
            words.add(sc.nextLine());
        }      
		return words.get(((int)(Math.random()*words.size())));
	}

	/*
		This method works as intended.
		printGuess prints out the indexes and current guessed values of the word.
	*/
	public static void printGuess(String[] arr){
		System.out.println("The current gussed word is:");
		System.out.print("| ");
		for(int i = 0; i < arr.length; i++){
			System.out.print((i+1) + " ");
		}
		System.out.println("|");
		System.out.print("| ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("|");
	}


}
