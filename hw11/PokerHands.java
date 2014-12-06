//Eric Glynn
//HW 10
//11/20/14

import java.util.Scanner;
public class PokerHands{
  public static void main(String [] arg){
      int [] hand = inputHand(); //create hand
      hand = sortHand(hand); //sort hand
      showOneHand(hand); //display hand
      valueHand(hand); //value hand
  }
  
  
public static int[] inputHand(){
    Scanner scan=new Scanner(System.in);
    int [] hand = new int[5]; //create array of five integers
    
    for(int i = 0; i < hand.length -1 ; i++){
        System.out.println("Enter the suit, 'c', 'd', 'h', or 's': ");
        String line = scan.next();
        char[] convert = line.toCharArray();
        if(convert[0] != 'c' && convert[0] != 'd'&& convert[0] != 'h' && convert[0] != 's' && convert.length > 1) 
        { i--;}
        else{
            System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2':");    
            int num;
            if(scan.hasNextInt()){
                num = scan.nextInt();
                if(num > 10 || num < 2){
                    System.out.println("NUMBER NOT VALID");
                    i--;
                }
                num -=2; //num - 2 b/c array index 0 corresponds to a 2
                
            }
            else{
                 String line2 = scan.next();
                 char[] convert2 = line.toCharArray();
                 if(convert[0] == 'a' && convert[0] == 'k'&& convert[0] == 'q' && convert[0] == 'j' && convert.length > 1){
                     if(convert[0] == 'a') num = 12; 
                     if(convert[0] == 'k') num = 11;
                     if(convert[0] == 'q') num = 10;
                     if(convert[0] == 'j') num = 9;
                 }
                 else{
                     System.out.println("Inccorrrect input");
                     i--;
                 }
                
            }
                    
                
            }

                
            }
            
           return hand; //return hand
        }
        
        public static int[] sortHand(int[] hand){ //sorts hand in asscending order
		int j;
		boolean flag = true;   // set flag to true to begin first pass
		int temp;   //holding variable

		while ( flag )
		{
			flag= false;    //set flag to false awaiting a possible swap
			for( j=0;  j < hand.length -1;  j++ )
			{
				if ( hand[ j ] > hand[j+1] )   
				{
					temp = hand[ j ];                //swap elements
					hand[ j ] = hand[ j+1 ];
					hand[ j+1 ] = temp;
					flag = true;              //shows a swap occurred  
				} 
			} 
		} 


		return hand;
	}
    
    

  
  
  
public static void showOneHand(int hand[]){//display hand. provided
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }  
  
  public static void valueHand(int[] hand){ //checks all values in order of priority
		if(isRoyalFlush(hand)) System.out.println("ROYAL FLUSH");
		else if(isStraightFlush(hand)) System.out.println("Straight Flush");
		else if(isFourofaKind(hand)) System.out.println("Four of a kind");
		else if(isFullHouse(hand)) System.out.println("Full House");
		else if(isFlush(hand)) System.out.println("Flush");
		else if(isStraight(hand)) System.out.println("Straight");
		else if(isThreeofaKind(hand)) System.out.println("Three of a kind");
		else if(isTwoPair(hand)) System.out.println("Two Pair");
		else if(isPair(hand)) System.out.println("Pair");
		else System.out.println("High Card");
	}
	
	public static boolean isRoyalFlush(int[] hand){//check for royal flush
		if(hand[0]%13 == 8){
			if(hand[1]%13 == 9 && hand[0]/13 == hand[1]/13){
				if(hand[2]%13 == 10 && hand[1]/13 == hand[2]/13){
					if(hand[3]%13 == 11 && hand[2]/13 == hand[3]/13){
						if(hand[4]%13 == 12 && hand[3]/13 == hand[4]/13){
							return true;
						}
					}
				}
				
			}
		}
		return false;
	}
	
	public static boolean isStraightFlush(int[] hand){//check for straight flush
		return (hand[0] + 1 == hand[1] && hand[1] + 1 == hand[2] && hand[2] + 1 == hand[3] && hand[3] + 1 == hand[4] );
	}
	
	public static boolean isFourofaKind(int hand[]){//check for 4 of a kind
		int counter = 0;
		if(checkPair(hand[0],hand[1])) counter++;
		if(checkPair(hand[1],hand[2])) counter++;
		if(checkPair(hand[2],hand[3])) counter++;
		if(checkPair(hand[3],hand[4])) counter++;
		if(checkPair(hand[4],hand[0])) counter++;
		return counter == 4;
	}
	
	
	
	
	public static boolean isFullHouse(int[] hand){//check for full house
		if (checkPair(hand[0],hand[1])){
			if(checkPair(hand[0],hand[2]) ){
				if(checkPair(hand[3],hand[4])){
					return true;
				}
			}
			else if(checkPair(hand[2],hand[3])){
				return true;
			}
		}
		return false;
	}
			
		
	
	public static boolean isFlush(int[]hand){//check for flush
		return hand[0]/13 == hand[1]/13 && hand[1]/13 == hand[2]/13 && hand[2]/13 == hand[3]/13 && hand[3]/13 == hand[4]/13; 
	}

	public static boolean isStraight(int[]hand){//check for straight
		return hand[0]%13 == hand[1]%13 - 1 && hand[1]%13 == hand[2]%13 - 1 && hand[2]%13 == hand[3]%13 - 1 && hand[3]%13 == hand[4]%13 - 1;
	}
	
	public static boolean isThreeofaKind(int hand[]){//check for 3 of a kind
		int counter = 0;
		if(checkPair(hand[0],hand[1])) counter++;
		if(checkPair(hand[1],hand[2])) counter++;
		if(checkPair(hand[2],hand[3])) counter++;
		if(checkPair(hand[3],hand[4])) counter++;
		if(checkPair(hand[4],hand[0])) counter++;
		return counter == 3;
	}
	
	public static boolean isTwoPair(int hand[]){//check for 2pair
		int counter = 0;
		if(checkPair(hand[0],hand[1])) counter++;
		if(checkPair(hand[1],hand[2])) counter++;
		if(checkPair(hand[2],hand[3])) counter++;
		if(checkPair(hand[3],hand[4])) counter++;
		if(checkPair(hand[4],hand[0])) counter++;
		return counter == 2;
	}
	
	public static boolean isPair(int hand[]){//check for pair
		int counter = 0;
		if(checkPair(hand[0],hand[1])) counter++;
		if(checkPair(hand[1],hand[2])) counter++;
		if(checkPair(hand[2],hand[3])) counter++;
		if(checkPair(hand[3],hand[4])) counter++;
		if(checkPair(hand[4],hand[0])) counter++;
		return counter == 1;
	}
	
	
	
	
	
	
	
	
	public static boolean checkPair(int x, int y){//aux method used to check for pair between cards
		return (x%13 == y%13);
	}


}








