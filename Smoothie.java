
package objects1;

/**
 * an object class for FoodLand
 * @author celia
 */
public class Smoothie {
    public int percRemaining = 100;
    public String mainFruit;
    public String secondaryFruit;
    public boolean proteinPowder;
    
    public void drinkSmoothie(int percentEaten){
        percRemaining = percRemaining - percentEaten;
        
    }//close method
    
    public void addProtein(){
        proteinPowder = true;
    }//close method
    
   public int getPercRemaining(){
        return percRemaining;
    }//close method
   
}//close class
