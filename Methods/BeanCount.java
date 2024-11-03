import java.util.Scanner;           // imports the needed library

public class BeanCount{

   public static void main(String[] args){
      Scanner scan = new Scanner(System.in); // adds scanner named scan
      System.out.print("Enter jelly bean length (cm): ");
      double jbl = scan.nextDouble();
      System.out.print("Enter jelly bean height (cm): ");
      double jbh = scan.nextDouble();
      System.out.print("Enter jar size (mL): ");
      int size = scan.nextInt();
      
      int beansInJar = beans(jbl, jbh, size);
      System.out.println("The estimate for the number of jelly beans with avg length: " + jbl + "cm  height: " + jbh + "cm in a jar of size " + size + " mL is " + beansInJar);
      
   }// end main
   
   public static int beans(double len, double h, int size){
   
   double beanVolume = 5.0;
   beanVolume *= Math.PI;
   beanVolume *= len;
   beanVolume *= Math.pow(h, 2);
   beanVolume /= 24.0;
   
   double useableSize = size * 0.698;
   
   int beansInJar = (int) (useableSize / beanVolume);
   
   return beansInJar;
   
   }
}// end BeanCount