//@author Evan Frawley December 2015 - PlayerInterface

import java.util.Collection;

//
public interface PlayerInterface<Card, Board> {

   //
   public Board hand();

   //
   public void draw();

   //
   public String toString();

   //
   public int score();

   //
   public void play();

}
