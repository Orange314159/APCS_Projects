// when using this code run Tasking and not Task, task is only needed to run other methods that are not found in Tasking
// - Matthew Robson
public class Tasking
{
   // method main():   program starting point
   public static void main( String[] args) {
       System.out.println("Running main() in Tasking class!\n");
       System.out.println("Trying mission()");
       mission();       //: The Liberal Arts and Science Academy cultivates ...


       System.out.println("\nTrying favorite()");
       int nbr1 = Task.favorite();      //: nbr1 = 1112
       int nbr2 = Task.favorite();      //: nbr2 = 1112
       System.out.println("nbr1=" + nbr1);
       System.out.println("nbr2=" + nbr2);


       System.out.println("\nTrying wasted()");
       double dpm = 3.75;
       int days = 30;
       Task.wasted( dpm, days );  // 11 gallons
       Task.wasted( 7.50,  5 );   // 4 gallons


       System.out.println("\nTrying count()");
       int count1 = Task.count( 1.5, 0.9, 500 );   //: 438 beans
       int count2 = Task.count( 2.0, 1.0,  25 );   //: 13 beans
       System.out.println(count1 + " beans");
       System.out.println(count2 + " beans");


   }


   public static void mission(){
       System.out.println("The Liberal Arts and Science Academy cultivates responsible leaders, problem solvers, and thinkers by offering a nationally recognized, rigorous, innovative, evolving curriculum. ");
   } // end method mission
} // end class tasking