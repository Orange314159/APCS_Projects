// 1. declare a class in which to put the main method
public class UsingDiceObjects {

   // 2. declare the main method
   public static void main(String[] args) 
   {
   
      // 3. create an instance of a dice object named dice1 (use the default constructor)
      Dice dice1 = new Dice();
      
      // 4. create an instance of a dice object named dice2 (use the default constructor)
      Dice dice2 = new Dice();
      
      System.out.println("Initialized dice 1 & 2");
      // 5. print out the return value of dice1's toString() method
      System.out.println(dice1.toString()); 
      // 6. print out the dice2 object
      System.out.println(dice2); 

      // 7. roll dice1 (i.e. call the dice's roll() method)      
      dice1.roll();
      // 8. roll dice2 (i.e. call the dice's roll() method)      
      dice2.roll();
      
      System.out.println("\nRolled dice 1 & 2");
      // 9. print out the dice1 object
      System.out.println(dice1); 
      // 10. print out the dice2 object
      System.out.println(dice2);  

      /* 11. create an instance of a dice object named dice3
             use an intialization constructor to initalize 
               name to "intelligence"
               sides to 20
               value to 10
               color to "green" 
      */
      Dice dice3 = new Dice("intelligence",20,10,"green");

      /* 12. create an instance of a dice object named dice3
             use an intialization constructor to initalize 
               name to "perseverance"
               sides to 12
               value to 7
               color to "yellow" 
      */
      Dice dice4 = new Dice("perseverance",12,7,"yellow");
     
      System.out.println("\nInitialized dice 3 & 4");
      // 13. print out the dice3 object
      System.out.println(dice3); 
      // 14. print out the dice4 object
      System.out.println(dice4); 
   
      // 15. roll dice3      
      dice3.roll();
      // 16. roll dice4      
      dice4.roll();
      
      System.out.println("\nRolled dice 3 & 4");
      // 17. print out the dice3 object
      System.out.println(dice3); 
      // 18. print out the dice4 object
      System.out.println(dice4);  
 
      /* 19. print out the following information about dice4
               The <name> dice has <sides> sides.
               The <name> dice's current value is <value>.
               The <name> dice's color is <color>.
      */
   
      System.out.println("\nThe " + dice4.getName() + " dice has " + dice4.getSides() + " sides.");
      System.out.println("The " + dice4.getName() + " dice's current value is " + dice4.getValue() + ".");
      System.out.println("The " + dice4.getName() + " dice's color is " + dice4.getColor() + ".");
      
      /* 20. set dice4's value to 7 and print 
               The <name> dice's new value is <value>.
      */
      dice4.setValue(7);
      System.out.println("The " + dice4.getName() + " dice's new value is " + dice4.getValue() + ".");
      
      System.out.println("\nThere are " + Dice.numDice + " dice.");
      System.out.println("Total number of rolls " + Dice.rolls);
      System.out.println("Total of all the rolls " + Dice.total);
   }    
}
