/** A dice object with not only sides and a value but also a color and a name. 
  * @author Rainer Mueller
  * @version 1.4
*/
public class Dice {
	
   // DATA OF A DICE OBJECT
   //   EACH DICE OBJECT YOU CREATE HAS ITS OWN VALUES FOR THIS DATA
   /** name of the dice */
   private String name;

   /** sides (number of) for the dice */
   private int sides;

   /** value of the dice */
   private int value;

   /** color of the dice */
   private String color;


   // STATIC DATA FOR THE DICE CLASS
   //   THERE IS ONLY ONE COPY OF EACH STATIC CLASS VARIABLE PER CLASS,
   //   REGARDLESS HOW MANY OBJECTS ARE CREATED FROM THE CLASS.
   //** count of the total number dice created */
   public static int numDice;

   //** count of the total number of rolls made */
   public static int rolls;

   //** sum of all the rolls values */
   public static int total;


   // DEFAULT CONSTRUCTOR
   /** Creates a 6-sided red dice with the name "dice" and initial value of 1 
    *  (also increments the total number dice by 1)
   */
   public Dice() {
      name = "dice";
      sides = 6;
      value = 1;
      color = "red";
      numDice ++;      
   }
 
   // INITIALIZATION CONSTRUCTOR
   /** Creates a dice with the specified name, number of sides, initial value and color.
     * @param initName The name of the dice
     * @param initSides The number of sides of the dice
     * @param initValue The initial value of the dice
     * @param initColor The color of the dice
   */    
   public Dice(String initName, int initSides, int initValue, String initColor) {
      name  = initName;
      sides = initSides;
      value = initValue;
      color = initColor;
      numDice++;
   }
   
   // ACCESSOR METHODS
   /** Get a name of the dice.
    * @return the name of the dice (a string).
   */   
   public String getName() {
      return name;
   }

   /** Get the number of sides of the dice.
    * @return the number of sides of the dice (an integer).
   */  
   public int getSides() {
      return sides;
   } 

   /** Get the current value of the dice.
    * @return the current value of the dice.
   */   
   public int getValue() {
      return value;
   }


   /** Get the color of the dice.
    * @return the color of the dice.
   */   
   public String getColor() {
      return color;
   }

   // MODIFIER METHODS    
   /** Set the current value of the dice.
    * @param newValue the new value of the dice.
   */   
   public void setValue(int newValue) {
      value = newValue;
   }

   // OTHER USEFUL METHODS    
   /** Roll the dice - randomly sets value to a value between 1 and number of sides (inclusive) 
    * @return the value of the dice after a roll.
    * increment the count of the total number of rolls made
    * add the roll to the sum of all the rolls values
   */
   public int roll() {
      value = (int) (Math.random() * sides) + 1;
      rolls ++;
      total += value;
      return value;
   }

   // toString()    
   /** Returns a string representing the dice object
    *    string format  name (sides=# value=# color=#)
   */
   public String toString() {
      return name + " (sides=" + sides + " value=" + value + " color=" + color +")" ;
   }

}