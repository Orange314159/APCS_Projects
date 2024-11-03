import java.util.Scanner;           // imports the needed library
public class RandomStatement{
  
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in); // adds scanner named scan
      System.out.print("Enter lower & upper bounds: ");
      int upperBound;
      int lowerBound;
      lowerBound = scan.nextInt();
      upperBound = scan.nextInt();
      
      System.out.print("Enter number to multiply & number to add: ");
      int multNumber;
      int addNumber;
      multNumber = scan.nextInt();
      addNumber = scan.nextInt();
      
      boolean works = randomStatement(lowerBound, upperBound, multNumber, addNumber);
      
      if (addNumber < 0){
         if (works){
         System.out.println("(int) (Math.random() * " + multNumber + ") - " + addNumber * -1 + "; will yield [" + lowerBound + "," + upperBound +"]");
         }
         else{
         System.out.println("(int) (Math.random() * " + multNumber + ") - " + addNumber * -1 +  "; will NOT yield [" + lowerBound + "," + upperBound +"]");
         }
      }
      else if (addNumber == 0){
         if (works){
         System.out.println("(int) (Math.random() * " + multNumber + "); will yield [" + lowerBound + "," + upperBound +"]");
         }
         else{
         System.out.println("(int) (Math.random() * " + multNumber + "); will NOT yield [" + lowerBound + "," + upperBound +"]");
         }

      }
      else{
         if (works){
         System.out.println("(int) (Math.random() * " + multNumber + ") + " + addNumber + "; will yield [" + lowerBound + "," + upperBound +"]");
         }
         else{
         System.out.println("(int) (Math.random() * " + multNumber + ") + " + addNumber + "; will NOT yield [" + lowerBound + "," + upperBound +"]");
         }   
      }
   
   } // end main
   
   public static boolean randomStatement(int lowerBound, int upperBound, int X, int Y){
      boolean ans = false;
      int max;
      int min;
      
      max = (int) (0.99999 * X + Y);
      min = (int) Y;
      
      if (lowerBound > min){
         ans = false;
      }      
      else if (upperBound < max){
         ans = false;
      }
      else {
         ans = true;
      }
      
      
      return ans;
   
   } // end randomStatement
} // end RandomStatement (class)