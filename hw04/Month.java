////////////////////////////////////
//Eric Glynn
//09/23/14
//Month Program
//This program asks the user to enter the month number and returns the numbe rof days in that month

import java.util.Scanner; //import the scanner

public class Month { //state the class
    public static void main(String[] args) { //state the main method used in each class
        Scanner myScanner; //name the scanner
        myScanner = new Scanner ( System.in );
        
        System.out.println("Enter an int giving the number of the month (1-12)");//prompt the user to input a month number
        int monthNum = myScanner.nextInt();//declare input as an int
        
        if (monthNum <1 || monthNum >12) { 
            System.out.println("Invalid number for month");//testing if input is valid
            return;
        }
        else{
            if (monthNum == 2) {
                System.out.println("Enter the int giving the year: ");
                int yearNumber = myScanner.nextInt();
                if (yearNumber%4 == 0) {//dividing the year by 4 to see if its a leap year
                    System.out.println("Month has 29 days");
                }
            
                else {
                    System.out.println("Month has 28 days");
                }
                
                
                    }
            else if (monthNum == 1 || monthNum == 3 || monthNum == 5 || monthNum == 7 || monthNum == 8 || monthNum == 10 || monthNum == 12)   {  
                    System.out.println("Month has 31 days");//if it is any of these months then its 31 days
                }
                else {
                    System.out.println("Month has 30 days");
                }
        }//end of method
    }//end of class

}

