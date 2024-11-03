import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class WordSearchRunner
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// instantiate Scanner object to read in from file
		Scanner in = new Scanner(new File("grid5.txt"));   // read in grid.txt
	      
		// read in rows
      int rows = in.nextInt(); 
		
		// read in columns
      int cols = in.nextInt();
		
		// instantiate WordSearch object passing in number of rows & columns for 2D array
		WordSearch100 ws = new WordSearch100(rows, cols);
      
		// loop through the rows in the file
      for (int i = 0; i < rows; i++){
      		// loop through the columns in the file
            for (int j = 0; j < cols; j++){
            	// read in value from file using local variable
				   char val = in.next().charAt(0);
				   // pass row, column, and value into the 2D array
               ws.setSpot(val, i, j);
		      }
      }		
		// read number of words to search for from file
      int words = in.nextInt();
		String word = "";
      boolean wordIn = false;
      
		// loops through the words
      for (int i = 0; i < words; i++){
			// read in word from file
		   word = in.next();
			// method call to search for the word in the 2D array
			wordIn = ws.inGrid(word);
			// print out word to search for and true/false
         System.out.println(word + " -> " + wordIn);
		}
	System.out.println(ws);
   }
}