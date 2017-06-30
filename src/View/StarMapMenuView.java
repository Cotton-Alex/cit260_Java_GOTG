/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import GOTG.GOTG;
import Model.Game;
import Model.Location;
import Model.Map;
import java.util.Scanner;

/**
 *
 * @author Mike Minassian
 */
public class StarMapMenuView extends View {

    private String menu;
    private String promptMessage;

    public StarMapMenuView() {
        super("\n" + "\n----------------------------------"
                + "\n|  Star Map                      |"
                + "\n----------------------------------"
                + "\nY - You are here"
                + "\nM - Move to Sector"
                + "\nN - Move to Site"
                + "\nD - Display Star Map"
                + "\nF - Fuel and Time amount"
                + "\nQ - Back"
                + "\n----------------------------------");
    }
//    public void displayStarMapMenuView() {
//        boolean done = false;    // set flag to not done
//        do {
//            // prompt for and get players name
//            String menuOption = this.getMenuOption();
//            if (menuOption.toUpperCase().equals("Q"))      // user want to quit
//                return;                                    // exit the game
//
//            // do the requested action and display the next view
//            done = this.doAction(menuOption);
//        } while (!done);
//    }
//
//    public String getMenuOption() {
//        Scanner keyboard = new Scanner(System.in);    // get infile for keyboard
//        String  value    = "";                        // value to be returned
//        boolean valid    = false;                     // initialize to not valid
//
//        while (!valid) {
//            System.out.println("\n" + this.menu);
//            value = keyboard.nextLine();    // get next line typed on keyboard
//            value = value.trim();           // trim off leading and trailing blanks
//
//            if (value.length() < 1) {
//                System.out.println("\nInvalid value: value can not be blank");
//
//                continue;
//            }
//
//            break;                          // end the loop
//        }
//
//        return value;    // return the value entered
//    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "Y": // create and start a new game
                this.youAreHere();
                break;
            case "M": // get and start an existing game
                this.moveToSector();
                break;
            case "N":
                this.moveToSite();
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
        displayStarMap();
        MapView mapView = new MapView();
        mapView.setSectorJump(Boolean.TRUE);
        mapView.display();
        displayStarMap();
    }
     private void moveToSite() {
        displayStarMap();
        MapView mapView = new MapView();
        mapView.setSectorJump(Boolean.FALSE);
        mapView.display();
        displayStarMap();
     }

    private void fuelAndTimeAmount() {
        System.out.println("*** Display the current level of fuel"
                + "\n and time that is left.***");
    }

    public void displayStarMap() {
        String leftIndicator;
        String rightIndicator;

        Game game = GOTG.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        // Build the heading of the map
        System.out.print("  |");
        for (int column = 0; column < locations[0].length; column++) {
            // print col numbers to side of map
            System.out.print("  " + column + " |");
        }
        // Now build the map.  For each row, show the column information
        System.out.println();
        for (int row = 0; row < locations.length; row++) {
            System.out.print(row + " "); // print row numbers to side of map
            for (int column = 0; column < locations[row].length; column++) {
                // set default indicators as blanks
                leftIndicator = " ";
                rightIndicator = " ";
                if (locations[row][column] == map.getCurrentLocation()) {
                    // Set star indicators to show this is the current location.
                    leftIndicator = "*";
                    rightIndicator = "*";
                } else if (locations[row][column].isVisited()) {
                    // Set < > indicators to show this location has been visited.
                    leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "<"; // same as above
                }
                System.out.print("|"); // start map with a |
                if (locations[row][column].getScene() == null) {
                    // No scene assigned here so use ?? for the symbol
                    System.out.print(leftIndicator + "??" + rightIndicator);
                } else {
                    System.out.print(leftIndicator
                            + locations[row][column].getScene().getSymbol()
                            + rightIndicator);
                }
            }
            System.out.println("|");
        }
        System.out.println("You are currently on "+map.getCurrentScene().getName());
        System.out.println(map.getCurrentScene().getDescription());
    }

    
}
