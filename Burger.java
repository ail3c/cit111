
package objects1;

/**
 * an object class for FoodLand
 * @author celia
 */
public class Burger {
    public int percRemaining = 100;
    public boolean cheese;
    public String vegetable1;
    public String vegetable2;
    public String vegetable3;
    
    
    public void eatBurger(int percentEaten){
        percRemaining = percRemaining - percentEaten;
    }//close method
    
    
    public void addCheese(){
        cheese = true;
    }//close method
    
    public int getPercRemaining(){
        return percRemaining;
    }//close method
    
    
}
