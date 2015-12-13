import java.util.*;


public class Board implements BoardInterface<Card> {

   private List<Card> board;
   private List<Set<Card>> removed;

   //
   public Board() {

      this.board = new ArrayList<Card>();
      this.removed = new ArrayList<Set<Card>>();
      //TODO
   }

   //
   public Collection<Card> boardState() {
      //TODO
      return null;
   }

   //
   public boolean faceUp() {
      //TODO
      return false;
   }

   //
   public String toString() {
      //TODO
      return "";
   }

   //
   public void add(Card card){
      //do some checks on card
      this.board.add(card);
   }

   public boolean checkThree(){
      //TODO
      return false;
   }

   public boolean checkBoard(){
      //TODO
      return false;
   }

   public Set<Card> remove(){
      //TODO
      return null;
   }


}
