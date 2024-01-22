package pkg;
import java.util.*;

public class Poem extends WrittenWork{
	String theme;

	public Poem(){
		super();
		theme = "None";
	}
	
	public Poem(int numLines, String theme){
		super(numLines);
		this.theme = theme;
	}

	public Poem(String author, int numLines){
		super(numLines, author);
		this.theme = "None";
	}

	public Poem(int numLines, String author, String theme){
		super(numLines, author);
		this.theme = theme;
	}

}
