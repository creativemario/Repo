package uk.co.reformtheempire.games.random;

import java.util.Random;

public class Randomiser {

	public int getRandomInt(int max, int min){
		
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
}
