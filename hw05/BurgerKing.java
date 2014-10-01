/////////////////////////////////////
//Eric Glynn
//09/30/14
//Burger King Program
//hw05

/*This program will prompt the user for several different inputs asking them to make food selections at burger king*/

import java.util.Scanner;//import the scanner

public class BurgerKing {
    //declare main method required for every Java program
    public static void main(String[] args) {
        
Scanner myScanner;

myScanner = new Scanner ( System.in );
System.out.println("Enter a letter to indicate a choice of: ");//print all of this out
System.out.println("Burger (B or b)");
System.out.println("Soda (S or s)");
System.out.println("Fries (F or f)");

if (myScanner.hasNext()) {
            
            String input = myScanner.next();
            if (input.equals("B") || input.equals("b")){//if the user enters B or b then print this
                System.out.println("Enter A or a for 'all the fixins'");
                System.out.println("C or c for cheese");
                System.out.println("N or n for none of the above");
                
                String burgerInput = myScanner.next();
                
                if (burgerInput.equals("A") || burgerInput.equals("a")){//if they want everything then print
                    System.out.println("You ordered a burger with 'all the fixins'");
                }
                    
                else if (burgerInput.equals("C") || burgerInput.equals("c")){//if they want cheese then print
                    System.out.println("You ordered a burger with cheese"); 
                }
                
                else if (burgerInput.equals("N") || burgerInput.equals("n")){//if they want nothing then print
                    System.out.println("You ordered a plain burger");
                }
            }
            
            if (input.equals("S") || input.equals("s")){//if they want a soda then print
                System.out.println("You ordered a soda");
                System.out.println("Enter P or p for Pepsi");
                System.out.println("C or c for Coke");
                System.out.println("S or s for Sprite");
                System.out.println("M or m for Mountain Dew");
                
                String sodaInput = myScanner.next();
                
                if (sodaInput.equals("P") || sodaInput.equals("p")){//if they want pepsi then print
                    System.out.println("You ordered a Pepsi");
                }
                
                else if (sodaInput.equals("C") || sodaInput.equals("c")){//if they want coke then print
                    System.out.println("You ordered a Coke"); 
                }
                
                else if (sodaInput.equals("S") || sodaInput.equals("s")){//if they want sprite then print
                    System.out.println("You ordered a Sprite"); 
                }
                
                else if (sodaInput.equals("M") || sodaInput.equals("m")){//if they want mountain dew then print
                    System.out.println("You ordered Mountain Dew"); 
                }
            }
               
            if (input.equals("F") || input.equals("f")){//if they want fries then ask what size
                System.out.println("Do you want a large or small order of fries (L, l, S, s)");
                
                String friesInput = myScanner.next();
                
                if (friesInput.equals("L") || friesInput.equals("l")){//if they want large then print
                    System.out.println("You ordered large fries");
                }
                    
                else if (friesInput.equals("S") || friesInput.equals("s")){//if they want small then print
                    System.out.println("You ordered small fries"); 
                }    
            }
           else {
                    System.out.println("Invalid entry");//if they enter anything else then it is invalid
                return;
                }
}

            
else{//return for incorrect responses
    return;
            }   
                
           
}//end of method
}//end of class