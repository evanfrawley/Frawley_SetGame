import java.util.*;
import java.io.*;

public class SetGameManager {
	
	private Set<Card>[] arrayOfSets;
	private List<Set<Card>> completeSets;
	
	public SetGameManager() {
		arrayofSets = new Set<Card>[12];
		completeSets = new LinkedList<Set<Card>>();
	}
	
	public void bucketer(Card card) {
		//TODO 
		//bucket each card
		//call fetch data and remove cards if is complete set
		//
	}
	
	public Set<Card> removeSet(Card card){
		//returns a complete set of cards
	}
	
	public int[] fetchData(Card card) {
		//returns the int arry of the cards
	}
	
	public void gameover(){
		//TODO
		//if game is over, then prints out the sets that are in the List
		
	}
}