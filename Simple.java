//used to run simple tests on the code

import java.util.*;

public class Simple {
   public static void main(String[] args){
      //List<String> l = new ArrayList<String>();
      //l.add("hi");
      //Card c = new Card(l);
      //System.out.println(c.faceUp());
      //c.faceUp() = true;
      //System.out.println(c.faceUp());

      List<String> list1 = new ArrayList<String>();
      List<String> list2 = new ArrayList<String>();
      List<String> list3 = new ArrayList<String>();

      list1.add("hi");
      list1.add("test");
      list2.add("hi");
      list2.add("okay");
      list3.add("hi");
      list3.add("lol");

      Card c1 = new Card(list1);
      Card c2 = new Card(list2);
      Card c3 = new Card(list3);

      Board b = new Board();
      b.add(c1);
      b.add(c2);
      b.add(c3);

      System.out.println(b.checkThree(c1, c2, c3));
      System.out.println(b.checkBoard());
      System.out.println(b.removed().toString());
   }
}
