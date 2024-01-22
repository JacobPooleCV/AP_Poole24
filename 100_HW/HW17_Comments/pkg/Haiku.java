package pkg;
import java.util.*;

public class Haiku extends WrittenWork{
	boolean has3Lines;

	public Haiku(){
		super();
		has3Lines = false;
	}
	
	public Haiku(int numLines, boolean has3Lines){
		super(numLines);
		this.has3Lines = has3Lines;
	}

	public Haiku(String author, int numLines){
		super(numLines, author);
		if(numLines == 3)
			has3Lines = true;
		else
			has3Lines = false;
	}

	public Haiku(int numLines, String author, boolean has3Lines){
		super(numLines, author);
		this.has3Lines = has3Lines;
	}
}
