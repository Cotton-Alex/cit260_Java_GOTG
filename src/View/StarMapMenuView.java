/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Mike Minassian
 */
public class StarMapMenuView {   
   
    
    private String menu;
    private String promptMessage;
    
    public StarMapMenuView() {
        this.menu = "\n" + "\n----------------------------------"
                         + "\n|  Star Map                      |"
                         + "\n----------------------------------"
                         + "\nY - You are here"
                         + "\nM - Move to Sector"
                         + "\nD - Display Star Map"
                         + "\nF - Fuel and Time amount"
                         + "\nQ - Quit"
                         + "\n----------------------------------";
    }
    public void displayStarMapMenuView() {
        boolean done = false;    // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))      // user want to quit
                return;                                    // exit the game

            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }

    public String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);    // get infile for keyboard
        String  value    = "";                        // value to be returned
        boolean valid    = false;                     // initialize to not valid

        while (!valid) {
            System.out.println("\n" + this.menu);
            value = keyboard.nextLine();    // get next line typed on keyboard
            value = value.trim();           // trim off leading and trailing blanks

            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");

                continue;
            }

            break;                          // end the loop
        }

        return value;    // return the value entered
    }
    
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "Y": // create and start a new game
                this.youAreHere();
                break;
            case "M": // get and start an existing game
                this.moveToSector();
                break;
            case "D": //display the help menu
                this.displayStarMap();
                break;
            case "F":
                this.fuelAndTimeAmount();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }
    
     

    private void youAreHere() {
        System.out.println(
                "*** Display position on Star Map ***");
    }

    private void moveToSector() {
        MoveCharacter move = new MoveCharacter();
        move.moveCharacter();
    }

    private void displayStarMap() {
        System.out.println("*** Display the entire Star Map ***");
    }
    private void fuelAndTimeAmount() {
        System.out.println("*** Display the current level of fuel"
                          +"\n and time that is left.***");
    }
}
