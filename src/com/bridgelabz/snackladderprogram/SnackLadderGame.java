package com.bridgelabz.snackladderprogram;

import java.util.Random;

public class SnackLadderGame {

	public static void main(String[] args) {
		
		int NO_PLAY=0;
	    int LADDER=1;
	    int SNAKE=2;
	    
		    int position1 = 0;
		    int position2 = 0;
		    int playOption=0;
		    int diceNumber=0;
		    int countRolls1=0;
		    int countRolls2=0;
	        Random ranNum = new Random(); 
	        
	    while(position1<100 && position2<100)
	    {	
	    	// player 1
	         playOption = ranNum.nextInt(3);
	        
	        if(playOption == NO_PLAY)
	        	position1 = position1+0;
	        else if(playOption == LADDER)
	        {   
	        	diceNumber = ranNum.nextInt(6)+1;
	        	position1 += diceNumber;
	        	countRolls1++;
	        }else
	        {
	        	diceNumber = ranNum.nextInt(6)+1;
	        	position1 -=diceNumber;
	        	countRolls1++;
	        	//System.out.println("Dice got died :"+position1);
	        }
	        if(position1<0)
	        	position1 = 0;
			
			 if(position1==100) 
				 break;
			 
	        if(position1>100)
	        	position1=position1-diceNumber;
	       // System.out.println("Player1 current position is : "+position1);
	        
	       // player 2
	        
              playOption = ranNum.nextInt(3);
	        
	        if(playOption == NO_PLAY)
	        	position2 = position2+0;
	        else if(playOption == LADDER)
	        {   
	        	diceNumber = ranNum.nextInt(6)+1;
	        	position2 += diceNumber;
	        	countRolls2++;
	        }else
	        {
	        	diceNumber = ranNum.nextInt(6)+1;
	        	position2 -=diceNumber;
	        	countRolls2++;
	        	//System.out.println("Dice got died :"+position1);
	        }
	        if(position2<0)
	        	position2 = 0;
			
			 if(position2==100) 
				 break;
			 
	        if(position2>100)
	        	position2=position2-diceNumber;
	    }   
	        //System.out.println("player 1 Number of Rolls :"+countRolls1);
	        //System.out.println("player 2 Number of Rolls :"+countRolls2);
	        
	        System.out.println("Player1 Final position is : "+position1);
	        System.out.println("Player2 Final position is : "+position2);
	        
	        if(position1==100)
	        	System.out.println("woo-hoo! Player 1 Won the Game : ");
	        else
	        	System.out.println("woo-hoo! Player 2 Won the Game : ");

	}

}
