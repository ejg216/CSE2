//Eric Glynn
//09/11/14
//Cube Root Program

//This program prompts user for input and will guess the cube root, the multiply the cube root by 3.

import java.util.Scanner; //import the scanner

public class Root {
    public static void main(String[] args) { 

Scanner myScanner; //name the scanner
myScanner = new Scanner ( System.in );

System.out.println("Enter a double, and I print its cube root: "); //Prompt user to input a number
double inputDigit = myScanner.nextDouble();

double guessOne = inputDigit/3; //First guess of number
double guessTwo = (2*guessOne*guessOne*guessOne+inputDigit)/(3*guessOne*guessOne); //Second guess of number
double guessThree = (2*guessTwo*guessTwo*guessTwo+inputDigit)/(3*guessTwo*guessTwo); //Third guess of number
double guessFour = (2*guessThree*guessThree*guessThree+inputDigit)/(3*guessThree*guessThree); //Fourth guess of number
double guessFive = (2*guessFour*guessFour*guessFour+inputDigit)/(3*guessFour*guessFour); //Fifth guess of number
double guessSix = (2*guessFive*guessFive*guessFive+inputDigit)/(3*guessFive*guessFive); //Sixth guess of number

double digitGuess = (guessSix * guessSix * guessSix); //Multiply the last guess by itself three times to find guess of cube

System.out.println("The cube root is: " + guessSix + "."); //Print out the cube root guess
System.out.println("My guess of your number based off this estimate is: " + digitGuess); //Print out original digit guess

}

}

