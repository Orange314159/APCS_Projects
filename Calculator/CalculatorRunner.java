import java.util.Scanner;

public class CalculatorRunner
{
	public static void main(String[] args)
	{
		double num1;
		double num2;
		char operator;
		
		//instantiate a Scanner
      Scanner scan = new Scanner(System.in); // adds scanner named scan

		//prompt the user for the operator (how do you read in a character?)
      
      System.out.println("Enter the operator:");
      operator = scan.next().charAt(0);
      

		//setup a set of conditions below to determine if the operator is valid
      if (!( operator == '+' || operator == '-'|| operator == '/'|| operator == '*')){
         System.out.println("Invalid operator");
       }
     else {
      System.out.println("Enter the first operand:");
      num1 = scan.nextDouble();
      System.out.println("Enter the second operand:");
      num2 = scan.nextDouble();
       if (num2 == 0 &&  operator == '/'){
       System.out.println("Cannot Divide by Zero");
       }
      else {
      Calculator calc = new Calculator( operator, num1, num2);
      System.out.println(calc);
      
      }
     }
       
		//get the remaining inputs from the user
		//check for division by zero
		//instantiate Calculator object with the values entered by the user
		//call the toString() method to print the results



	}
}