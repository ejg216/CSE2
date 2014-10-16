//Eric Glynn
//10/15/14
//Roulette Program

/*This program will run 1000 repetitions of the 100-spin simulation, compute the number of times you
lose everything (my number never comes up), compute the total winnings (of all simulations added together), 
and compute the number of times you walked away with a profit in one session of 100 spins of the wheel*/

public class Roulette{//  begin class
public static void main(String[] args){ //begin the main method
int realizedGain = 0; //declare all of these integers
int losing = 0;
int x = 0;
int totalWinnings = 0;
    while(x < 1000){
        int originalBet = (int)(Math.random()*38+1);//determine what the spin was
        int win = 0;
        int y = 0;
        while(y < 100){
            int outcome = (int)(Math.random()*38+1);
            if(originalBet == outcome){
                win++;
                y++;
            }// end if
            else{
                y++;
            }// end else
        }// end while
            if(win == 0){
            losing++;
            }// end if
        totalWinnings = totalWinnings+ (win*36);//determine how much you won in total
            if(win > 2){
            realizedGain++;
            }// end if
        x++;
         }// end while
System.out.println("You won nothing "+losing+" time(s).");//print these results
System.out.println("Your total winnings were: $"+(totalWinnings-100000));//print these results
System.out.println("You profited "+realizedGain+" out of 1000 times.");//print these results
}// end main method
}// end class
