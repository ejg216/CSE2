//Eric Glynn
//10/15/14
//Root Program

/*Write a Java program that forces the user to enter a double that is greater than 0, 
uses an algorithm to compute the square root of the number, and then prints it out.*/

import java.util.Scanner;//import the scanner
public class Root{//  define class
public static void main(String[] args){//define the main method to be used
Scanner myScanner;//name the scanner
myScanner = new Scanner(System.in);//scan the input
System.out.print("Enter an integer:");//ask user to enter an integer
    if(myScanner.hasNextInt()){
        double input = myScanner.nextInt();
        double lowInput = 0;
        int x = 0;
        double highInput = input+1;
        while (x < 100) {
            
            if (((((highInput-lowInput)*0.5 )+ lowInput))*(((highInput-lowInput)*0.5+ lowInput)) > input) {
            highInput = ((highInput-lowInput)*0.5) + lowInput; 
            }// end if statement
            
            else {
                lowInput = ((highInput-lowInput)*0.5) + lowInput;
            }//end else statement
            
            x++;
            
        }// end while
        
        if (highInput < 0) {
            highInput = (-1*highInput);
        }// end if
        
        System.out.println(highInput);//print the high input
    }// end if
    else {
        
        System.out.print("Not an int");
        return;//return if everyhting is invalid
        
    }// end else statment
}// end main method
}// end public class
