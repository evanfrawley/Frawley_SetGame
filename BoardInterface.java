//@author Evan Frawley December 2015 - BoardInterface

import java.util.Collection;

//the interface that will be used to implement a collection of cards for a card game
public interface BoardInterface<Card> {


   //for returning the collection of cards that make up the current boardstate
   public Collection<Card> boardState();

   //returns whether or not the board is face up or facedown
   public boolean faceUp();

   //returns the string representation of the boardstate
   public String toString();

   //adds a card to the boardstate
   public void add(Card card);

}
