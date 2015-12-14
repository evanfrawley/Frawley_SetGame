import java.util.*;


public class Board implements BoardInterface<Card> {

   private List<Card> board;
   private List<Set<Card>> removedSets;

   //
   public Board() {

      this.board = new ArrayList<Card>();
      this.removedSets = new ArrayList<Set<Card>>();

   }

   //
   public ArrayList<Card> boardState() {
      ArrayList<Card> temp = new ArrayList<Card>(this.board);
      return temp;
   }

   //
   public String toString() {
      return this.board.toString();
   }

   //
   public void add(Card card){
      //do some checks on card
      this.board.add(card);
   }

   //I'm still pretty unhappy about how ugly this method is, but I'll settle for it because it works
   public boolean checkThree(Card card1, Card card2, Card card3){

      int size = card1.properties.size();

      //this really yucky for loop is being used to find the groups of 3 cards where
      //property's have 2 of a kind but not 3 of a kind

      ArrayList<String> list1 = card1.properties();
      ArrayList<String> list2 = card2.properties();
      ArrayList<String> list3 = card3.properties();

      for(int i = 0; i < size; i++){
         System.out.println("test");
         //if card1's property == card2's property
         if(list1.get(i).equals(list2.get(i))){
            //and if card1's property != card3's property
            System.out.println("test1");
            if(!list1.get(i).equals(list3.get(i))){
               return false;
            }
         //if card1's property == card3's property
         } else if (list2.get(i).equals(card3.properties().get(i))){
            //and if card1's property != card2's property
            System.out.println("test2");
            if(!list1.get(i).equals(list3.get(i))){
               return false;
            }
         //if card2's property == card3's property
         } else if(list3.get(i).equals(list1.get(i))){
            System.out.println("test3");
            //and if card1's property != card2's property
            if(!list1.get(i).equals(list2.get(i))){
               return false;
            }
         }
      }

      return true;
   }

   //calls check three recursively on the board
   public boolean checkBoard(){
      //this can still be improved
      Set<Card> temp = new HashSet<Card>();
      Card c1;
      Card c2;
      Card c3;
      for(int i = 0; i <= this.board.size() - 3; i++){
         c1 = this.board.get(i);
         for(int j = i + 1; j <= this.board.size() - 2; j++){
            c2 = this.board.get(j);
            for(int k = j + 1; k <= this.board.size() - 1; k++){
               c3 = this.board.get(k);
               if(checkThree(c1, c2, c3)){
                  temp.add(c1);
                  temp.add(c2);
                  temp.add(c3);
                  removedSets.add(temp);
                  this.board.removeAll(temp);
                  return true;
               }
            }
         }
      }
      return false;
   }

   //goal is to have this remove all of the instances of the three cards if they match
   public boolean remove(Card card){
      return this.board.remove(card);
   }

   public List<Set<Card>> removed(){
      List<Set<Card>> sets = this.removedSets;
      return sets;
   }

}
