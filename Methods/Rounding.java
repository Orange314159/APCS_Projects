import java.util.Scanner;           // imports the needed library 

public class Rounding	
{ 
   public static void main(String[] args)
   {
      double number; 
      int numberRounded;
   
      Scanner scan = new Scanner(System.in); // adds scanner named scan
       
      System.out.print("Enter the number you wish to round: ");       
      number = scan.nextDouble();
      numberRounded = roundNumber(number);
      System.out.println("" + number + " rounded is " + numberRounded + ".");  // do not modify
   }
    
   public static int roundNumber(double a) // rounds a double and returns an int
   {

   	int b;
   	if (a < 0){
   		b = (int) (a - 0.5);	
   	} else {
   		b = (int) (a + 0.5);
   	}
   	return b;

   }
    
}
