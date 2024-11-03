public class FirstPractice {

   final static int DAYS_PER_WEEK = 7; // Declare and assign an integer constant called DAYS_PER_WEEK

   public static void main(String[] args) {
       // Declare an integer variable x
       int x; // Declare an integer variable x
       x = 27; // assign (or set) it to the integer 27
       System.out.println("x = " + x);  //  print out the variable and its value using System.out.println("x = " + x);
       x = x + 1; // add a statement that assigns x to  x + 1  
       System.out.println("x = " + (x+1)); // prints out x = {value of x + 1}
       System.out.println("x = " + x);   // prints out x = {value of x}


       int largest = 2_147_483_647; // Assign a variable called  largest  to the largest valid positive integer value
       System.out.println("largest = " + largest); // print it out
       System.out.println("largest + 1 = " + (largest + 1)); // print out largest  + 1
       System.out.println("max = " + Integer.MAX_VALUE); // Print out  Integer.MAX_VALUE
       System.out.println("min = " + Integer.MIN_VALUE); // print  Integer.MIN_VALUE
       /*
       Compare these to the largest out largest  + 1 values from above.
       The largest integer is equal to largest and
       the smallest integer is equal to largest + 1
        */
       double y = 6.2; // declare a variable y of type double and set it to 6.2
       System.out.println("y = " + y); // print it
       y = 27; // Assign the double variable y to the  integer 27
       System.out.println("y = " + y); // print it
       // if I try to set x to a double it will through an error
       // x = 6.2;
       // x = 27.0;
       char a = '$';         // Declare and assign a variable a of type char to the character $.
       System.out.println("a = " + a); //  Then print the variable.
       a = '\'';             // Set the variable a to the single quote character '
       System.out.println("a = " + a); // print the variable
       String b;      // Declare the variable b
       b = "Hello";   // assign it to the string "Hello"
       String c = "World";   // declare and set the variable c to "World"
       System.out.print(b + "\n\\\n"  + c + "\n"); // print out the below text using a single print statement
       int days = 212;       // Declare & assign  the value 212 to the integer variable days
       System.out.println(days + " days is " + ((double)days/(double)DAYS_PER_WEEK) + " weeks."); // print (use the variables days and DAYS_PER_WEEK in the calculation inside your print statement)
       int e = 6;            // Declare and assign the variable e to 6
       int f = 27;           // declare and assign  the variable f to 27
       System.out.println(e + " + " + f + " = " + (e+f) + " (not " + e + f + ")");
       double g = 5.8 * 2;   // Declare and assign the variable g to 5.8 * 2
       double h = 2.5;       // Declare and assign  the variable h to 2.5
       System.out.println("integer part of g / h = " + (int)(g/h)); // print integer part of g / h = 4
   }
}