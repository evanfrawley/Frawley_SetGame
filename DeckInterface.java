//@author Evan Frawley December 2015 - DeckInterface

import java.util.Collection;

//
public interface DeckInterface<Card> {

   //
   public void shuffle();

   //
   public Card draw();

   //
   public void reset();

   //
   public String toString();

}
