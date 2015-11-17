import java.util.*;
import java.io.*;

public class SetGameManager {

	//public Map<Integer, Set<Card>> cardMap;
	public List<Set<Card>> completeSets;
	public ArrayList<Set<Card>> array;
	public SetGameManager() {

		//cardMap = new TreeMap<Integer, Set<Card>>();
		array = new ArrayList<Set<Card>>();
		completeSets = new LinkedList<Set<Card>>();
		//12 items, ID's 0-11
		for(int i = 0; i < 12; i++){
			array.add(new HashSet<Card>());
		}
	}

	//checkboard

	public void addToBoard(Card card) {
		for(int i = 0; i < card.data.length; i++){
			array.get(3 * i + card.data[i]).add(card);
		}
	}

	public boolean hasSet(){
		for(int i = 0; i < array.size(); i++){
			if(array.get(i).size() >= 3){
				int tracker = 0;
				Set<Card> temp = new HashSet<Card>();
				for(Card c : array.get(i)){
					if(tracker < 3){
						//cardMap.get(key).remove(c);
						removeFromOtherSets(c, i);
						tracker++;
						temp.add(c);
					}
				}
				completeSets.add(temp);
				array.get(i).removeAll(temp);
				return true;

			}

		}
		return false;
	}

	public void removeFromOtherSets(Card c, int i){
		for(int j = 0; j < array.size(); j++){
			if(j != i && array.get(j).contains(c)){
				array.get(j).remove(c);
				//System.out.println("removed " + c);
				System.out.println(array.get(j));
			}
		}
	}

	public void gameover(){
		//TODO
		//if game is over, then prints out the sets that are in the List

	}

}
