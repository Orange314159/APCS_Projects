public class QuadraticResult {
   private boolean isReal;
   private int numRoots;
   private double result1;
   private double result2;
   
   public QuadraticResult(){
      isReal   = false;
      numRoots = 0;
      result1  = 0.0;
      result2  = 0.0;
   }
   
   public void setResult1(double nrs){
      result1 = nrs;
   }
   public void setResult2(double nrs){
      result2 = nrs;
   }
   public void setIsReal(boolean isit){
      isReal = isit;
   }
   public void setNumRoots(int howMany){
      numRoots = howMany;
   }
   public String toString(){
      if (isReal){
         if (numRoots == 1){
         return "real root " + result1;
         }
         else {
         return "real root1 " + (result1 + result2) + " real root2 " + (result1 - result2);
         }
      }
      else{
         return "imaginary root1 " + result1 + "+" + result2 + "i imaginary root2 " + result1 + "-" +result2 + "i";
      }     
   }
}