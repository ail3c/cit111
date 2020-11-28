
package objects1;

/**
 * uses objects to show different kinds of foods and their instances 
 * @author celia
 */
public class FoodLand {
    public static void main(String[] args) {
        
        final int nibble = 5;
        final int megaBite = 45;
        final int sip = 5;
        final int bigSip = 30;
        
        System.out.println("Time to eat some food!");
       
        //DONUT
        System.out.println("");
        System.out.println("\t ### DONUT ###");
        
        Donut firstDonut;
        firstDonut = new Donut();
        firstDonut.name = "Chocolate Donut";
        //pass Donut referenced by firstDonut to printStats
        printStats(firstDonut);
        
        
        //eat some of each donut and print out stats
        System.out.println("Eating " +  firstDonut.name);
        System.out.println("Nibble...");
        firstDonut.simulateEating(nibble);
        System.out.println("Nibble...");
        firstDonut.simulateEating(nibble);
        System.out.println("Mega bite!");
        firstDonut.simulateEating(megaBite);
        
        printStats(firstDonut);
        
        
        //BURGER
        System.out.println("");
        System.out.println("\t ### BURGER ### ");
        
        Burger firstBurger = new Burger();
        firstBurger.addCheese();
        firstBurger.vegetable1 = "Tomato";
        firstBurger.vegetable2 = "Onion";
        firstBurger.vegetable3 = "Lettuce";
        printBurgerStats(firstBurger);
        
        //eat some burger
        
        System.out.println("Eating Burger");
        
        System.out.println("Nibble...");
        firstBurger.eatBurger(nibble);
        
        System.out.println("Mega bite!");
        firstBurger.eatBurger(megaBite);
        
        System.out.println("Mega bite!");
        firstBurger.eatBurger(megaBite);
        printBurgerStats(firstBurger);
        System.out.println("");
       
        
        //SMOOTHIE
        System.out.println("\t ### SMOOTHIE ### ");
        
        Smoothie firstSmoothie = new Smoothie();
        firstSmoothie.addProtein();
        firstSmoothie.mainFruit = "Strawberry";
        firstSmoothie.secondaryFruit = "Banana";
        printSmoothieStats(firstSmoothie);
        
        //drink some smoothie
        
        System.out.println("Taking a sip...");
        firstSmoothie.drinkSmoothie(sip);
        System.out.println("Taking a big sip!");
        firstSmoothie.drinkSmoothie(bigSip);
        System.out.println("Taking a sip...");
        firstSmoothie.drinkSmoothie(sip);
        printSmoothieStats(firstSmoothie);
        printDivider();
       
        
        
      
        
        
        
    }//close main
    
    //print method 
    private static void printDivider(){
            System.out.println("...................................");
        }//close method
    
    //donut stat method
    
    private static void printStats(Donut inputDonut){
        System.out.println("-------- stats --------");
        System.out.println("Name: " + inputDonut.name);
        System.out.println("Percent remaining: " + inputDonut.getPercRemaining());
        System.out.println("-----------------------");
        
    }//close method
    
    //burger stat method
    private static void printBurgerStats(Burger inputBurger){
        System.out.println("-------- stats --------");
        System.out.println("Contains cheese: " + inputBurger.cheese);
        System.out.println("Contains these vegetables: ");
        System.out.println("\t" + inputBurger.vegetable1);
        System.out.println("\t" + inputBurger.vegetable2);
        System.out.println("\t" + inputBurger.vegetable3);
        System.out.println("Percent remaining: " + inputBurger.getPercRemaining());
        System.out.println("-----------------------");
    }//end method
    
    //smoothoe stat method
    private static void printSmoothieStats(Smoothie inputSmoothie){
        System.out.println("-------- stats --------");
        System.out.println("Contains protein powder: " + inputSmoothie.proteinPowder);
        System.out.println("Contains these fruits: ");
        System.out.println("\t" + inputSmoothie.mainFruit);
        System.out.println("\t" + inputSmoothie.secondaryFruit);
        System.out.println("Percent remaining: " + inputSmoothie.getPercRemaining());
        System.out.println("-----------------------");
    }//end method
}
