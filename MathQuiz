package week5;
import java.util.Scanner;

/**
 * asks someone to answer a math problem and gives them 3 tries to get it right
 * @author cruef
 */
public class MathQuiz {
    public static void main(String[] args) {
        
        //initialize constants
        final String MATH_PROBLEM = "What is 10 / 2";
        final int MATH_PROBLEM_ANSWER = 5;
        final int MAX_ATTEMPTS = 3;
        
        //initialize variables
        int totalAttempts = 0;
        int userAnswer;
        //create scanner
        Scanner userInput = new Scanner(System.in);
        
        //while total attempts < 3
        while(totalAttempts < MAX_ATTEMPTS){
            
            //print question and prompt user for answer to question
            System.out.println(MATH_PROBLEM + " = ?");
            userAnswer = userInput.nextInt();
            
            //if statement, check if users input is correct
            if(userAnswer == MATH_PROBLEM_ANSWER){
                System.out.println("noice, you got it");
                break;
            }else{
                System.out.println("boo. try again");
                totalAttempts = totalAttempts + 1;
                if(userAnswer > MATH_PROBLEM_ANSWER){
                    System.out.println("(your answer is too high)");
                }else{
                    System.out.println("(your answer is too low)");
                } //end nested if else
            }//end if else
           
        }//end while 
    
        //print solution if they fail 3 times
            if(totalAttempts == MAX_ATTEMPTS){
                System.out.println("You have too many attempts. The solution is 5");
            }
    }//end main
}//end class
