//@author Evan Frawley December 2015 - CardInterface

import java.util.Collection;
import java.util.*;

//
public interface CardInterface<E> {

   //
   public ArrayList<E> properties();

   //
   public boolean isFaceUp();

   //
   public String toString();

   //
   public void turnOver();
}
