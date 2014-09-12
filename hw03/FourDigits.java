//Eric Glynn
//09/11/14
//Four Digits Program

//This program will print a number out to four digits. It will the specify what those 4 digits are.

import java.util.Scanner; //Import the scanner

public class FourDigits {
    public static void main(String[] args) { //declare the method

Scanner myScanner; //Name the scanner
myScanner = new Scanner ( System.in );

System.out.println("Enter a double and I display the four digits to the right of the decimal point: "); //prompt user for input
double inputDigit = myScanner.nextDouble();

double multipliedDigit = inputDigit * 10000; //multiply digit by 10000
int roundedDigit = (int)multipliedDigit; //make this digit an integer

int fourthDigit = (roundedDigit %10); //extract the fourth digit

 
double nextMultipliedDigit = inputDigit * 1000; //multipy digit by 1000 to get last three digits
int roundedNewDigit = (int)nextMultipliedDigit; //make digit an integer

int thirdDigit = (roundedNewDigit %10); //extract third digit



double newMultipliedDigit = inputDigit * 100; //multiply digit by 100 to get last two digits
int roundedNewerDigit = (int)newMultipliedDigit; //make digit an integer
 
int secondDigit = (roundedNewerDigit %10); //extract second digit


double firstMultipliedDigit = inputDigit * 10; //multiply digit by 10 to get last digit
int roundedNewestDigit = (int)firstMultipliedDigit; //make digit an integer

int firstDigit = (roundedNewestDigit %10); //extract first digit

System.out.println("The four digits are: " +firstDigit + secondDigit + thirdDigit + fourthDigit);




}
}