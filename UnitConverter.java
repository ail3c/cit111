
package week7and8;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author celia
 */
public class UnitConverter {
    
    
    public static void main(String[] args) {
        //decimal format
        DecimalFormat df = new DecimalFormat(".##");
        
        //creat scanner for user inputs 
        Scanner userInput = new Scanner(System.in);
        
        //prompt user for weight in lbs
        System.out.println("Please enter your weight, or a random weight, in pounds:");
        //grab input
        double userWeight = userInput.nextDouble();
        //call method 1
        double moonWeight = weightToMoonWeight(userWeight);
        //display inputs and outputs
        System.out.println("Someone who weighs " + userWeight + " lbs would weigh "
                + df.format(moonWeight) + " lbs on the moon!" );
        System.out.println("------------------------------------------------");
        System.out.println();
        
        //prompt user for height in inches
        System.out.println("Please enter your height in inches:");
        //grab input from scanner
        double userHeight = userInput.nextDouble();
        //call method 2
        double gandalfs = heightToGandalfs(userHeight);
        //display inputs and outputs
        System.out.println("If you are " + userHeight + " inches tall, that means "
                + "you are " + df.format(gandalfs) + " Gandalfs tall!");
        System.out.println("Did you know Gandalf is only 5'6'' tall?!");
        System.out.println("------------------------------------------------");
        System.out.println();
        
        //prompt user for number of days 
        System.out.println("Enter a dumber of days, however many days you want! Go crazy!:");
        //grab input from scanner
        double userDays = userInput.nextDouble();
        //call method 3 
        double fortnights = daysToFortnights(userDays);
        //display inputs and outputs
        System.out.println(userDays + " is equal to " + df.format(fortnights) +
                " fortnights! cool! thats not useful at all!");
        System.out.println("------------------------------------------------");
        System.out.println();
        
        
    }//close main method
    
    //METHOD 1 - convert lbs to weight on moon
    public static double weightToMoonWeight(double earthWeight){
        //equation for converting weight to weight on the moon
        double moonWeight = (earthWeight / 9.81) * 1.622;
        return moonWeight;
        
    }//close METHOD 1
    
    //METHOD 2 - height to gandalfs.
    public static double heightToGandalfs(double userHeight){
        //equation for converting users height into gandalfs (1 gandalf is 66 inches)
        final double GANDALF_HEIGHT = 66;
        double gandalfs = userHeight / GANDALF_HEIGHT;
        return gandalfs;
    }//close METHOD 2
    
    //METHOD 3 - days into fortnights 
    public static double daysToFortnights(double days){
        //equation for converting days into fornights
        double fortnights = days / 14;
        return fortnights;
    }//close METHOD 3
    
    
}//close class
