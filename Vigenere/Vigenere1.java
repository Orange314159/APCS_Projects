public class Vigenere1
{
   // declare instance variables for text and keyword
   private String plainText;
   private String key;

   // default constructor
   public Vigenere1 ()
   {
	   plainText = "";
      key = "";
   }
    
   // initialization constructor
   public Vigenere1 (String theMsg, String theKey)
   {
      plainText = theMsg;
      key = theKey;
   }
    
   // modifier method for plainText
   public void setPlainText(String input){
      plainText = input;
   }
    
   // modifier method for key
   public void setKey(String input){
      key = input;
   }
    
   // accessor method for plainText
   public String getPlainText(){
      return plainText;
   }
    
   // accessor method for key
   public String getKey(){
      return key;
   }
    
   // encrypt method
   //   return a String
   //   no parameters
   public String encrypt()
   {
       String returnString = "";
       int counter = 0;
       for (char letter : plainText.toCharArray()){
         int charintthing = (((int) letter + ((int) key.toCharArray()[counter%key.length()]- 65)));
         if (charintthing > 90){
            charintthing = charintthing%90;
            charintthing += 64;
         }
       
         returnString += (char) charintthing;
         counter++;
       }
       return returnString;
   }
   
    
   // decrypt method
   //   return a String
   //   String parameter 
   public String decrypt(String input)
   {
       String returnString = "";
       int counter = 0;
       for (char letter : input.toCharArray()){
         int charintthing = (((int) letter - ((int) key.toCharArray()[counter%key.length()]- 65)));
         if (charintthing < 65){
            charintthing += 26;
         }
         returnString += (char) charintthing;
         counter++;
       }
       return returnString;
   }
    
   
   // equals method
   //   return a boolean
   //   parameter must be Object obj
   public boolean equals(Object obj){
      Vigenere1 other = (Vigenere1) obj;
      return key.equals(other.getKey()) && plainText.equals(other.getPlainText());
   }
    
   
   // toString() method
   public String toString()
   {
        return("plain Text     = " + plainText + "\nkey            = " + key + "\nencrypted Text = " + encrypt());    // Do NOT modify 
   }
    
}