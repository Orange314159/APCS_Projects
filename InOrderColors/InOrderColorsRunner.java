import java.util.*;
import java.util.Scanner;           // imports the needed library

public class InOrderColorsRunner
{
   // main(): program starting point
   public static void main( String[] args ) 
   {     
     
      // ****   FIRST InOrderColors OBJECT  *****
      System.out.println("FIRST InOrderColors OBJECT INSTANCE");  // DO NOT MODIFY
      
      // create an InOrderColors object by calling the default constructor
      InOrderColors threeCols1 = new InOrderColors();

      System.out.println("  Object -> " + threeCols1);   // DO NOT MODIFY
      
      if (threeCols1.areTheyInOrder()) {
         System.out.println("  Currently the colors are in wavelength order.");  // DO NOT MODIFY
      }                                                                          // DO NOT MODIFY
      else {                                                                     // DO NOT MODIFY
         System.out.println("  Currently colors are NOT in wavelength order.");  // DO NOT MODIFY
      }                                                                          // DO NOT MODIFY
                 
      // use the sortThem() method top put the colors in wavelength order
      threeCols1.sortThem();

      System.out.println("  Object -> " + threeCols1);  // DO NOT MODIFY
                  
      // print out message if the colors are currently in order or not
      if (threeCols1.areTheyInOrder() ) {                // DO NOT MODIFY
         System.out.println("  Currently the colors are in wavelength order.");  // DO NOT MODIFY
      }                                                                          // DO NOT MODIFY
      else {                                                                     // DO NOT MODIFY
         System.out.println("  Currently colors are NOT in wavelength order.");  // DO NOT MODIFY
      }          
         
      
      // ****   SECOND InOrderColors OBJECT  *****
      System.out.println("SECOND InOrderColors OBJECT INSTANCE");   // DO NOT MODIFY
      
      // create another InOrderColors object by calling the default constructor
      InOrderColors threeCols2 = new InOrderColors();
      
      // set up scanner to read input from user
      Scanner scan = new Scanner(System.in); // adds scanner named scan

      
      System.out.print( "  Enter three colors: " );    // DO NOT MODIFY
      
      // use the scanner to read in the input
      String col1 = scan.next();
      String col2 = scan.next();
      String col3 = scan.next();
      
      // Use the appropriate modifier method to set the three colors
      threeCols2.setColorOne(col1);
      threeCols2.setColorTwo(col2);
      threeCols2.setColorThree(col3);

      // print out the object
      System.out.println("  Object -> " +threeCols2);

      // use the sortThem() method top put the colors in wavelength order
      threeCols2.sortThem();

      // print out the object
      System.out.println("  Object -> " +threeCols2);


      System.out.println("  The color with the smallest wavelength is " + threeCols2.getColorOne() + ".");   // DO NOT MODIFY     
  
   
      // ****   THIRD InOrderColors OBJECT  *****
      System.out.println("THIRD InOrderColors OBJECT INSTANCE");  // DO NOT MODIFY
      
      // create another InOrderColors object by calling the initialization constructor
      // (initialize colorOne to orange, colorTwo to yellow, colorThree to violet)
      InOrderColors threeCols3 = new InOrderColors("orange","yellow","violet");

      // print out the object
      System.out.println("  Object -> " + threeCols3);

      // use the sortThem() method top put the colors in wavelength order
      threeCols3.sortThem();

      // print out the object
      System.out.println("  Object -> " +threeCols3);


      System.out.println("  The color with the largest wavelength is " + threeCols3.getColorThree() + ".");  // DO NOT MODIFY     
          
   }
}