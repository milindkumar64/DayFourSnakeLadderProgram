package com.bridgelabz.snackladderprogram;

import java.util.Random;

public class SnackLadderGame {

	public static void main(String[] args) {
		
		int NO_PLAY=0;
	    int LADDER=1;
	    int SNAKE=2;
	    
		    int position = 0;
		    int diceNumber=0;
	        Random ranNum = new Random(); 
	        
	    while(position<100)
	    {	  
	        int playOption = ranNum.nextInt(3);
	        
	        if(playOption == NO_PLAY)
	        	position = position+0;
	        else if(playOption == LADDER)
	        {   
	        	diceNumber = ranNum.nextInt(6)+1;
	        	position += diceNumber;
	        }else
	        {
	        	diceNumber = ranNum.nextInt(6)+1;
	        	position -=diceNumber;
	        }
	        if(position<0)
	        	position = 0;
	        if(position==100)
	        	break;
	        if(position>100)
	        	position=position-diceNumber;
	        System.out.println("Player current position is : "+position);
	    }   
	        
	        
	        System.out.println("Player current position is : "+position);

	}

}
