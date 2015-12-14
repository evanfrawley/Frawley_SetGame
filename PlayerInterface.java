//@author Evan Frawley December 2015 - PlayerInterface

import java.util.Collection;

//
public interface PlayerInterface<Card, Board, Deck> {

   //
   public Board hand();

   //
   public Card draw(Deck d);

   //
   public String toString();

   //
   public int score();

   //
   public boolean play(Board b);

}
