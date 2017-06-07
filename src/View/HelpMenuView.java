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
public class HelpMenuView {
    
    private String menu;
    private String promptMessage;
    
    public HelpMenuView() {
        this.menu = "\n" + "\n----------------------------------"
                         + "\n|  Getting Help                     |"
                         + "\n----------------------------------"
                         + "\nG - What is the goal of the game"
                         + "\nM - How to move"
                         + "\nE - Gathering Items"
                         + "\nH - Gathering Infinity Stones"
                         + "\nT - Fuel and Time"
                         + "\nQ - Quit"
                         + "\n----------------------------------";
    }
    public void displayHelpMenuView() {
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
            case "G": // create and start a new game
                this.goalOfTheGame();
                break;
            case "M": // get and start an existing game
                this.howToMove();
                break;
            case "E": //display the help menu
                this.gatheringItems();
                break;
            case "H": // save the current game
                this.gatheringInfinityStones();
                break;
            case "T":
                this.fuelAndTime();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }
    
     

    private void goalOfTheGame() {
        System.out.println("*** goalOfTheGame function called ***");
    }

    private void howToMove() {
        System.out.println("*** howToMove function called ***"); 
    }

    private void gatheringItems() {
        System.out.println("*** gatheringItems function called ***");
    }

    private void gatheringInfinityStones() {
        System.out.println("*** gatheringInfinityStones function called ***"); 
    }
    private void fuelAndTime() {
        System.out.println("*** fuelAndTime function called ***");
    }
}
