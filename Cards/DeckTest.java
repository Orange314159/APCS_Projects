public class DeckTest{
   public static void main(String[] args){
      Deck d1 = new Deck();
      int sum = 0;
      for (int i = 0; i < 10000; i++){
         d1.initializeDeck();
         d1.shuffle();
         sum += d1.getCard(0).getRank();
      }
      System.out.println(sum/10000.0);
      


   }
}