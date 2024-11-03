// name: Matthew Robson
// purpose: experience the thrill of methods


public class Task
{


   // method favorite(): returns ( ( ( (16 * 65 ) + 12 ) * 72 ) / 68 ) - 1
   public static int favorite()
   {
       int ans = (int) (((((16 * 65 ) + 12 ) * 72 ) / 68 ) - 1);
       return ans; // change method body to produce correct answer
   }// end method favorite




   // method wasted(): prints line that is number of wasted gallons of water
   public static void wasted(double drip, int days)
   {
       double waste;
       waste = (drip * 1440 * days / 15140.0);
       waste += 0.5;


       System.out.println("A faucet with " + drip + " drips per minute over " + days + " days will waste " + (int) waste + " gallons of water");
   }


   // method count(): returns estimated number of beans in jar


   public static int count(double a, double b, int mL){
       float ans;
       float volumeOfABean;
       float volumeOfContainer;
       volumeOfABean = 5;
       volumeOfABean *= Math.PI;
       volumeOfABean *= a;
       volumeOfABean *= b * b;
       volumeOfABean /= 24;


       volumeOfContainer = mL;
       volumeOfContainer *= 0.698;


       ans = volumeOfContainer / volumeOfABean;




       return (int) ans;
   }
}
