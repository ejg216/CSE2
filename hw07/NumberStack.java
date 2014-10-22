//Eric Glynn
//10/20/14
//Number Stack Program

/*This program will print out the required statement*/

import java.util.Scanner; //import the scanner

public class NumberStack{ //define the class
    public static void main(String[] args){ //define the main method to be used

    Scanner myScanner = new Scanner (System.in);//gather input from user
    
    System.out.println ("Enter an int between 1-9"); //print this statement out
    
    if (myScanner.hasNextInt()) {
        int userNumber = myScanner.nextInt();
        
        if (userNumber > 0 && userNumber <10){
            
            
            System.out.println("For Loop");
            
            for(int a = 1; a <= userNumber;a++){
                
                for(int b = 0; b < a+1; b++){
                    if(b!= a){
                        for(int c = 0; c < userNumber - a;c++){
                            System.out.print(" ");
                        }
                        for(int d = 0; d < 2*a-1; d++){
                            System.out.print(a);
                        }
                        }
                    else{
                        for(int c = 0; c < userNumber - a; c++){
                            System.out.print(" ");
                        }
                        for(int d = 0; d < 2*a-1; d++){
                            System.out.print("-");
                        }
                    } 
                    System.out.println("");
                    }
            }
            
            
            
          
          System.out.println("Using While Loops");
          
          int currentNumber = 1;
          while(currentNumber <= userNumber){
              int rows = 0;
              while(rows <= currentNumber){
                  if(rows != currentNumber){
                      int spaces = userNumber - currentNumber;
                      int repeat = 2 * currentNumber - 1;
                      while(spaces > 0){
                          System.out.print(" ");
                          spaces--;
                      }
                      while(repeat > 0){
                          System.out.print(currentNumber);
                          repeat--;
                      }
                  }
                  else{
                      int spaces = userNumber - currentNumber;
                      int repeat = 2 * currentNumber - 1;
                      while(spaces > 0){
                          System.out.print(" ");
                          spaces--;
                      }
                      while(repeat > 0){
                          System.out.print("-");
                          repeat--;
                      }
                      
                  }
                  System.out.println("");
                  rows++;
              }
              
              currentNumber++;
          }
          
          System.out.println("Using do while loops");
          
            currentNumber = 1;
          do{
              int rows = 0;
              do{
                  if(rows != currentNumber){
                      int spaces = userNumber - currentNumber;
                      int repeat = 2 * currentNumber - 1;
                      if(currentNumber != userNumber){
                      do{
                          System.out.print(" ");
                          spaces--;
                      }while(spaces > 0);
                      }
                      do{
                          System.out.print(currentNumber);
                          repeat--;
                      }while(repeat > 0);
                  }
                  else{
                      int spaces = userNumber - currentNumber ;
                      int repeat = 2 * currentNumber - 1;
                      if(currentNumber != userNumber){
                      do{
                          System.out.print(" ");
                          spaces--;
                      }while(spaces > 0);
                      }
                      do{
                          System.out.print("-");
                          repeat--;
                      }while(repeat > 0);
                      
                  }
                  System.out.println("");
                  rows++;
              } while(rows <= currentNumber);
              
              currentNumber++;
          } while(currentNumber <= userNumber);
          
          
    
          
          
          
    
    
          
          
          
          
          
          
}

        else {
            System.out.println("You did not enter an integer within the bounds");
        }
    }
    
    else {
        System.out.println("You did not enter an integer");
    }
    
    }//end main method
    
}//end of class
