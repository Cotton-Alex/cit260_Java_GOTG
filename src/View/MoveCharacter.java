/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class MoveCharacter {
    
    public void moveCharacter() {
        boolean done = false;    // set flag to not done
        do {
            // prompt for and get players name
            String userInput = this.getUserInput();
            if (userInput.toUpperCase().equals("Q"))      // user want to quit
                return; // exit the game
            String userInput2 = this.getUserInput2();
            if (userInput2.toUpperCase().equals("Q"))      // user want to quit
                return;  

            // do the requested action and display the next view
            done = this.doAction(userInput, userInput2);
        } while (!done);
    }

    public String getUserInput() {
        Scanner keyboard = new Scanner(System.in);    // get infile for keyboard
        String  value    = "";// value to be returned
        String value2 = "";
        boolean valid    = false;                     // initialize to not valid

        while (!valid) {
            System.out.println("\n Enter Row # " + "/n Enter Q to cansel" );
            value = keyboard.nextLine();    // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks 
            
            if (value.length() < 1 || value.length() > 1 ) {
                System.out.println("\nInvalid value: please try again");

                continue;
            }

            break;                          // end the loop
        }

        return value;    // return the value entered
    
}
    
       public String getUserInput2() {
        Scanner keyboard = new Scanner(System.in);    // get infile for keyboard
       
        String value2 = "";
        boolean valid    = false;                     // initialize to not valid

        while (!valid) {
            
            
            System.out.println("\n Enter Column # " + "/n Enter Q to cansel");
            value2 = keyboard.nextLine();
            value2 = value2.trim();

            if (value2.length() < 1 || value2.length() > 1) {
                System.out.println("\nInvalid value: please try again");

                continue;
            }

            break;                          // end the loop
        }

        return value2;    // return the value entered
    
}
    public boolean doAction(String choice, String choice2){
        
       this.setCurrentLocation();
       this.calcTimeAndFuelUsed();
       
       

        
        
       
        
        return false;
    }

    private void setCurrentLocation() {
        System.out.println(" when ready, this function will take the values "
                + "entered and change the location on the map to the current"
                + "location  ");
    }

    private void calcTimeAndFuelUsed() {
        System.out.println("this will calculate time and fuel used in travel");
    }
}
    
 

  


