import acm.program.*;
import java.io.*;
import java.util.ArrayList;

public class BufferReaderTest extends ConsoleProgram {
	public void run() {
		wordList = new ArrayList<>();
		BufferedReader rd = null;
		try {
			rd = new BufferedReader(new FileReader("/Users/perramount/Desktop/Java/106A/Hangman/HangmanLexicon.txt"));
			println("rd initialized");
		} catch (IOException ex) {
			System.out.println("File not found.");
		}
		line = "";
		while (line != null) {
			try {
				line = rd.readLine();
				wordList.add(line);
				println("add a word");
			} catch (IOException ex) {
				println("oops");
				break;
			}
			
		}
		try {
			rd.close();
		} catch (IOException e) {
			println("oops");
		}
		println(wordList.get(0));
	}
	
	private ArrayList<String> wordList;
	private String line;
}
