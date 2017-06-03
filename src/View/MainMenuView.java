
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package View;

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
            System.out.println("\n" + this.promptMessage);
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

    /**
     * Prompt message
     */
//    private String getMenuOption() {
//        //this.promptMessage = ("\nPlease enter your menu selection: ");
//        System.out.println("\n*** doction() function called ***");
//        return "N";
//    }
    
    private boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() function called ***");
        return true;
    }
}
