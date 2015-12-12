import java.util.Collection;

//
public interface DeckInterface<Card> {

   //
   public void shuffle();

   //
   public Card draw();

   //
   public Collection<Card> reset();

   //
   public String toString();

}
