
package objects1;

/**
 *
 * @author celia
 */
public class Donut {
    
    //member variables
    private int percRemaining = 100;
    public String name;
    public String coating;
    
    //method: this takes in an integer representing the size of a bite
    //being taken of this donut. returns nothing.
    
    public void simulateEating(int percentEaten){
        //subtract the bite size form the existing donut percent remaining
        percRemaining = percRemaining - percentEaten;
    }//close method
    
    //method: takes no input parameters and returns percRemaining 
    public int getPercRemaining(){
        //very simple. just send back the value of one of the objects member 
        //variables to the calling method. this is called a 'getter'
        return percRemaining;
    }//close method
    
    //theres no main method in this class
    //we must make this object with the new keyword inside another class
    //in order for this class to do anything
}
