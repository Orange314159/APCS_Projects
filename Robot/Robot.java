import java.util.Random;   // for predictable random numbers

public class Robot  
{  
   /** Distance, in inches, from the starting position to the goal. */  
   private int goalDistance;  
   /** Maximum number of moves allowed to reach the goal. */ 
   private int maxMoves;  
   
   Random random = new Random(27000);  // predictable random numbers

   /** Constructs a default Robot object which is 100 inches, from the starting  
     * position to the goal, and with 10 maximum number of moves allowed to reach the
     * goal.  
   */ 
   public Robot()  
   {  
      goalDistance = 100;  
      maxMoves = 10;  
   }  

   /** Constructs a Robot object where dist is the distance, in inches, from the starting  
     * position to the goal, and maxMoves is the maximum number of moves allowed to reach the
     * goal.  
     * Precondition: dist > 0; maxMoves > 0  
   */  
    public Robot(int dist, int numMoves)  
    {  
       goalDistance = dist;  
       maxMoves = numMoves;  
    }

   /** Returns an integer representing the distance, in inches, to be moved when the robot moves. 
    *  The integer returned is a random integer between -6 and 20 (inclusive).
   */  
   public int moveDistance()  
   {
      
      int randNum = (int) (random.nextFloat() * 27) - 6;
      return  randNum;
    /* to be implemented in part (a) */   
    }
     
   /** Simulates a robot attempting to reach the goal as described in part (b).  
     * Returns true if the robot successfully reached or passed the goal during the simulation;  
     * false otherwise.  
   */ 
   public boolean simulate(boolean printInfo)  
   { 
      // init vars
      int moves = 0;
      int distance = 0;
      int distmoved = 0;
      
      // while loop
      while (maxMoves > moves)
      {
         // inc moves
         moves ++;
         // find randnum
         distmoved =  moveDistance();
         // check if we should print how far
         if (printInfo) {
            System.out.print(distance+"("+distmoved+") ");
            }
         // move
         distance += distmoved;
         // check if we reach goal
         if (distance >= goalDistance)
         {
            // check if we should print results
            if (printInfo){
               System.out.println("final position is " + distance);
            }
            // we reached goal
            return true;
         }
         // check if we should print results and if distance is less than 0
         if (distance < 0){
            if (printInfo){
               System.out.println("final position is " + distance);
            }
            // number is < 0
            return false;
         }
      }
      // check if we should print results
      if (printInfo){
               System.out.println("final position is " + distance);
      }
      // took too many attempts
      return false;
    } 
   
   /** Runs num simulations and returns the proportion of simulations in which the robot 
     * successfully reached or passed the goal.  
     * Precondition: num > 0  
   */ 
   public double runSimulations(int num)  
   {
      int tests = 0;
      int success = 0;
      while (num > tests){
         
         if (simulate(false))
         {
            success++;
         } 
         
         tests++;
      }
      double percentWin = ((double)success / (double) num);
      return percentWin;
   }  
   
} 
