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
public class GameMenuView {
    private String menu;
    private String promptMessage;

    public GameMenuView() {
        this.menu = "\n" + "\n----------------------------------"
                         + "\n|  Game Menu                     |"
                         + "\n----------------------------------"
                         + "\nM - Game Map"
                         + "\nI - Inventory"
                         + "\nH - How to play"
                         + "\nT - Time and Fuel Remaining"
                         + "\nS - Save game"
                         + "\nQ - Main Menu"
                         + "\n----------------------------------";
    }

    public void displayGameMenuView() {
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
            case "M": // create and start a new game
                this.gameMap();
                break;
            case "I": // get and start an existing game
                this.inventory();
                break;
            case "H": //display the help menu
                this.displayHelpMenu();
                break;
            case "T":
                this.timeAndFuel();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    
}

    private void gameMap() {
       System.out.println("this will display the map");
        StarMapMenuView starMap = new StarMapMenuView();
        
    }

    private void inventory() {
        System.out.println("this will display the users inventory");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
      helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
       throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void timeAndFuel() {
        System.out.println("this will display the users fuel and time remaining");
    }

}