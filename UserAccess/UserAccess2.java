import java.io.*;
import java.util.*;
import java.util.Random;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UserAccess2 {
    
   // keyboard scanner shared by all methods
   public static final Scanner scanInput = new Scanner(System.in);    

   public static void main(String[] args) throws FileNotFoundException, IOException, NoSuchAlgorithmException  {
   
      File userFile = new File("users2.dat");   
      boolean login = true;
      String choice = "";
      
      do{
         System.out.print("(l)ogin or (r)egister? ");
         choice = scanInput.next();
         if (choice.equals("l") || choice.equals("r")){
            login = false;
         }
         else {
            System.out.println("Please enter either 'l' or 'r'");
         }
      } while (login);
      
      if (choice.equals("l")) {
         boolean passmatch = false;
         do {
         if (login (userFile)) {
            System.out.println("Welcome!!!");
            passmatch = true;
         }
         else {
            System.out.println("Username and/or password do not match. Try again.");  
         }
                        
      }
      while (!passmatch);
      }
      else if (choice.equals("r")) {
         register(userFile);
      }
      
         
   }
   
   
   public static boolean login(File userFile) throws FileNotFoundException, IOException, NoSuchAlgorithmException  {
      Scanner in = new Scanner((userFile));
      System.out.print("Username? ");
      String givenUsername = scanInput.next();
      System.out.print("Password? ");
      String givenPswd = scanInput.next();
      
      // loop through file
      while (in.hasNext()) {
         // if the username is in the file
         if (givenUsername.equals(in.next())) {     
            
            String testpass = (in.next());
            String testSalt = (in.next());
            
            givenPswd = toHexString(getSHA(givenPswd + testSalt));
            
            if (givenPswd.equals(testpass)) {
               return true;
            }
         }
         
      }
      return false;
   }
   
  public static boolean internalLogin(File userFile,String givenUsername) throws FileNotFoundException {
      Scanner in = new Scanner((userFile));

      while (in.hasNext()) {
         if (givenUsername.equals(in.next())) {
            return true;
         }
         
      }
      return false;
   }
  
   public static void register(File userFile) throws FileNotFoundException, IOException, NoSuchAlgorithmException {
   
      // Use the below code to append to userFile
      FileWriter fw = new FileWriter(userFile, true);   // open file in append mode by passing true
      PrintWriter pw = new PrintWriter(fw);    // use PrintWriter to write a line using println
      boolean doPassMatch = false;
      boolean userExist = false;
      String userName = "";
      
      // username loop
      do {
         // ask for username
         System.out.print("Username? ");
         userName = scanInput.next();
         if (internalLogin(userFile, userName)){
            userExist = true;
            System.out.println("Username already taken. Please choose a different one.");
         }
         else {
            userExist = false;
         }
      }
      while(userExist);
      
      // password loop
      do { 
         // ask for pass
         System.out.print("Password? ");
         String password = scanInput.next();
         // verify pass
         System.out.print("Verify Password? ");
         String verifyPassword = scanInput.next();
         
         // check if verify and pass same
         if(password.equals(verifyPassword)) {
            // add to file
            
            // make salt
            String mysalt = makeSalt(); 
            pw.println(userName + " " + toHexString(getSHA(password+mysalt)) + " " + mysalt);
            pw.flush();   // flush output to file
            
            // greet
            System.out.println("Welcome!!!");
            doPassMatch = true;
         }
         else {
            System.out.println("Passwords do not match. Try again.");
            
         }
      }
      while(!doPassMatch);
      
            

   }
   
   public static String makeSalt(){
   Random rand = new Random();
   char[] ALPHANUMERIC = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
   String password = "";
      for (int i = 0; i < 20; i++){
         password = password + ALPHANUMERIC[rand.nextInt(62)];
      }
      return password;
   }
   

   public static byte[] getSHA(String input) throws NoSuchAlgorithmException
   {
        // Static getInstance method is called with hashing SHA
      MessageDigest md = MessageDigest.getInstance("SHA-256");
   
        // digest() method called
        // to calculate message digest of an input
        // and return array of byte
      return md.digest(input.getBytes(StandardCharsets.UTF_8));
   }
     
   public static String toHexString(byte[] hash)
   {
        // Convert byte array into signum representation
      BigInteger number = new BigInteger(1, hash);
   
        // Convert message digest into hex value
      StringBuilder hexString = new StringBuilder(number.toString(16));
   
        // Pad with leading zeros
      while (hexString.length() < 64)
      {
         hexString.insert(0, '0');
      }
   
      return hexString.toString();
   }

}