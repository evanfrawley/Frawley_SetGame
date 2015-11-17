//

public class Card {

	public int[] data;

	//				Table of Values
	//	   		0			1			2
	//Color		red		green		purple
	//Shape		diamond	squiggle	oval
	//Shading	solid 	empty 	striped
	//Number		1			2			3
	//how it works: since i knwo that i am putting these values in a certain order
	//i can put the card objec tinto its respective set by knowing that the exact
	//indices that i add the object is (3 * i) + the value of the array at i, this maxes out
	//at 11, which is the last indices of the Manager's array field

	public Card(int color, int shape, int shading, int number){
		data = new int[4];
		data[0] = color;
		data[1] = shape;
		data[2] = shading;
		data[3] = number;
	}

	//return the String representation of the card object
	//if I had more time I would figure out a way to optimize this
	public String toString(){
		String color = "";
		String shape = "";
		String shading = "";
		String number = "";
		String plural = "";
		if(data[0] == 0){
			color = "red";
		} else if (data[0] == 1){
			color = "green";
		} else {
			color = "purple";
		}
		if(data[1] == 0){
			shape = "diamond";
		} else if (data[1] == 1){
			shape = "squiggle";
		} else {
			shape = "oval";
		}
		if(data[2] == 0){
			shading = "solid";
		} else if (data[2] == 1){
			shading = "empty";
		} else {
			shading = "striped";
		}
		if(data[3] == 0){
			number = "one";
		} else if (data[3] == 1){
			number = "two";
			plural = "s";
		} else {
			number = "three";
			plural = "s";
		}
		return number + " " + color + " " + shading + " " + shape + plural;
	}

}
