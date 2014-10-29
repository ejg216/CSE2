//Eric Glynn
//10/28/14
//HW8 Program
import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in); //make scan the new scanner
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); //prompt
	input=getInput(scan,"Cc"); //store char generated from the first getInput method in input
	System.out.println("You entered '"+input+"'"); //print out input test
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); //prompt
	input=getInput(scan,"yYnN",5); //give up after 5 attempts USES second getInput method
	if(input!=' '){ //if the method did not give up
   	System.out.println("You entered '"+input+"'"); //print out input test
	}
	input=getInput(scan,"Choose a digit.","0123456789"); //third overloaded getInput mehtod
	System.out.println("You entered '"+input+"'");//print out input test
  } 
  
  public static char getInput(Scanner in, String s){ //first getInput method
      char[] charArray = s.toCharArray(); //takes s and changes it from a string to a char array
      do{
          String str = in.next(); //string taken from buffer
          char c = str.charAt(0); //first char in str stored in string 
          
      for (int x = 0; x < charArray.length; x++){//iterate through the char array
          if(charArray[x] == c){ //if the char array value is equal to user input
          return c; //return the character to the main method
          }
      }//otherwise
      System.out.print("You did not enter a character from the list '" + s +"'; try again-");//try again
      } while(true); //infinite loop until user inputs correct value
      
      
      
  }
  
  
  public static char getInput(Scanner in, String s, int i){//Second getInput method. Identical to the first, exept where noted
      char[] charArray = s.toCharArray();
      int flag = i;//flag set as the int
      do{
          String str = in.next();
          char c = str.charAt(0);
       for (int x = 0; x < charArray.length; x++){
          if(charArray[x] == c){
          return c;
          }
      }
      System.out.print("You did not enter a character from the list '" + s +"'; try again-");
      flag--; // number decreased by one
      } while(flag > 0); // if the number of tries reaches 0, exit do- while loop
      System.out.println("");
      System.out.println("You failed after " + i + " tries");//error message
      
      return ' ';
  }
  
  
  public static char getInput(Scanner in, String prompt, String s){//Third getInput method
      char[] charArray = s.toCharArray();
      boolean flag = true;
      
      do{
       System.out.println(prompt);//prints out prompt
       System.out.print("Enter one of:");               //prints out "Enter one of" then each char in s surrounded by ''
       for (int j = 0; j < charArray.length; j++){
           System.out.print("'"+ charArray[j] + "'");
       }
       System.out.print("-");
       
       String str = in.next();
       char c = str.charAt(0);
       
       
       if (str.length() == 1){ //if only one char was entered
          for (int x = 0; x < charArray.length; x++){
             if(charArray[x] == c){
             return c;
             }
          }
          System.out.println("You did not enter an acceptable character");
       }
          else{ //if more than one char is entered
        System.out.println("Enter exactly one character");
        }
        }while(flag);
      
      return ' ';
      
      
      
  }
  
  
  
}

