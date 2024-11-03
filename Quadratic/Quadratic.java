public class Quadratic {
   private double a;
   private double b;
   private double c;
   private QuadraticResult result;
   static int realRoots = 0; 
   static int imaginaryRoots = 0; 


   
   public Quadratic() {
      a = 0;
      b = 0;
      c = 0;
      result = null;
   }  
   
   public Quadratic(double newA, double newB, double newC) {
      a = newA;
      b = newB;
      c = newC;
      result = null;
   }  
   
   public void solve(){
      result = new QuadraticResult();
      
      double dicr = ((b*b) - (4*a*c));
      if (dicr < 0) {
         result.setNumRoots(2);
         result.setIsReal(false);
         dicr = Math.abs(dicr);
         double ans1 = (-b) / (2*a);
         double ans2 = (Math.sqrt(dicr)) / (2*a);
         result.setResult1(ans1);
         result.setResult2(ans2);
         imaginaryRoots ++;
      }
      else if (dicr == 0){
         result.setNumRoots(1);
         result.setIsReal(true);
         dicr = Math.abs(dicr);
         double ans1 = (Math.sqrt(dicr) - b)  / (2*a);
         result.setResult1(ans1);
         realRoots ++;
      }  
      else {
         result.setNumRoots(2);
         result.setIsReal(true);
         dicr = Math.abs(dicr);
         double ans1 = (-b) / (2*a);
         double ans2 = (Math.sqrt(dicr)) / (2*a);
         result.setResult1(ans1);
         result.setResult2(ans2);  
         realRoots ++;

      }
      
   }
   public String toString(){
      String equation = a+"x^2 + " + b + "x + " + c + " ";
      if (result == null){
         return equation + "has not been solved yet!!!";
         }
      else{
         return equation + result.toString();
      }
   }
}