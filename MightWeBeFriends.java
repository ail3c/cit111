package week6;

import java.util.Scanner;

/**
 * program to ask user a series of questions to determine friend compatibility
 * @author celia
 */
public class MightWeBeFriends {
    
    final static int COMPAT_THRESHOLD = 125; //u can put this outside the main
    
    public static void main(String[] args) {
        //create variables
        int compatScore = 0;
        int responseNum = 0;
        Scanner scan = new Scanner(System.in);
        
        //welcome user and print q1
        System.out.println("Welcome to my friend machine!");
        System.out.println("Question 1: Do you play video games?");
        System.out.println("Yes = 1; No = 0");
        
        //use scanner to grab user input
        responseNum = scan.nextInt();
        
        //evaluate response
        if(responseNum == 1){
            System.out.println("Who doesn't these days?");
            System.out.println("+100");
            System.out.println("---------------------------------");
            compatScore = compatScore + 100;
            
            //ask Q2 only if they play video games
            //all if this is run only if q1 = yes
            System.out.println("Question 2: What platform do you play on?");
            System.out.println("PC = 1");
            System.out.println("Switch = 2");
            System.out.println("XBox = 3");
            System.out.println("PS4 = 4");
            //get input from scanner
            responseNum = scan.nextInt();
            
            if(responseNum == 1){
                System.out.println("You're a person of culture as well, I see");
                System.out.println("+150");
                System.out.println("---------------------------------");
                compatScore = compatScore + 150;
                
            }else if(responseNum == 2){
                System.out.println("I can respect that");
                System.out.println("+50");
                System.out.println("---------------------------------");
                compatScore = compatScore + 50;
            }else if(responseNum == 3 || responseNum == 4){
                System.out.println("Eh");
                System.out.println("-50");
                System.out.println("---------------------------------");
                compatScore = compatScore - 50;
            }else{
                System.out.println("Not a valid answer");
            }//close nested q2
            
        } else { //for non video game players
            System.out.print("Not a fan of video games? That's ok.");
            System.out.println("Skipping question 2");
            System.out.println("---------------------------------");
            
        } //close if else for Q1
            
        //reuinite logic on Q3
        System.out.println("Question 3: Do you enjoy hiking?");
        System.out.println("Yes = 1; No = 0");
        //get input from scanner
        responseNum = scan.nextInt();
        
        //evaluate response 
        if(responseNum == 1){
            System.out.println("Lace up those boots!");
            System.out.println("+75");
            System.out.println("---------------------------------");
            compatScore = compatScore + 75;
        }else {
            System.out.println("Give the trail a chance!");
            System.out.println("-25");
            System.out.println("---------------------------------");
            compatScore = compatScore - 25;
        }//end if else for Q3
        
        //final friend compatibility calculation
        if(compatScore >= COMPAT_THRESHOLD){
            System.out.println("Determination: High compatibility");
            System.out.println("Your final compatibility score is "
                    + compatScore + " out of 325 possible points");
        }else{
            System.out.println("Determination: Low compatibility");
            System.out.println("Your final compatibility score is "
                    + compatScore + " out of 325 possible points");
        }//end final if else
        
        System.out.println("---------------------------------");
        System.out.println("Thanks for trying out my friend machine!");
    }//end main
}//close class
