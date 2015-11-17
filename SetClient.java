//

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class SetClient{

	public static void main(String[] args) {

		ArrayList<Card> cards = new ArrayList<Card>();
		ArrayList<Card> board = new ArrayList<Card>();
		Stack<Card> deck = new Stack<Card>();
		Random r = new Random();
		SetManager sm;
		Scanner console = new Scanner(System.in);



		String userChoice = "placeholder";

		while(!userChoice.equals("")){
			System.out.println("Type what you want to do:");
			System.out.println("Check three cards: i -- Check board: love -- Play game: programming");
			userChoice = console.nextLine();
			sm = new SetManager();
			makeCards(cards);
			makeDeck(cards, deck, r);

			if(userChoice.equalsIgnoreCase("i")){
				Card c1 = deck.pop();
				Card c2 = deck.pop();
				Card c3 = deck.pop();
				if(sm.checkThree(c1, c2, c3)){
					System.out.println("Three randomly generated cards are a set");
				} else {
					System.out.println("Three randomly generated cards are NOT a set");
				}

			} else if(userChoice.equalsIgnoreCase("love")){
				initBoard(board, deck);
				int old = board.size();
				if(checkBoard(board, sm, old)){
					System.out.println("The board had this set:");
					sm.gameover();
				} else {
					System.out.println("The board had no sets");
				}

			} else if(userChoice.equalsIgnoreCase("programming")){
				playGame(sm, board, deck);

			} else {
				System.out.println("Please enter something else");
			}
			System.out.println("Press enter to exit");
			System.out.println();
		}
		//have interactions
	}
	//end of main

	//
	public static void makeCards(ArrayList<Card> cards){
		cards.clear();
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 3; k++){
					for(int l = 0; l < 3; l++){
						cards.add(new Card(i, j, k, l));
					}
				}
			}
		}
	}

	//
	public static void initBoard(ArrayList<Card> board, Stack<Card> deck){
		board.clear();
		for(int i = 0; i < 12; i++){
			board.add(deck.pop());
		}
	}

	//
	public static void makeDeck(ArrayList<Card> cards, Stack<Card> deck, Random r){
		deck.clear();
		while(!cards.isEmpty()){
			int num = r.nextInt(cards.size());
			deck.push(cards.remove(num));
		}
	}

	//
	public static void playGame(SetManager sm, ArrayList<Card> board, Stack<Card> deck){
		System.out.println("");
		initBoard(board, deck);
		while(!deck.isEmpty()){
			int old = board.size();
			boolean hasSets = true;
			while(hasSets){
				hasSets = checkBoard(board, sm, old);
				old = board.size();
			}
			board.add(deck.pop());
			board.add(deck.pop());
			board.add(deck.pop());
		}
		System.out.println("The game was played!");
		System.out.println("These are the sets that were made:");
		System.out.println("");

		sm.gameover();

	}

	//
	public static boolean checkBoard(ArrayList<Card> board, SetManager sm, int old){
		int num = sm.checkBoard(board).size();
		return old != num;
	}
}
