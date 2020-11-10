package week9;
import java.util.Scanner;
/**
 *
 * @author celia
 */
public class OrderTabulator {
    //member variables
    private static double numHotDogsOrdered = 0;
    private static double numTendersOrdered = 0;
    private static double numFriesOrdered = 0;
    private static double totalPrice = 0;
    private final static double HOT_DOG_COST = 2.99;
    private final static double TENDERS_COST = .99;
    private final static double FRIES_COST = 1.99;
            
    
    public static void main(String[] args) {
        
        //create scanner for user inputs
        Scanner userInput = new Scanner(System.in);
        
        //user interface
        
        //prompt user for ordering hot dogs
        System.out.println("How many hot dogs do you want?:");
        //grab input
        int foodOrderedByUser = userInput.nextInt();
        //call method1
        orderHotDogs(foodOrderedByUser);
        //print totals so far
        printTotals();
        
        //prompt user for ordering tenders, grab input, call method 2, print totals
        System.out.println("How many chicken tenders do you want?:");
        foodOrderedByUser = userInput.nextInt();
        orderTenders(foodOrderedByUser);
        printTotals();
        
        //prompt user for ordering fries, grab input, call method 3, print totals
        System.out.println("How many sides of fries would you like?:");
        foodOrderedByUser = userInput.nextInt();
        orderFries(foodOrderedByUser);
        printTotals();
        
        //end
        System.out.println("Thanks for placing your order! Your total is: " + totalPrice);
        System.out.println("Have a nice day!");
        
        
        
        
        
    }//close main
    
    //METHOD 1 - ordering hot dogs
    public static void orderHotDogs(double dogsOrdered){
        //print how many hot dogs have been ordered
        System.out.println(dogsOrdered + " hot dogs have been ordered!");
        //calculate total price of hot dogs
        double dogsPrice = dogsOrdered * HOT_DOG_COST;
        //add to member variable totalPrice, this is a running total of entire order
        totalPrice = totalPrice + dogsPrice;
        //add number of dogs to member variable
        numHotDogsOrdered = numHotDogsOrdered + dogsOrdered;
        
    }//close method 1 - orderHotDogs
    
    //METHOD 2 - ordering tendies
    public static void orderTenders(double tendersOrdered){
        //print how many tenders have been ordered
        System.out.println(tendersOrdered + " tenders have been ordered!");
        //calculate total price of tenders 
        double tendersPrice = tendersOrdered * TENDERS_COST;
        //add tender price to totalPrice
        totalPrice = totalPrice + tendersPrice;
        numTendersOrdered = numTendersOrdered + tendersOrdered;
        
    }//end method 2 - ordering tendies
    
    //METHOD 3 - ordering fries
    public static void orderFries(double friesOrdered){
        //print how many fries have been ordered
        System.out.println(friesOrdered + " sides of fries have been ordered!");
        //calculate total price of fries
        double friesPrice = friesOrdered * FRIES_COST;
        //add fries price to running total
        totalPrice = totalPrice + friesPrice;
        numFriesOrdered = numFriesOrdered + friesOrdered;
        
    }//end method 3 - ordering fries
    
    //METHOD 4 - print method. use this to print out totals and such. 
    public static void printTotals(){
        //printout total prices and things ordered
        System.out.println("**************************************");
        System.out.println("So far " + numHotDogsOrdered + " hot dogs have been ordered, "
            + numTendersOrdered + " chicken tenders have been ordered, and " + numFriesOrdered +
                " sides of fries have been ordered");
        System.out.println("So far, your running total is $" + totalPrice);
        System.out.println("**************************************");
    }//end method 3 - print method
}
