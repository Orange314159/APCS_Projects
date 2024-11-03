import java.io.*;
import java.util.*;

public class UserAccess1 {
    
   // keyboard scanner shared by all methods
   public static final Scanner scanInput = new Scanner(System.in);    

   public static void main(String[] args) throws FileNotFoundException, IOException {
   
      File userFile = new File("users1.dat");
      
      System.out.print("(l)ogin or (r)egister? ");
      String choice = scanInput.next();
      
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
   
   
   public static boolean login(File userFile) throws FileNotFoundException {
      Scanner in = new Scanner((userFile));
      System.out.print("Username? ");
      String givenUsername = scanInput.next();
      System.out.print("Password? ");
      String givenPswd = scanInput.next();
      
      while (in.hasNext()) {
         if (givenUsername.equals(in.next())) {
            if (givenPswd.equals(in.next())) {
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
  
   public static void register(File userFile) throws FileNotFoundException,IOException {
   
      // Use the below code to append to userFile
      FileWriter fw = new FileWriter(userFile, true);   // open file in append mode by passing true
      PrintWriter pw = new PrintWriter(fw);    // use PrintWriter to write a line using println
      boolean doPassMatch = false;
      boolean userExist = false;
      String userName = "";
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
            pw.println(userName + " " + password);
            pw.flush();   // flush output to file
            System.out.println("Welcome!!!");
            doPassMatch = true;
         }
         else {
            System.out.println("Passwords do not match. Try again.");
            
         }
      }
      while(!doPassMatch);
      
            

   }
}