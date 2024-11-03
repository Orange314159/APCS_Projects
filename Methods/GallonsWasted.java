import java.util.Scanner;           // imports the needed library

public class GallonsWasted{

final static int DPG = 15140; // drops per gallon

   public static void main(String[] args) {
   Scanner scan = new Scanner(System.in); // adds scanner named scan
   
   System.out.print("Enter faucet drips per minute (dpm): ");
   double dpm = scan.nextDouble();
   System.out.print("Enter number of days: ");
   int days = scan.nextInt();
   
   double waste = gallonsWasted(dpm, days);
   
   System.out.println(dpm + " dpm for " + days + " days wastes " + waste + " gallons.");
   
   
   }// end main
   
   public static double gallonsWasted(double dripsPerMinute, int days){
   
   double waste = dripsPerMinute * days * 1440;
   waste /= DPG;
   waste *= 1000;
   waste = roundNumber(waste);
   waste /= 1000.0;
   return waste;
   
   
   }// end gallonsWasted  
   
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

}// end GallonsWasted