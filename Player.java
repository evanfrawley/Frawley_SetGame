import java.util.*;

public class Player implements PlayerInterface {

   //fields ?
   private Collection<Set<Card>> completeSets; //this is functionally the player's "hand"
   //do i want t
   private int score;

   public Player() {
      this.hand = new ArrayList<Set<Card>>();
      this.score = 0;
      //TODO
   }

   //
   public Board hand(){
      Board b = new Board();
      for(Set<Card> s : compleSets){
         for(Card c : s){
            b.add(c);
         }
      }
      return b;
   }

   //
   public void draw(Deck d){
      if(!d.isEmpty()){
         return d.draw();
      }
   }

   //
   public String toString(){
      //TODO
      return "I have a score of " + score "!";
   }

   //
   public int score(){
      return score;
   }

   //
   public void play(){
      //TODO
   }

}
