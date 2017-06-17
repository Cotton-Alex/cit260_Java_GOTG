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
public class MoveToSectorMenuView extends View{   
   
    
    private String menu;
    private String promptMessage;
    
    public MoveToSectorMenuView() {
        super("\n" + "\n----------------------------------"
                         + "\n|  Sector Map                    |"
                         + "\n----------------------------------"
                         + "\nH - Hala"
                         + "\nX - Xandar"
                         + "\nK - The Kyln"
                         + "\nW - Knowhere"
                         + "\nM - Morag IV"
                         + "\nQ - Quit"
                         + "\n----------------------------------");
    }
//    public void displayMoveToSectorMenuView() {
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
        System.out.println("*** Display halaDockMenu***");
    }

    private void moveToXandar() {
         System.out.println("*** Display xandarDockMenu***");
    }
    private void moveToKnowhere() {
         System.out.println("*** Display knowhereDockMenu***");
    }

    private void moveToTheKyln() {
         System.out.println("*** Display theKylnDockMenu***");
    }

    private void moveToMoragIV() {
         System.out.println("*** Display moragIVDockMenu***");
    }
}
