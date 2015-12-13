import java.util.*;

public class Simple {
   public static void main(String[] args){
      List<String> l = new ArrayList<String>();
      l.add("hi");
      Card c = new Card(l);
      System.out.println(c.faceUp());
      c.faceUp() = true;
      System.out.println(c.faceUp());
   }
}
