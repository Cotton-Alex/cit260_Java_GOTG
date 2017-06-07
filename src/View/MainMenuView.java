
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package View;

import Control.GameControl;
import GOTG.GOTG;
import Model.GameMenuView;
import java.util.Scanner;

/**
 * @author alexcotton
 */

public class MainMenuView {
    private String menu;
    private String promptMessage;

    public MainMenuView() {
        this.menu = "\n" + "\n----------------------------------"
                         + "\n|  Main Menu                     |"
                         + "\n----------------------------------"
                         + "\nN - Start new game"
                         + "\nG - Get and start saved game"
                         + "\nH - How to play"
                         + "\nS - Save game"
                         + "\nQ - Quit"
                         + "\n----------------------------------";
    }

    public void displayMainMenuView() {
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
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": //display the help menu
                this.displayHelpMenu();
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

    /**
     * Prompt message
     */
//    private String getMenuOption() {
//        //this.promptMessage = ("\nPlease enter your menu selection: ");
//        System.out.println("\n*** doction() function called ***");
//        return "N";
//    }

    private void startNewGame() {
             // create a new game
            GameControl.createNewGame(GOTG.getPlayer());
        
             //display the game menu
             GameMenuView gameMenu = new GameMenuView();
             gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***"); 
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }    
}
