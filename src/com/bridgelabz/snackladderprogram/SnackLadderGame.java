package com.bridgelabz.snackladderprogram;

import java.util.Random;

public class SnackLadderGame {

	public static void main(String[] args) {
		
        int position = 0;
        Random ranNum = new Random(); 
        
        int diceNumber = ranNum.nextInt(6)+1;
        
		
        System.out.println(diceNumber);
	}

}