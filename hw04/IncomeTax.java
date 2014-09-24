////////////////////////////////////
//Eric Glynn
//09/23/14
//Income Tax Program

import java.util.Scanner; //import the scanner

public class IncomeTax { //state the class
    public static void main(String[] args) { //state the main method used in each class
        Scanner myScanner; //name the scanner
        myScanner = new Scanner ( System.in );
        
        System.out.println("Enter an int giving the number of thousands of income: "); //propmt user to enter income in thousands
        
        if (myScanner.hasNextInt()) { ///if the scanner containes an int
        int inputIncome = myScanner.nextInt(); 
        
            if (inputIncome < 0)  {//checks if its less than zero
            System.out.println("You did not enter a positive int"); // prints if its less than zero
            return;
        
            }
            else {
                if (inputIncome < 20) { //if income is less than 20 then calculate the tax
                    double taxFive = (inputIncome*.05*1000); //tax is 5%
                    System.out.println("The tax rate on $" + inputIncome + ",000 is 5% and the tax is $" + taxFive); //print this out
                }
                
                else if (inputIncome >=20 && inputIncome < 40) { //if income is between 20 and 40
                    double taxSeven = (inputIncome*.07*1000); //tax is 7%
                    System.out.println("The tax rate on $" + inputIncome + ",000 is 7% and the tax is $" + taxSeven); //print this out
                }
                else if (inputIncome >=40 && inputIncome < 78) { //if income is between 40 and 78
                    double taxTwelve = (inputIncome*.12*1000); //tax is 12%
                    System.out.println("The tax rate on $" + inputIncome + ",000 is 12% and the tax is $" + taxTwelve); //print this out
                }
                else  {
                    double taxFourteen = (inputIncome*.14*1000); //if income is anything else then tax is 14%
                    System.out.println("The tax rate on $" + inputIncome + ",000 is 14% and the tax is $" + taxFourteen);// print out
                } 
           
           
            }///end of else if
           
           
        }
           //end of if
            else  {
                System.out.println("You did not enter an int");
                return;
            }//end of else
    }//end of method
       
        
    
}//end of class