import java.util.Arrays;

public class WordSearch90
{
	/** one 2D array private instance variable named wordArray - You CANNOT add any additional instance variables */
   private char[][] wordArray;
	
	
	/** constructor used to set the number of rows and columns in the 2D array
		* @param row
		* @param col*/
	public WordSearch90(int row, int col)
	{
		wordArray = new char[row][col];
	}
	
	/** method to set an element in the 2D array
		* @param s which is the value to store in the 2D array
		* @param row the row to use
		* @param col the column to use*/
	public void setSpot(char s, int row, int col)
	{
		wordArray[row][col] = s;
	}
	
	/** methods to check for the word in the 2D array
		* @param the word to search for
		* @return return true or false*/
	public boolean inGrid(String s)
	{
      //]
      // [c i t]
      // [a y b]
      // [b a t]
      //]
      
      // check for horizontal 
      String str = "";
      String rts = "";
      
      for (int i = 0; i < wordArray.length; i++){
         // make string for each line
         str = "";
         rts = "";
         
         // loop through each char to add to string
         for (int j = 0; j < wordArray[i].length; j++){
               str += wordArray[i][j];
               rts = wordArray[i][j] + rts;
         }
         // check if word is in the string
         if (str.indexOf(s) > -1){
            return true;
         }
         if (rts.indexOf(s) > -1){
            return true;
         }
      }
      
      // check for vertical
      for (int i = 0; i < wordArray[0].length; i++){
         // make string for each line
         str = "";
         rts = "";
         
         // loop through each char to add to string
         for (int j = 0; j < wordArray.length; j++){
               str += wordArray[j][i];
               rts = wordArray[j][i] + rts;
         }
         // check if word is in the string
         if (str.indexOf(s) > -1){
            return true;
         }
         if (rts.indexOf(s) > -1){
            return true;
         }
      }
      
		return false;
	}
	
	/** toString method
		* @return String containing all elements in the 2D array*/
	public String toString()
	{
      String retstr = "[";
      
      for (int i = 0; i < wordArray.length; i++){
         
         // check if first line to not add space
         if (i>0){
            retstr += " [ ";
         }
         else{
            retstr += "[ ";
         }
         
         // loop through each letter
         for (int j = 0; j < wordArray[i].length; j++){
            // add letter and a space to the string
            retstr += wordArray[i][j];   
            retstr += " ";        
         }
         
         // close brackets 
         if (i+1 < wordArray.length){
            retstr += "]\n";
         }
         else{
            retstr += "]]";
         }
      }
      
     
      
      
		return retstr;
	}
}