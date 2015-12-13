import java.util.*;

public class NewSetManager {

   public static void main(String[] args){

   }

   private String[][] attributes = new String[4][3];
   private Deck deck;
   private Board board;
   private Player player;

   public NewSetManager() {

      String[] color = {"red", "purple", "green"};
      String[] shading = {"solid", "empty", "striped"};
      String[] number = {"1", "2", "3"};
      String[] shape = {"diamond", "oval", "squiggle"};

      attributes[0] = color;
      attributes[1] = shading;
      attributes[2] = number;
      attributes[3] = shape;

      this.deck = new Deck(this.makeDeck());
      this.board = new Board();
      this.player = new Player();

   }

   public List<Card> makeDeck() {

      List<String> list = new ArrayList<String>();
      List<Card> cards = new ArrayList<Card>();
      int counter = 0;
      return deckHelper(list, cards, counter);

   }

   private List<Card> deckHelper(List<String> list, List<Card> cards, int counter){

      //base case
      if(list.size() == 4) {
         cards.add(new Card(list));
      } else {
         for(int i = 0; i < 3; i++){
            list.add(attributes[counter][i]);
            deckHelper(list, cards, counter + 1);
            list.remove(counter);
         }
      }

      return cards;

   }
   //check three


   //check board state

   //plays whole game with a player?



}
