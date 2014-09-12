//Eric Glynn
//09/11/14
//Four Digits Program

//This program will print a number out to four digits. It will the specify what those 4 digits are.

import java.util.Scanner; //Import the scanner

public class FourDigits {
    public static void main(String[] args) { 

Scanner myScanner; //Name the scanner
myScanner = new Scanner ( System.in );

System.out.println("Enter a double and I display the four digits to the right of the decimal point: ");
double inputDigit = myScanner.nextDouble();

double multipliedDigit = inputDigit * 10000;
int roundedDigit = (int)multipliedDigit;

int fourthDigit = (roundedDigit %10);


double nextMultipliedDigit = inputDigit * 1000;
int roundedNewDigit = (int)nextMultipliedDigit;

int thirdDigit = (roundedNewDigit %10);



double newMultipliedDigit = inputDigit * 100;
int roundedNewerDigit = (int)newMultipliedDigit;

int secondDigit = (roundedNewerDigit %10);


double firstMultipliedDigit = inputDigit * 10;
int roundedNewestDigit = (int)firstMultipliedDigit;

int firstDigit = (roundedNewestDigit %10);

System.out.println("The four digits are: " +firstDigit + secondDigit + thirdDigit + fourthDigit);




}
}