import java.util.Arrays;

public class CollatzRunner{

   public static void main(String[] args){
      
      // make a collatz obj
      Collatz col = new Collatz(10);
      // test steps()
      System.out.println(col.steps());
      System.out.println(Arrays.toString(col.sequence()));
      System.out.println(col.maxValue());
      System.out.println(col.minOddValue());
      System.out.println(Arrays.toString(col.oddValues()));
      System.out.println(col.sumValues());
      System.out.println(col);
   }
}