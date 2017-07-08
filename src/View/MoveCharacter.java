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
public abstract class MoveCharacter extends View{  //was not abstract
    
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
        String  value = "";// value to be returned
        String value2 = "";
        boolean valid    = false;                     // initialize to not valid
        try{
        while (!valid) {
            this.console.println("\n Enter Row # " + "/n Enter Q to cancel" );
            value = this.keyboard.readLine();    // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks 
            
            if (value.length() < 1 || value.length() > 1 ) {
                ErrorView.display(this.getClass().getName(),"\nInvalid value: please try again");

                continue;
            }

            break;                          // end the loop
        }
        }catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }

        return value;    // return the value entered
    
}
    
       public String getUserInput2() {      
        String value2 = "";
        boolean valid    = false;                     // initialize to not valid
        try{
        while (!valid) {
            
            
            this.console.println("\n Enter Column # " + "/n Enter Q to cansel");
            value2 = this.keyboard.readLine();
            value2 = value2.trim();

            if (value2.length() < 1 || value2.length() > 1) {
                ErrorView.display(this.getClass().getName(),"\nInvalid value: please try again");

                continue;
            }

            break;                          // end the loop
        }
        }catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }

        return value2;// return the value entered
    
}
    public boolean doAction(String choice, String choice2){
        
       this.setCurrentLocation();
       this.calcTimeAndFuelUsed();
       
       

        
        
       
        
        return false;
    }

    private void setCurrentLocation() {
        this.console.println(" when ready, this function will take the values "
                + "entered and change the location on the map to the current"
                + "location  ");
    }

    private void calcTimeAndFuelUsed() {
        this.console.println("this will calculate time and fuel used in travel");
    }
}
    
 

  


