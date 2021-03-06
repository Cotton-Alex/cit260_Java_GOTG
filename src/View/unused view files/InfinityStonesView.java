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
public class InfinityStonesView extends View {

    public InfinityStonesView() {
        super("\n" + "\n----------------------------------"
                + "\n|  Infinity Stones              |"
                + "\n----------------------------------"
                + "\nR - Reality Stone"
                + "\nS - Space Stone"
                + "\nM - Mind Stone"
                + "\nT - Time Stone"
                + "\nP - Power Stone"
                + "\nO - Soul Stone"
                + "\nQ - Back"
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "R": // Reality Stone
                this.realityStone();
                break;
            case "S": // Space Stone
                this.spaceStone();
                break;
            case "M": // Mind Stone
                this.mindStone();
                break;
            case "T":
                this.timeStone();
                break;
            case "P": // Power Stone
                this.powerStone();
                break;
            case "O": // Soul Stone
                this.soulStone();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }

        return false;

    }
    
    private void realityStone() {
       this.console.println("Will tell you if you have obtainted the Reality Stone.");        
    }

    private void spaceStone() {
        this.console.println("Will tell you if you have obtainted the Space Stone.");
    }

    private void mindStone() {
        this.console.println("Will tell you if you have obtainted the Mind Stone.");
    }

    private void timeStone() {
       this.console.println("Will tell you if you have obtainted the Time Stone."); 
    }
    
    private void powerStone() {
       this.console.println("Will tell you if you have obtainted the Power Stone."); 
    }

    private void soulStone() {
        this.console.println("Will tell you if you have obtainted the Soul Stone.");
    }
}
