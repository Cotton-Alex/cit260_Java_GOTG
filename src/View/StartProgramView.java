/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.GameControl;
import Model.Player;
import java.util.Scanner;

/**
 *
 * @author alexcotton
 */
public class StartProgramView extends View {

    public void displayStartProgramView() {

        boolean done = false; // set flag to not done
        do {
            //prompt for and get playersName
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
            //add time delayed lyrics - "Ooh-oo child Things are gonna get easier. Ooh-oo child Things'll get brighter"
            {
                return; //exit the game
            }//            else if (playesName.toUpperCase().equals("GROOT"))
//               System.out.println("\nGroot... nice choice. We're gonna get along.");
//            else            

            //do requested action and display next view
            done = this.doAction(playersName);

        } while (!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        try {
        while (!valid) {
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks

            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break; // end the loop
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }
        return value; // return the value entered
    }

    private String promptMessage;

    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        this.displaybanner();
    }

    public void displaybanner() {
        System.out.println(
                "\n*****************************************************************"
                + "\n+                                                               +"
                + "\n+                          * /         /                        +"
                + "\n+                     /     //         ,. (                     +"
                + "\n+                .  /  /  **/*  ***/    *//                     +"
                + "\n+                ,*/  /./**/(.///***/  *//                      +"
                + "\n+                 (/# /*,,*//********(*/// /(*                  +"
                + "\n+                 (/#//(*,,////****/**/*/*((((                  +"
                + "\n+                 ((////,/**///**/***(**//(((.                  +"
                + "\n+                 ((/(//*/*//*/////*(*(**/(((                   +"
                + "\n+                 ((////***//(////*******//((                   +"
                + "\n+                 ,((/*/*****(//(//******//(/                   +"
                + "\n+                  ((/###(///(//(//*//###/(((                   +"
                + "\n+                  ((#@@%%((/**(**/(#@@#%#((#                   +"
                + "\n+                  ((&@@@@@#/*///*/(&@@@@(#                     +"
                + "\n+                  ((#(@@##*////(///(#&#((#                     +"
                + "\n+                  (((/*//////(///////*//(/(#                   +"
                + "\n+                   ((((((((((((((/(((((((((                    +"
                + "\n+                   ((((((((((((((((((#(((#                     +"
                + "\n+                      #%%%%%#######%%#,                        +"
                + "\n+                        ##((((#(((((#(((                       +"
                + "\n+                    (((/((*/////////#(/( /                     +"
                + "\n+                     //*(((//(//(//(((///(  (//                +"
                + "\n+                   ((//(  //(//**(##. #((/(#/#*%(              +"
                + "\n+                  #*(/(   (//*(//#/(   ,##(//(#/(.             +"
                + "\n+                   //////.(#((///(((           /               +"
                + "\n+                  .((    %(##%(((///(                          +"
                + "\n+                  **     &%%(((#(///((                         +"
                + "\n+                   ,((( .%#((#  *(///(#                        +"
                + "\n+                        /((((&,  #(((((                        +"
                + "\n+                        #///##   (((/(((                       +"
                + "\n+                       *(((#(,    #//*(/                       +"
                + "\n+                    ,##(((((/(#  .#(*/(#/.                     +"
                + "\n+                   (/(((*/*((/. .(#((//(//(/                   +"
                + "\n+                                                               +"
                + "\n+                                                               +"
                + "\n+            Guardians of the Galaxy: Groots Revenge            +"
                + "\n+                                                               +"
                + "\n*****************************************************************"
        );
    }

    public boolean doAction(String playersName) {  //originally was public
        if (playersName.length() < 2) { //if the players name is less than 2 characters
            ErrorView.display(this.getClass().getName(),"\nInvalid players name: "
                    + "The name must be more than 1 character in length");
            return false;
        }

        Player player = GameControl.createPlayer(playersName);

        if (player == null) { // unsuccessful
            ErrorView.display(this.getClass().getName(),"\nError creating the player.");
            return false;
        }
        //display next view
        this.displayNextView(player);

        return true; //success!
    }

    private void displayNextView(Player player) {
        System.out.println(
             "\n=========================================================="
            +"\nWelcome to Guardians of the Galaxy, " + player.getName() + "."
            +"\nBuckle up, it's gonna be a bumpy ride."
            +"\n=========================================================="
        );
        // Create MainMenuObject
        MainMenuView mainMenuView = new MainMenuView();

        // Display the main menu view
        mainMenuView.display();
    }
}
