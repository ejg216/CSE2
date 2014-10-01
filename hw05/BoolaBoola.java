//////////////////////////////////////
//Eric Glynn
//09/30/14
//Boola Boola Program


import java.util.*; //import all utilities (random and scanner needed)

public class BoolaBoola {//define the class
    
    public static void main(String[] args) {//declare the method
        Scanner myScanner = new Scanner(System.in);//initializing the scanner
        boolean bool1, bool2, bool3 = false;//declaring the three random booleans
        boolean op1, op2 = false;//declaring booleans for the random operators
        boolean answer = false, userAnswer = false;//declaring correct answer and user answer
        String s1, s2 = "";//declaring the dtrings that represent the text operators
        boolean flag = false;//declaring temp variable used in situation if not inputed true or false
        
        bool1 = Math.random() > .5;//set each to true or false randomly
        bool2 = Math.random() > .5;
        bool3 = Math.random() > .5;
        op1 = Math.random() > .5;
        op2= Math.random() > .5;
        
        if(op1){
            s1 = "&&";//if op1 is true then &&
        }
        else{
            s1 = "||";//if op1 is false then ||
        }
        if(op2){
            s2 = "&&";//if op2 is true then &&
        }
        else{
            s2 = "||";//if op2 is false then ||
        }
    
        System.out.println("Does " + bool1 + " " + s1+ " " + bool2+ " " + s2+ " " + bool3+ " " + "have the value true(t/T) or false(f/F)?)");
        
        
        if(op1 == true && op2 == true){/*solves for correct answer if statement replaces op1 and op2 with real operators*/
            answer = bool1 && bool2 && bool3;
        }
        else if(op1== true && op2 == false){
            answer = bool1 && bool2 || bool3;
        }
        else if(op1 == false && op2 == true){
            answer = bool1 || bool2 && bool3;
        }
        else if(op1 == false && op2 == false){
            answer = bool1 || bool2 || bool3;
        }
        
        String input = myScanner.next();//getting user input
        
        if (input.equals("T") ||input.equals("t")){
            userAnswer = true;//if true then user answer is true
        }
        else if (input.equals("F") ||input.equals("f")){
            userAnswer = false;//if false then user answer is false
        }
        else{
            System.out.println("user did not put in a t or f");
            flag = true;//if user did not enter t or f then sets temp variable as 
        }
        
        if(userAnswer == answer){
            System.out.println("Correct!!");//if input=actual answer then it is correct
        }
        else if(!flag){
            System.out.println("Wrong; try again");//if input doesn't equal actual answer and user inputs incorrect value then its wrong
        }
        
    }//end method
}//end class
        
        
        