import java.util.*;

public class SetClient{
	public static void main(String[] args) {

		List<Card> cards = new ArrayList<Card>();
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 3; k++){
					for(int l = 0; l < 3; l++){
						cards.add(new Card(i, j, k, l));
					}
				}
			}
		}
		SetGameManager sgm = new SetGameManager();

		//Random r = new Random();
		int listTracker = 0;
		for(int i = listTracker; i < 12; i++){
			sgm.addToBoard(cards.get(i));
			listTracker++;
		}
		boolean tracker = true;
		while(tracker){
			tracker = sgm.hasSet();
		}
		System.out.println(sgm.completeSets);
		System.out.println(sgm.completeSets.size());
		//TODO
		//get all of the cards put into the set, maybe do some shuffling around would be nice
		//then bucket them until there are no more sets left
		//then prints out all of hte sets in the game
		//

	}
	//end of main

}
