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
            this.console.println("\n" + this.menu);
            value = this.keyboard.readLine();    // get next line typed on keyboard
            value = value.trim();           // trim off leading and trailing blanks

            if (value.length() < 1) {
                ErrorView.display(this.getClass().getName(),"\nInvalid value: value can not be blank");

                continue;
            }

            break;                          // end the loop
        }
        }catch (Exception e) {
           ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
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
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }
    
     

    private void goalOfTheGame() {
        this.console.println(
                "*** The goal of the game is to travel the"
                + "\nrealms as baby groot in search of the 6"
                + "\ninfinity stones to beat Thantos before"
                + "\nthe time runs out. If you gather all 6 "
                + "\nbefore the time runs out, you win. ***");
    }

    private void howToMove() {
        this.console.println(
                "*** You move by using the map to travel between realms."
                + "\nYou do this by entering a sector and a quadrant "
                + "\nin the map to travel, traveling takes fuel and "
                + "\ntime. the map displays your current location "
                + "\nwith a star. ***"); 
    }

    private void gatheringItems() {
        this.console.println("*** You will need to gather items throught the game."
                + "\nthese items can be used to get different infinity stones"
                + "\nor give you an edge in your quest. Search sectors to"
                + "\nfind different items. When you find one, there will"
                + "\nbe an option to add it to your inventory ***");
    }

    private void gatheringInfinityStones() {
        this.console.println("*** You will find the infinity stones throught the"
                + "\ngalaxy. When you come accross one, you will add it to"
                + "\nyour collection that you have so far. find all 6 and"
                + "\nyou win. ***"); 
    }
    
    private void fuelAndTime() {
        this.console.println("*** Fuel and time and used throught the game for"
                + "\ntraveling and different actions. You can replenish your"
                + "\nfuel by visiting a fuel station but time is limited. you"
                + "\ncannot get time back after it has been spent. if you run"
                + "\nout of time before you get all the infinity stones, then"
                + "\nyou loose the game ***");
    }
}
