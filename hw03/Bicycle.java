//Eric Glynn
//09/11/14
//Bicycle Program

/* This program will compute distance taveled and the amount of time taken while bike riding (given an input field) */

import java.util.Scanner; //import the scanner

public class Bicycle {
    public static void main(String[] args) { 

Scanner myScanner; //name the scanner
myScanner = new Scanner ( System.in );

System.out.println("Enter the number of seconds: "); //Command scanner to ask for number of seconds
int nSeconds = myScanner.nextInt(); //Declare the input seconds as an integer
System.out.println("Enter the number of counts: "); //Command scanner to ask for number of counts
int nCounts = myScanner.nextInt(); //Declare the input counts as an integer

double wheelDiameter = 27.0, //Declare the diamter of the bicycle wheel
PI = 3.14159, //Declare a constant number PI
feetPerMile = 5280, //State how many feet are in a mile
inchesPerFoot = 12, //State how many inches are in 1 foot
secondsPerMinute = 60; //State how many seconds are in 1 minute

double totalMinutes = (nSeconds/60); //Convert seconds to minutes
double totalHours = totalMinutes/60; //Convert minutes to hours

double totalDistance = nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile; //Calculate total distance
double roundedDistance = totalDistance * 100;
int roundedIntDistance = (int)roundedDistance;
double exactDistance = roundedIntDistance/100.0; //Complete conversion to two decimal places

double averageMPH = totalDistance/totalHours; //Calculate average MPH
double roundedMPH = averageMPH * 100;
int roundedIntMPH = (int)roundedMPH;
double exactMPH = roundedIntMPH/100.0; //Complete conversion to two decimal places

//Print out the totals
System.out.println("The distance was " + exactDistance + " miles and took " + totalMinutes + " minutes.");
System.out.println("The average mph was " + exactMPH);


    }
}
    