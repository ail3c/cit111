/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.util.Scanner;

/**
 *
 * @author cruef
 */
public class CharacterLand {
    public static void main(String[] args) {
        int decision = 1; 
        while (decision == 1){
        
        Character firstCharacter;
        
        //create a new Character (an instance of the Character class)
        firstCharacter = new Character();
        
        //USER INTERFACE
        System.out.println("Pick a name for your new character!");
        //create scanner
        Scanner userInput = new Scanner(System.in);
        String characterName = userInput.next();
        
        System.out.println("Pick a class for your new character!");
        System.out.println("Here are your choices: ");
        System.out.println("\t Warrior");
        System.out.println("\t Hunter");
        System.out.println("\t Warlock");
        System.out.println("\t Healer");
        String characterClass = userInput.next();
        printDivider();
        
        
        //access the properties of these member variables and store info
        firstCharacter.name = characterName;
        firstCharacter.class1 = characterClass;
        firstCharacter.attackpower = 12;
        firstCharacter.healthpoints = 100;
        firstCharacter.manapoints = 100;
        
        
        
        //print character name
        System.out.println("Your characters name is " + firstCharacter.name.substring(0,1).toUpperCase() + firstCharacter.name.substring(1));
        System.out.println("The class you have chosen is " + firstCharacter.class1.substring(0,1).toUpperCase() + firstCharacter.class1.substring(1));
        printDivider();
        
        
        //print character armor type
        //print character combat type
        //print character attack power
        //print character health points
        //print character mana points
        
        System.out.println("Your stats will now be randomized. Good luck!");
        System.out.println("");
        
        firstCharacter.randomizeHP();
        System.out.println("\tYour character has a total of " + firstCharacter.getcharacterHP() + " health points.");
        firstCharacter.randomizeMP();
        System.out.println("\tYour character has a total of " + firstCharacter.getcharacterMP() + " mana points.");
        firstCharacter.randomizeATK();
        System.out.println("\tYour characters attack power is " + firstCharacter.getcharacterATK() + ".");
        printDivider();
        
        System.out.println("Do you want to make another character?");
        System.out.println("\t 1. Yes");
        System.out.println("\t 2. No");
        decision = userInput.nextInt();
        
        printDivider();
        
        }//close while
        System.out.println("Thanks for making a new character! Good luck in your future adventures.");
    }//close main
    
    //print method 
    private static void printDivider(){
            System.out.println("............................................");
        }//close method
    
}//close class
