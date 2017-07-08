/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.GameControl;
import GOTG.GOTG;
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

    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "M": // create and start a new game
                this.gameMap();
                break;
            case "I": // get and start an existing game
                this.inventoryMenuView();
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
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    
}

    private void gameMap() {
       
        StarMapMenuView starMap = new StarMapMenuView();
        starMap.display();
        
    }

    private void inventoryMenuView() {
        InventoryMenuView inventoryMenu = new InventoryMenuView();
      inventoryMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
      helpMenu.display();
    }

    private void saveGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game is to be saved.");
        String filePath = this.getInput();
        
        try{
            //save the game to the specified file
            GameControl.saveGame(GOTG.getCurrentGame(), filePath);
        }catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void timeAndFuel() {
        System.out.println("this will display the users fuel and time remaining");
    }
    

}