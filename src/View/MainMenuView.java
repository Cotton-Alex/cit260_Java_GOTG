
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package View;

import Control.GameControl;
import GOTG.GOTG;
import Model.Player;
import Model.Game;
//import java.util.Scanner;

/**
 * @author alexcotton
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n" + "\n----------------------------------"
                + "\n|  Main Menu                     |"
                + "\n----------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - How to play"
                + "\nS - Save game"
                + "\nQ - Quit game"
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

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
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
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

        //StartProgramView startProgramView = new StartProgramView();
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();

        //display the game menu
//        GameMenuView gameMenu = new GameMenuView();
//        gameMenu.display();
    }

//    private void startExistingGame() {
//        // prompt for and get the name of the file to save the game in
//        this.console.println("\n\nEnter the file path for file where the game is to be saved");
//
//        String filePath = this.getInput();
//
//        this.console.println("1");
//        try {
//            //start a saved game
//            GameControl.getExsistingGame(filePath);
//            this.console.println("2");
//            Game game = GOTG.getCurrentGame();
//            this.console.println("3");
//            Player player = GOTG.getPlayer();
//
//            String playerName = player.getName();
//            this.console.println("4");
//            this.displayNextView(playerName);
//            this.console.println("5");
//        } catch (Exception ex) {
//            ErrorView.display("MainMenuView", ex.getMessage());
//        }
//    }
    private void startExistingGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game is to be saved");

        String filePath = this.getInput();

        try {
            //start a saved game
            GameControl.getExsistingGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

//    private void displayNextView(String playerName) {
//        this.console.println("6");
//        this.console.println(
//                "\n=========================================================="
//                + "\nHey, " + playerName + "."
//                + "\nBack again for more?"
//                + "\n=========================================================="
//        );
//        // Create MainMenuObject
//        this.console.println("7");
//        MainMenuView mainMenuView = new MainMenuView();
//        this.console.println("1");
//        // Display the main menu view
//        mainMenuView.display();
//    }
//    private void startExistingGame() {
//        // prompt for and get the name of the file to save the game in
//        this.console.println("\n\nEnter the file path for file where the game is to be saved");
//
//        String filePath = this.getInput();
//
//        try {
//            //start a saved game
//            GameControl.getExsistingGame(filePath);
//        } catch (Exception ex) {
//            ErrorView.display("MainMenuView", ex.getMessage());
//        }
//        String playerName = Player.getName
//        );
//        this.console.println(playerName);
//        // display the game menu
//        GameMenuView gameMenu = new GameMenuView();
//        gameMenu.display();
//    }
    // display the game menu
//        GameMenuView gameMenu = new GameMenuView();
//        gameMenu.display();
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
        //prompt for and get the name of the file to save the game in
        String saveMenu = display;
        display = ("\n\nEnter the file path for the file where the game is to be saved.");
        String filePath = this.getInput();

        try {
            //save the game to the specified file
            GameControl.saveGame(GOTG.getCurrentGame(), filePath);
            this.console.println("Galaxy Game successfully saved to " + filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        display = saveMenu;
    }
}
