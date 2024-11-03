public class Collatz {
   private int startNum;
   
   public Collatz(){
      startNum = 1;
   }
   
   public Collatz(int inNum){
      startNum = inNum;
   }
   
   public int steps(){
      int i = 0;
      int num = startNum;
      while (num > 1){
         if (num%2 == 1){
            num = num*3 + 1;
         }
         else {
            num /= 2;
         }
         i++;
      }
      return i;
   }
   
   public int[] sequence(){
      int items = steps()+1;
      int[] i = new int[items];
      i[0] = startNum;
      int j = 1;
      int num = startNum;
      while (num > 1){
         if (num%2 == 1){
            num = num*3 + 1;
         }
         else {
            num /= 2;
         }
         i[j] = num;
         j++;
      }
      return i;    
   }
   
   public int maxValue(){
      int[] i = new int[steps()+1];
      i = sequence();
      int upbd = Integer.MIN_VALUE;
      for(int x : i) {
         if (x > upbd){
            upbd = x;
         }
      }
      return upbd;
   }
   
   public int minOddValue(){
      int[] i = new int[steps()+1];
      i = sequence();
      int lwbd = Integer.MAX_VALUE;
      for(int x : i) {
         if (x < lwbd && x%2 == 1 && x != 1){
            lwbd = x;
         }
      }
      if (lwbd == Integer.MAX_VALUE) {
         return 1;
      }
      return lwbd;
   }
   
   public int[] oddValues(){
      int[] i = sequence();
      int numofOdd=0;
      int oddCounter = 0;
      for (int x : i){
         if (x % 2 == 1){
            numofOdd++;
         }
      }
      int[] k = new int[numofOdd];
      int counter = 0;
      for (int x : i){
         if (x % 2 == 1){
            k[counter] = x;
            counter++;
         }
      }
      return k;   
   }
   
   public int sumValues(){
      int[] i = sequence();
      int sum = 0;
      for (int x : i){
         sum += x;
      }
      return sum;
   
   }
   
   public String toString(){
      return "Starting number " + startNum + " takes " + steps() + " steps";   
   }
}