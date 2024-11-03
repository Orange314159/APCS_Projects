public class Calculator
{
	//instance variables (don't add any more)
	private double num1;
	private double num2;
	private char operator;

	//default constructor
	public Calculator()
	{
		num1 = 0;
		num2 = 0;
		operator = 0;
	}
	
	// Write an initialization constructor.
	// The parameters should be in this order 
	//   char double double
	// (matches how you enter the informati)
   public Calculator(char opp, double num11, double num22) {
      num1 = num11;
      num2 = num22;
      operator = opp;
   }
	
	
	//modifier method for num1
	public void setNum1(double n1)
	{
		num1 = n1;
	}
	
	//modifider method for num2
	public void setNum2(double n2)
	{
		num2 = n2;
	}
	
	//modifier method for operator
   public void setOperator(char newOpp) {
      operator = newOpp;
   }


	
	//accessor method for num1
	public double getNum1()
	{
		return num1;
	}
	
	//accessor method for num2
	public double getNum2()
	{
		return num2;
	}
	
	//accessor method for operator
   public char getOperator() {
      return operator;
   }


	
	//Create method called calcResult to calculate the result 
   public double calcResult() {
   double ans = 0.0;
      if (operator == '+') {
         ans = num1 + num2;
      }
      else if (operator == '-') {
         ans = num1 - num2;
      }
      else if (operator == '*') {
         ans = num1 * num2;
      }
      else {
            ans = num1 / num2;
            
      }
      return ans;
   }


	
	//Create the toString() method
	public String toString(){
      return "result = " + calcResult() + "\n" + num1 + " " + operator + " " + num2 + " = " + calcResult(); 
   }
	
}