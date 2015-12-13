//@author Evan Frawley
//Avve Card to be used in the Set Game

import java.util.Collection;
import java.lang.IllegalArgumentException;
import java.util.ArrayList;
import java.util.List;

public class Card implements CardInterface<String>{

	public final Collection<String> properties;
	// i.e. - the properties can't be changed after being made
	private boolean faceUp;


	//creates a new instance of card
	public Card(Collection<String> prop){
		//iterate through prop, and add into the properties
		if(prop == null || prop.isEmpty()){
			throw new IllegalArgumentException();
		}
		this.properties = new ArrayList<String>(prop);
		this.faceUp = false; //initialized to facedown, boardstate manipulation can change
		//if faceup or fd

	}

	//returns the String representation of the object
	//doesn't add the plural s's anymore after I changed the format of this toString
	public String toString(){
		String ret = "";
		for(String s : this.properties){
			ret += s + " ";
		}
		return ret.trim();//deals with the trailing single whitespace
	}

	//returns the cards properties
	public Collection<String> properties() {
		return this.properties;
	}

	//returns whether or not the card is faceup or facedown
	public boolean faceUp() {
		boolean b = this.faceUp;
		return b;
	}

	//allows for the faceup/down status of the card to change
	public void turnOver(){
		this.faceUp = !this.faceUp;
	}
}
