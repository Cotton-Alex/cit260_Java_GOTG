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
public class HelpMenuView extends View {
    
   
    
    private String menu;
    private String promptMessage;
    
    public HelpMenuView() {
        super("\n" + "\n----------------------------------"
                         + "\n|  Getting Help                     |"
                         + "\n----------------------------------"
                         + "\nG - What is the goal of the game"
                         + "\nM - How to move"
                         + "\nE - Gathering Items"
                         + "\nH - Gathering Infinity Stones"
                         + "\nT - Fuel and Time"
                         + "\nQ - Back"
                         + "\n----------------------------------");
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
        String  value    = "";                        // value to be returned
        boolean valid    = false;                     // initialize to not valid
        try{
        while (!valid) {
            System.out.println("\n" + this.menu);
            value = this.keyboard.readLine();    // get next line typed on keyboard
            value = value.trim();           // trim off leading and trailing blanks

            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");

                continue;
            }

            break;                          // end the loop
        }
        }catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
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
        System.out.println(
                "*** The goal of the game is to travel the"
                + " realms as baby groot in search of the 5"
                + " infinity stones to beat Thantos before"
                + " the time runs out. If you gather all 5 "
                + " before the time runs out, you win. ***");
    }

    private void howToMove() {
        System.out.println(
                "*** you move by using the map to travel between realms."
                + " You do this by entering a sector and a quadrant "
                + " in the map to travel, traveling takes fuel and "
                + " time. the map displays your current location "
                + " with a star. ***"); 
    }

    private void gatheringItems() {
        System.out.println("*** You will need to gather items throught the game."
                + " these items can be used to get different infinity stones"
                + " or give you an edge in your quest. Search sectors to"
                + " find different items. When you find one, there will"
                + " be an option to add it to your inventory ***");
    }

    private void gatheringInfinityStones() {
        System.out.println("*** You will find the infinity stones throught the"
                + "galaxy. When you come accross one, you will add it to"
                + "your collection that you have so far. find all 5 and"
                + "you win. ***"); 
    }
    private void fuelAndTime() {
        System.out.println("*** Fuel and time and used throught the game for"
                + "traveling and different actions. You can replenish your"
                + "fuel by visiting a fuel station but time is limited. you"
                + "cannot get time back after it has been spent. if you run"
                + "out of time before you get all the infinity stones, then"
                + "you loose the game ***");
    }
}
