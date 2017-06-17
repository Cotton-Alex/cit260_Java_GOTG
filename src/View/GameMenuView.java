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
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n" + "\n----------------------------------"
                         + "\n|  Game Menu                     |"
                         + "\n----------------------------------"
                         + "\nM - Game Map"
                         + "\nI - Inventory"
                         + "\nH - How to play"
                         + "\nT - Time and Fuel Remaining"
                         + "\nS - Save game"
                         + "\nQ - Main Menu"
                         + "\n----------------------------------");
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
        starMap.displayStarMapMenuView();
        
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