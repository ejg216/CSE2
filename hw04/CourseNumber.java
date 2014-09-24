////////////////////////////////////
//Eric Glynn
//09/23/14
//Course Number Program
//This program will promt the user to enter a course number then return a semester of when the course was taken



import java.util.Scanner; //import the scanner

public class CourseNumber { //state the class
    public static void main(String[] args) { //state the main method used in each class
        Scanner myScanner; //name the scanner
        myScanner = new Scanner ( System.in );
        
        System.out.println("Enter a six digit number giving the course semester:");//print this out
        int courseNum = myScanner.nextInt();//declare the input as an integer
        
        if (courseNum<186510 || courseNum>201440) {
            System.out.println("The number was outside the range [186510,201440]");//print this out
        }
        else {
            int courseSemester = (courseNum%100);//extract the semester by taking remainder when divided by 100
                if (courseSemester != 10 && courseSemester != 20 && courseSemester != 30 && courseSemester !=40) {
                System.out.println(courseNum + " is not a legitimate semester");//print this out
                }
                
                else { 
                    int courseYear = (courseNum/100);//get the year by casting to int and dividing by 100
                    
                    if( courseSemester == 10) {
                        System.out.println("This course was offered in the Spring semester of " + courseYear);
                    }
                    else if ( courseSemester == 20) {
                        System.out.println("This course was offered in the Summer 1 semester of " + courseYear);
                    }
                    else if ( courseSemester == 30) {
                        System.out.println("This course was offered in the Summer 2 semester of " + courseYear);
                    }
                    
                    else if ( courseSemester == 40) {
                        System.out.println("This course was offered in the Fall semester of " + courseYear);
        }
                }
        }
    
    }//end of method
}//end of class