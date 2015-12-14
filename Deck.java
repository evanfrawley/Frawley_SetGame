import java.util.LinkedList;
import java.util.Stack;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//
public class Deck implements DeckInterface {

   private Stack<Card> deck;
   private final Collection<Card> ORIGINAL;

   //
   public Deck(Collection<Card> cards){
      this.deck = new Stack<Card>();
      for(Card card : cards){
         this.deck.push(card);
      }
      this.ORIGINAL = cards;

   }

   //
   public void shuffle(){
      List<Card> list = new LinkedList<Card>();
      while(!deck.isEmpty()){
         list.add(deck.pop());
      }
      Collections.shuffle(list);
      while(!list.isEmpty()){
         deck.push(list.remove(0));
      }

   }

   //
   public Card draw(){
      Card card = deck.pop();
      return card;
   }

   //
   public void reset() {
      this.deck.clear();
      for(Card card : ORIGINAL){
         deck.push(card);
      }
      this.shuffle();
   }

   //
   public String toString(){
      return "The deck has " + deck.size() + " cards left";
   }

   //
   public void add(Card card) {
      deck.push(card);
   }

}
