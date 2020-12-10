
package finalproject;
import java.util.Random;
/**
 *
 * @author celia
 */
public class Character {
    
    //member variables
    
    public String name;
    public String class1;
    public int healthpoints;
    public int manapoints;
    public int attackpower;
    
    public int characterHP = 0;
    public int characterMP = 0;
    public int characterATK = 0;
    
    //high and low values for randomizers. this is so i can generate a number
    //inbetween a min and max.
    public int highHP = 1000;
    public int lowHP = 700;
    public int highMP = 700;
    public int lowMP = 500;
    public int highATK = 50;
    public int lowATK = 25;
    
    //METHODS FOR HP
    public void randomizeHP(){
        //generate random HP
        Random randGenerator = new Random();
        characterHP = randGenerator.nextInt(highHP - lowHP) + lowHP;
    }//close method
    
    //method: takes no input parameters and returns percRemaining 
    public int getcharacterHP(){
        //this just returns characterHP value
      return characterHP;
    }//close method
    
    //METHODS FOR MP
    
    public void randomizeMP(){
        //generate random HP
        Random randGenerator = new Random();
        characterMP = randGenerator.nextInt(highMP - lowMP) + lowMP;
    }//close method
    
    //method: takes no input parameters and returns percRemaining 
    public int getcharacterMP(){
        //returns characterMP value
      return characterMP;
    }//close method
    
    //METHODS FOR ATK
    
    public void randomizeATK(){
        //generate random HP
        Random randGenerator = new Random();
        characterATK = randGenerator.nextInt(highATK - lowATK) + lowATK;
    }//close method
    
    //method: takes no input parameters and returns percRemaining 
    public int getcharacterATK(){
        //returns characterMP value
      return characterATK;
    }//close method
    
    
    
}
