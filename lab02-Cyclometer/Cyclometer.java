//Eric Glynn
//09/04/14
//CSE2

//The purpose of this program is to provide count, time in minutes, and distance for a bicycle trip.

//Define a class
public class Cyclometer {
    
    //State the required main method
     public static void main(String[] args) {
         
int secondsTrip1=480; //Designate the amount of seconds in the first trip
int secondsTrip2=3220; //Designate the amount of seconds in the second trip
int countsTrip1=1561; //Designate the amount of counts in the first trip
int countsTrip2=9037; //Designate the amount of counts in the seconf trip

double wheelDiameter=27.0, //Declare the diamter of the bicycle wheel
PI=3.14159, //Declare a constant number PI
feetPerMile=5280, //State how many feet are in a mile
inchesPerFoot=12, //State how many inches are in 1 foot
secondsPerMinute=60; //State how many seconds are in 1 minute
double distanceTrip1, distanceTrip2, totalDistance; //Declare the datatype for three new variables representing different distances

//Print out information regarding the bicycle trips

System.out.println("Trip 1 took "+ 
    (secondsTrip1/secondsPerMinute) +" minutes and had "+
    countsTrip1+ " counts");
System.out.println("Trip 2 took "+ 
    (secondsTrip2/secondsPerMinute) +" minutes and had "+
    countsTrip2+ " counts");
distanceTrip1=countsTrip1*wheelDiameter*PI; //Will give distance in inches (each count equals diameter of wheel times PI)
distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2; //Will sum distances of both trips

//Print out the output data

System.out.println("Trip 1 was " + distanceTrip1 + " miles");
System.out.println("Trip 2 was " + distanceTrip2 + " miles");
System.out.println("The total distance was " + totalDistance + " miles");

     }//end main method
    
}//end class

