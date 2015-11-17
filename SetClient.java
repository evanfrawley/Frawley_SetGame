//@author Evan Frawley
//Avvo SetGame Client
//intended to be run in terminal/command line

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import java.util.*;

public class SetClient{

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		String userChoice = "placeholder";

		while(!userChoice.equals("")){
			System.out.println("Type what you want to do:");
			System.out.println("Check three cards: i -- Check board: love -- Play game: programming");
			userChoice = console.nextLine();
			SetManager sm = new SetManager();

			if(userChoice.equalsIgnoreCase("i")){
				Card c1 = sm.oneCard();
				Card c2 = sm.oneCard();
				Card c3 = sm.oneCard();
				if(sm.checkThree(c1, c2, c3)){
					System.out.println("Three randomly generated cards are a set");
				} else {
					System.out.println("Three randomly generated cards are NOT a set");
				}
				System.out.println(c1 + ", " + c2 + ", " + c3);

			} else if(userChoice.equalsIgnoreCase("love")){
				if(sm.checkBoard()){
					System.out.println("The board had this set:");
					sm.gameover();
				} else {
					System.out.println("The board had no sets");
				}

			} else if(userChoice.equalsIgnoreCase("programming")){
				sm.playGame();

			} else {
				System.out.println("Please enter something else");
			}

			System.out.println("Press enter to exit");
			System.out.println();

		}
	}
}
