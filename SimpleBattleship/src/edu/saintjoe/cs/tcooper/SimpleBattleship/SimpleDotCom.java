package edu.saintjoe.cs.tcooper.SimpleBattleship;

public class SimpleDotCom {
	//these next two are our instance variables
	
	//array that holds the location of our dot com
	int[] locationCells;
	
	//keep track of how many times the user guessed a spot where a dot com piece is living
	int numOfHits = 0;
	
	/* ----------------------------------------------------------------------*/
	//stores which cells of our big array are occupied by our dot com
	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}
	
	//checks for a hit, miss, or kill
	//input parameter: a guess, which is a string representation of a number of an array location
	public String checkYourself(String stringGuess) {
		
		//convert from string type to binary type so we can do math with it
		int guess = Integer.parseInt(stringGuess);
		
		//default thing is to miss
		String result = "miss";
		
		//this is exactly a for each in app inventor
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}
