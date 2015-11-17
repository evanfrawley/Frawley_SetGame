import java.util.*;

public class SetManager {

   public List<Set<Card>> completeSets;

   public SetManager() {
      completeSets = new LinkedList<Set<Card>>();
   }

   public boolean checkBoard(ArrayList<Card> list){
      Set<Card> temp = new HashSet<Card>();
      boolean isSet = false;
      for(int i = 0; i < list.size() - 2; i++){
         Card c1 = list.get(i);
         for(int j = i; j < list.size() - 1; j++){
            Card c2 = list.get(j);
            for(int k = j; k < list.size(); k++){
               Card c3 = list.get(k);
               if(checkThree(c1, c2, c3)){
                  temp.add(c1);
                  temp.add(c2);
                  temp.add(c3);
                  list.removeAll(temp);
                  completeSets.add(temp);
                  return true;
               }
            }
         }
      }
      return false;
   }

   public boolean checkThree(Card c1, Card c2, Card c3){
      int size = c1.data.length;
      for(int i = 0; i < size; i++){
         if(c1.data[i] == c2.data[i] && c1.data[i] == c3.data[i]){
            return true;
         }
      }
      return false;
   }
}
