import java.io.*;
import java.util.*;

public class SetClient{
	public static void main(String[] args) throws FileNotFoundException {
		
		//simple really inefficient brute force way of making all 81 card values
		File f = new File("set.txt");
		PrintStream ps = new PrintStream(f);
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 3; k++){
					for(int l = 0; l < 3; l++){
						ps.println("" + i + " " + j + " "+ k + " " + l);
					}
				}
			}
		}
		//TODO
		//get all of the cards put into the set, maybe do some shuffling around would be nice
		//then bucket them until there are no more sets left
		//then prints out all of hte sets in the game
		//
	}
	//end of main
	
}