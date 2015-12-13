//@author Evan Frawley December 2015 - CardInterface

import java.util.Collection;

//
public interface CardInterface<E> {

   //
   public Collection<E> properties();

   //
   public boolean isFaceUp();

   //
   public String toString();

   //
   public void turnOver();
}
