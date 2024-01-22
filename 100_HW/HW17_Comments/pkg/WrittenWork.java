package pkg;
import java.util.*;
import java.io.*;

public class WrittenWork{
	String[] content;
	String author;

	public WrittenWork(){
		content = new String[0];
		author = "Unknown";
	}

	public WrittenWork(int numLines){
		content = new String[numLines];
		author = "Unknown";
	}

	public WrittenWork(int numLines, String author){
		content = new String[numLines];
		this.author = author;
	}

	public void importWork(String file) throws FileNotFoundException {
        File text = new File(file);
        Scanner sc = new Scanner(text);
		int i = 0;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
			content[i] = line;
			i++;
		}
	}

	public void printWork(){
		System.out.println("------------------------------------------");
		System.out.println();
		System.out.println("Written by " + author + ": ");
		for(String a: content){
			System.out.println(a);
		}
		System.out.println();
		System.out.println("------------------------------------------");
	}
}
