public class CardTest{
   public static void main(String args[]){
      Card c1 = new Card("K", "spades", 13);
      Card c2 = new Card("J", "spades", 11);
      Card c3 = new Card("Q", "diamonds", 12);
      Card c4 = new Card("Q", "hearts", 12);
      Card c5 = new Card("2", "clubs", 2);
      System.out.println(c1 + ".equals(" + c2 + ") is " + c1.equals(c2));
   }
}