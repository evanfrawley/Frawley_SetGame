import java.util.Collection;

//
public interface PlayerInterface<Card, Board> {

   //
   public Board hand();

   //
   public Card draw();

   //
   public String toString();

   //
   public int score();

}
