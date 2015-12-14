import java.util.*;

public class Player implements PlayerInterface<Card, Board, Deck> {

   //fields ?
   private Collection<Set<Card>> completeSets; //this is functionally the player's "hand"
   //do i want t
   private int score;

   public Player() {
      this.completeSets = new ArrayList<Set<Card>>();
      this.score = 0;
      //TODO
   }

   //
   public Board hand(){
      Board b = new Board();
      for(Set<Card> s : completeSets){
         for(Card c : s){
            b.add(c);
         }
      }
      return b;
   }

   //
   public Card draw(Deck d){
      if(!d.isEmpty()){
         return d.draw();
      }
      return null;
   }

   //
   public String toString(){
      return "I have a score of " + score +   "!";
   }

   //
   public int score(){
      return score;
   }

   //
   public boolean play(Board b){
      //TODO
      Set<Card> s = b.getSet();
      if(s != null){
         this.completeSets.add(s);
         this.score++;
         return true;
      }
      return false;

   }

}
