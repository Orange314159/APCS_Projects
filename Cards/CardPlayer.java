import java.util.*;
class CardPlayer extends Player{
   private ArrayList<Card> hand;
   private ArrayList<Card> takenCards;
   
   public CardPlayer(){
      super();
      hand = null;
      takenCards = null;
   }
   
   public void setHand(ArrayList<Card> hand){
      this.hand = hand;
   }
   
   public void setTakenCards(ArrayList<Card> takenCards){
      this.takenCards = takenCards;
   } 
   
   public ArrayList<Card> getHand(){
      return hand;
   }
   
   public ArrayList<Card> getTakenCards(){
      return takenCards;
   }
   
   public void addCard(Card card){
      hand.add(card);
   }
   public Card playCard(int idx){
      return hand.remove(idx);
   }
   public Card chooseCard(ArrayList<Card> round, ArrayList<Card> game){
      Random rand = new Random(); 
      // first check if we have 2 of clubs
      for (int i = 0; i < hand.size(); i++){
         if (hand.get(i).getSuit().equals("Clubs") && hand.get(i).getRank() == 2){
            return this.playCard(i);
         }
      }
      // next check for if I am first player
      if (round.size() < 1){
         return this.playCard(rand.nextInt(hand.size()));
      }
      // next check
      ArrayList<Integer> pc = new ArrayList<Integer>();
      boolean b = false;
      for (Card c : hand){
         if (c.getSuit().equals(round.get(0).getSuit())){
            b = true;
         }
      }
      if (b){
         while (true){
            int r = rand.nextInt(hand.size());
            if (hand.get(r).getSuit().equals(round.get(0).getSuit())){
               return this.playCard(r);
            }
         }
      }
      b = false;
      for (Card c : hand){
         if (c.getSuit().equals("Hearts")){
            b = true;
         }
      }
      if (b){
         while (true){
            int r = rand.nextInt(hand.size());
            if (hand.get(r).getSuit().equals("Hearts")){
               return this.playCard(r);
            }
         }
      }
      return this.playCard(rand.nextInt(hand.size()));
   }
   
   public int indexOf(Card c){
      for (int i = 0; i < hand.size(); i++){
         if (c.equals(hand.get(i))){
            return i;
         }
      }
      return -1;
   }
   
   public String toString(){
      Collections.sort(hand);
      return super.getName() + " (" + super.getScore() + ") " + hand;
   }
}