/*
 * File: Wordle.java
 * -----------------
 * This module is the starter file for the Wordle assignment.
 * BE SURE TO UPDATE THIS COMMENT WHEN YOU COMPLETE THE CODE.
 */
import java.util.concurrent.ThreadLocalRandom;

public class Wordle {
   private WordleGWindow gw;
   private String secretWord;
   
   // write default constructor
   public Wordle(){
      gw = new WordleGWindow();
      secretWord = "";
   }

   // write setSecretWord method (i.e. the modifier method for secretWord instance variable)
   
   // write randomSecretWord method
   public String randomSecretWord(){
      String[] words = WordleDictionary.WORDS_TO_PICK_FROM;
      secretWord = words[ThreadLocalRandom.current().nextInt(0, words.length)];
      System.out.println(secretWord);
      return secretWord;
   }
  
   // run the game  
   public void run() {
      // MILESTONE #1:  show the secret word in row 0
//       randomSecretWord(); 
      for (int i = 0; i < 5; i++) {
         gw.setSquareLetter(0,i, String.valueOf(secretWord.charAt(i)));
      }
      gw.addEnterListener((s) -> enterAction(s)); 
       
   }
   
   public void setSecretWord(String input){
      secretWord = (input);
   }

  /*
   * Called when the user hits the RETURN key or clicks the ENTER button,
   * passing in the string of characters on the current row.
   */
   public void enterAction(String s) {
      int correct = 0;
      s = s.toLowerCase();
      boolean wordExist = false;
      for (String item : WordleDictionary.FIVE_LETTER_WORDS)
      {
         if (item.equals(s.toLowerCase())){
            wordExist = true;
         }   
      }         
      if (!wordExist){
         gw.showMessage("Not in word list.");
      }
      else {
         gw.showMessage("Word Exists.");
         // next step check if letters are in right place
        
         for (int i = 0; i < 5; i++){
            if (s.charAt(i) == secretWord.charAt(i)){       
               gw.setSquareColor(gw.getCurrentRow(), i, gw.CORRECT_COLOR);
               correct++;
            }
            else {
               for(int j = 0; j < 5; j++){
                  if (s.charAt(i) == secretWord.charAt(j)){
                     gw.setSquareColor(gw.getCurrentRow(), i, gw.PRESENT_COLOR);
                     break;
                  }
                  gw.setSquareColor(gw.getCurrentRow(), i, gw.MISSING_COLOR);                                    
               }
            }
         }
         
         
      }
      //
      if (correct > 4){
         gw.showMessage("Great Job!!!");
      }
      else{
         gw.setCurrentRow(gw.getCurrentRow()+1);
      }
      
      // MILESTONE #3, #4
   
   }

}
