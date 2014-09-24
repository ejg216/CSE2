////////////////////////////////////
//Eric Glynn
//09/23/14
//Course Number Program
//This program will promt the user to enter a course number then return a semester of when the course was taken



import java.util.Scanner; //import the scanner

public class TimePadding { //state the class
    public static void main(String[] args) { //state the main method used in each class
        Scanner myScanner; //name the scanner
        myScanner = new Scanner ( System.in );
        
        System.out.println("Enter a time in seconds: ");//Prompt user to enter a time in seconds
        
        if(!myScanner.hasNextInt()) {
            System.out.println("You did not enter an integer"); //Let them know if it is not an integer
        }
        else {
            int seconds = myScanner.nextInt();
            if (seconds <0) {
                System.out.println("You did not enter a positive integer");
        }
        else {
            int totalSec = seconds%60; //divide seconds by 60 and take the remainder
            
            int totalMinutes = (seconds/60)%60; //divide the minutes by 60 and take remainder
            
            int totalHours = (seconds/3600)%60; //divide seconds by 60 squared and  take remainder when divided by 60
            
                if (totalSec > 9 && totalMinutes > 9){
                    System.out.println("the time is " + totalHours + ":" + totalMinutes + ":" +totalSec +"."); //print this out
                }
                
        
        else if (totalSec > 10 && totalMinutes > 9){
                    System.out.println("the time is " + totalHours + ":" + totalMinutes + ":" +totalSec +".");//print this out
        }
        else if (totalSec > 10 && totalMinutes > 10){
                    System.out.println("the time is " + totalHours + ":" + totalMinutes + ":" +totalSec +".");//print this out
        }
        }
        }
        }
        }
        