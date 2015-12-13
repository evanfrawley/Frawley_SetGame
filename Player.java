import java.util.*;

public class Player implements PlayerInterface {

   //fields ?
   private Collection<Set<Card>> hand;
   private int score;

   public Player() {
      this.hand = new ArrayList<Set<Card>>();
      this.score = 0;
      //TODO
   }

   //
   public Board hand(){
      //TODO
      return null;
   }

   //
   public void draw(){
      //TODO
   }

   //
   public void draw(Collection<Card> cards){
      //TODO
   }

   //
   public String toString(){
      //TODO
      return "";
   }

   //
   public int score(){
      return score;
   }

}
