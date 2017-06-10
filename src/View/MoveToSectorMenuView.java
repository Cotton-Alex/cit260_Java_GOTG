/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author alexcotton
 */
public class MoveToSectorMenuView {   
   
    
    private String menu;
    private String promptMessage;
    
    public MoveToSectorMenuView() {
        this.menu = "\n" + "\n----------------------------------"
                         + "\n|  Sector Map                    |"
                         + "\n----------------------------------"
                         + "\nH - Hala"
                         + "\nX - Xandar"
                         + "\nK - The Kyln"
                         + "\nW - Knowhere"
                         + "\nM - Morag IV"
                         + "\nQ - Quit"
                         + "\n----------------------------------";
    }
    public void displayMoveToSectorMenuView() {
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
            case "H":
                this.moveToHala();
                break;
            case "X":
                this.moveToXandar();
                break;
            case "K":
                this.moveToTheKyln();
                break;
            case "W":
                this.moveToKnowhere();
                break;
            case "M":
                this.moveToMoragIV();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }


    private void moveToHala() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveToXandar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveToKnowhere() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveToTheKyln() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveToMoragIV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
