//Eric Glynn
//09/11/14
//Cube Root Program

//This program prompts user for input and will guess the cube root, the multiply the cube root by 3.

import java.util.Scanner; //import the scanner

public class Root {
    public static void main(String[] args) { 

Scanner myScanner; //name the scanner
myScanner = new Scanner ( System.in );

System.out.println("Enter a double, and I print its cube root: ");
double inputDigit = myScanner.nextDouble();

double guessOne = inputDigit/3;
double guessTwo = (2*guessOne*guessOne*guessOne+inputDigit)/(3*guessOne*guessOne);
double guessThree = (2*guessTwo*guessTwo*guessTwo+inputDigit)/(3*guessTwo*guessTwo);
double guessFour = (2*guessThree*guessThree*guessThree+inputDigit)/(3*guessThree*guessThree);
double guessFive = (2*guessFour*guessFour*guessFour+inputDigit)/(3*guessFour*guessFour);
double guessSix = (2*guessFive*guessFive*guessFive+inputDigit)/(3*guessFive*guessFive);

double digitGuess = (guessSix * guessSix * guessSix);

System.out.println("The cube root is: " + guessSix + ".");
System.out.println("My guess of your number based off this estimate is: " + digitGuess);

}

}

