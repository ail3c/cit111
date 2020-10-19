
package week6;
import java.util.Scanner;
import java.util.Random;

/**
 * ask user to pick a chalice. program will show user whats under that chalice
 * @author celia
 */
public class ThreeCups {
    public static void main(String[] args) {
       
        //create scanner
        Scanner userInput = new Scanner(System.in);
        //prompt user to pick a chalice
        System.out.println("pick a chalice, any chalice! a prize lies beneath.");
        System.out.println("   *********            *********            ********* ");
        System.out.println("      ***                  ***                  ***  ");
        System.out.println("      ***                  ***                  ***  ");
        System.out.println("      ***                  ***                  ***  ");
        System.out.println("   *********            *********            *********");
        System.out.println(" ***       ***        ***       ***        ***       ***");
        System.out.println("***    1    ***      ***    2    ***      ***    3    ***");
        System.out.println("***         ***      ***         ***      ***         ***");
        System.out.println("***************      ***************      ***************");
        
        
        System.out.println("please enter 1, 2 or 3 and press enter: ");
        
        //grab userInput
        int userChoice = userInput.nextInt();
        
        //use switch to display whichever option user chooses
        switch(userChoice){
            
            case 1:
                printSpider();
                break;
            case 2:
                printProposal();
                break;
            case 3:
                generateRandomNumber();
                break;
            default: 
                System.out.println("you did not enter a valid number");
            
        }//end switch
       
    }//end main
    
    //method 1 - spider
    public static void printSpider(){
        System.out.println("AHHHHH");
        System.out.println("  / _ \\\n" +
        "\\_\\(_)/_/\n" +
        " _//\"\\\\_  \n" +
        "  /   \\");
        System.out.println("i forgot i put a cup over a spider i found earlier");
        System.out.println("...congrats?");
    }//end printSpider
    
    //method 2 - proposal!
    public static void printProposal(){
        System.out.println("there is a ring under this chalice! surprise! will you marry me?");
        
        //prompt use for input
        System.out.println("Press 1 for yes, 2 for no");
        
        //create scanner and grab input
        Scanner userInput = new Scanner(System.in);
        int userChoice = userInput.nextInt();
        
        //display message for if they said yes or no
        if(userChoice == 1){
            System.out.println(":D hooray!");
        }else{
            System.out.println(":(");
        }
    }//end printProposal
    
    //method 3 - generate random number because i ran out of ideas
    public static void generateRandomNumber(){
        System.out.println("under this chalice is a.... random number generator?");
        System.out.println("how did that get there?");
        //create random number generator
        Random randGenerator = new Random();
        //store the number in randNum
        int randNum = randGenerator.nextInt(100); //chooses a number up to 100
        
        //display random number
        System.out.println("ok well anyways, your lucky number is: " + randNum + "!");
       
    }//close generateRandomNumber
}//close class
