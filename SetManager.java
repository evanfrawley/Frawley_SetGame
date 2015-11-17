//

import java.util.*;

public class SetManager {

   public List<Set<Card>> completeSets;

   public SetManager() {
      completeSets = new LinkedList<Set<Card>>();
   }

   public ArrayList checkBoard(ArrayList<Card> list){
      Set<Card> temp = new HashSet<Card>();
      boolean isSet = false;
      Card c1;
      Card c2;
      Card c3;
      for(int i = 0; i <= list.size() - 3; i++){
         c1 = list.get(i);
         for(int j = i + 1; j <= list.size() - 2; j++){
            c2 = list.get(j);
            for(int k = j + 1; k <= list.size() - 1; k++){
               c3 = list.get(k);
               if(checkThree(c1, c2, c3)){
                  temp.add(c1);
                  temp.add(c2);
                  temp.add(c3);
                  completeSets.add(temp);
                  list.removeAll(temp);
                  return list;
               }
            }
         }
      }
      return list;
   }

   public boolean checkThree(Card c1, Card c2, Card c3){
      int size = c1.data.length;
      for(int i = 0; i < size; i++){
         if(c1.data[i] == c2.data[i] && c1.data[i] == c3.data[i] && c2.data[i] == c3.data[i]){
            return true;
         }
      }
      return false;
   }

   public void gameover(){
      for(Set<Card> set : completeSets){
         System.out.println(set.toString());
      }
      System.out.println(completeSets.size());
   }
}
