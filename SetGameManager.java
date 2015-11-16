import java.util.*;
import java.io.*;

public class SetGameManager {

	public Map<Integer, Set<Card>> cardMap;
	public List<Set<Card>> completeSets;

	public SetGameManager() {

		cardMap = new TreeMap<Integer, Set<Card>>();
		completeSets = new LinkedList<Set<Card>>();
		//12 items, ID's 0-11
		for(int i = 0; i < 12; i++){
			cardMap.put(i, new HashSet<Card>());
		}
	}

	public void bucketer(Card card) {
		//TODO
		//bucket each card
		//call fetch data and remove cards if is complete set
		//
		for(int i = 0; i < card.data.length; i++){
			cardMap.get(3 * i + card.data[i]).add(card);
		}

	}

	//public Set<Card> removeSet(Card card){
		//returns a complete set of cards
	//}

	public int[] fetchData(Card card) {
		return card.data;
	}

	public void gameover(){
		//TODO
		//if game is over, then prints out the sets that are in the List

	}

}
