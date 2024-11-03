// name:Matt Robson  
// purpose: demonstrate further method prowess

public class Invoke 
{
    // method piggyBank(): returns what the change is worth in cents
    public static int piggyBank(int pennies, int nickels, int dimes, int quarters, int halfDollars) 
    {
        int worth;
        worth = pennies;
        worth += nickels * 5;
        worth += dimes * 10;
        worth += quarters * 25;
        worth += halfDollars * 50;
        return worth;
    }

    // method mp3Sizer(): estimates the number of gB needed to store media
    public static int mp3Sizer(int songs, int videos, int photos){
      double usedMB;  
      usedMB  = songs  * 3.04;
      usedMB += videos * 89.3;
      usedMB += photos * 1.72;
      int usedGB = (int) Math.ceil(usedMB / 1000);
      return usedGB;
      
    }


}