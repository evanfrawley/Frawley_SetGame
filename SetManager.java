//@author Evan Frawley
//Avvo SetManager object

//The purpose of this object is to manager the functionalities of a game of Set
//The object has numerous functionalities, of which include being able to
//determine if 3 cards are a set, to determine if a given board state has a set
//and the ability to play an entire game and print all of the sets from that game.

import java.util.*;
public class SetManager {

   private List<Set<Card>> completeSets;
   private ArrayList<Card> cards;
   private ArrayList<Card> board;
   private Stack<Card> deck;

   //general constructor -- since each instance of SetManager is inteded to be new
   //the constructor initializes a new set of cards and a new deck of cards each instantiation
   public SetManager() {
      completeSets = new LinkedList<Set<Card>>();
      cards = new ArrayList<Card>();
      board = new ArrayList<Card>();
      deck = new Stack<Card>();
      makeCards();
      makeDeck();
   }

   //checks a given board state for a set, and returns true once it find the first set
   //adds that set to the completed sets and removes that set from the board state if true
   public boolean checkBoard(){
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
                  completeSets.add(temp);
                  this.board.removeAll(temp);
                  return true;
               }
            }
         }
      }
      return false;
   }

   //takes in 3 Card objects and returns true if they are a set, iterating through the 4
   //different variables that the set could be
   public boolean checkThree(Card c1, Card c2, Card c3){
      int size = c1.data.length;
      boolean bool = true;
      for(int i = 0; i < size; i++){
         int total = c1.data[i] + c2.data[i] + c3.data[i];
         if(total % 3 != 0){
            bool = false;
         }
      }
      return bool;
   }

   //prints out all of the sets that were removed from a boardstate
   public void gameover(){
      for(Set<Card> set : completeSets){
         System.out.println(set.toString());
      }
      System.out.println(completeSets.size());
   }

   //makes a new group of 81 cards (3^4 and the amount in a game of Set)
   private void makeCards(){
		this.cards.clear();
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 3; k++){
					for(int l = 0; l < 3; l++){
						this.cards.add(new Card(i, j, k, l));
					}
				}
			}
		}
	}

	//intializes a new baord state, which was given to be 12
	private void initBoard(){
		this.board.clear();
		for(int i = 0; i < 12; i++){
			this.board.add(deck.pop());
		}
	}

	//takes the cards made, shuffles them, and inserts them into a new deck
	private void makeDeck(){
		this.deck.clear();
      Random r = new Random();
		while(!cards.isEmpty()){
			int num = r.nextInt(cards.size());
			this.deck.push(cards.remove(num));
		}
	}

	//plays an entire game of Set, adding 3 if the boardState doesn't have a set, and removing
   //sets from the board state until there are no sets left and no cards in the deck left
   //prints all of the found sets at the end.
	public void playGame(){
		System.out.println("");
		initBoard();
		while(!deck.isEmpty()){
			int old = board.size();
			boolean hasSets = true;
			while(hasSets){
				hasSets = checkBoard();
			}
			this.board.add(this.deck.pop());
			this.board.add(this.deck.pop());
			this.board.add(this.deck.pop());
		}
		System.out.println("The game was played!");
		System.out.println("These are the sets that were made:");
		System.out.println("");
		this.gameover();
	}

   //returns the top card from the deck
   public Card oneCard(){
      if(!deck.isEmpty()){
         return deck.pop();
      }
      return null;
   }
}
