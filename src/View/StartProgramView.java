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
public class StartProgramView {

public void displayStartProgramView() {

    boolean done = false; // set flag to not done
    do {
        //prompt for and get playersName
        String playersName = this.getPlayersName();
        if (playersName.toUpperCase().equals("Q")) // user wants to quit
            return; //exit the game
//        else if (playesName.toUpperCase().equals("GROOT"))
//           System.out.println("\nGroot... nice choice. We're gonna get along.");
//        else
//            

        //do requested action and display next view
        done = this.doAction(playersName);

    } while (!done);
}

private String getPlayersName() {

    Scanner keyboard = new Scanner(System.in); // get infile for keyboard
    String value = ""; // value to be returned
    boolean valid = false; //initialize to not valid

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

    return value; // return the value entered
}

private boolean doAction(String playersName) {
    
    if (playersName.length()<2) { //if the players name is less than 2 characters
        System.out.println("\nInvalid players name: " 
                + "The name must be more than 1 character in length");
     return false;
    }   
    
    //call createPlayer() control function
    Player player = GameControl.createPlayer(playersName);
    
    if (player == null) { // unsuccessful
        System.out.println("\nEerror creating the player.");
        return false;
    }
    
    
//
//
//
// Left off here - page 24 of the Team Assignment PDF
//
//
//

    //display next view
    this.displayNextView(player);
    
    return true; //success!
}


private String promptMessage;

public StartProgramView() {
   this.promptMessage = "\nPlease enter your name: ";
    this.displaybanner();
}
public void displaybanner() {
    System.out.println(
  "\n**************************************************************"
+ "\n+                                                            +"
+ "\n+                            ```                             +"                   
+ "\n+                       `. `.+/+-+:                          +"                
+ "\n+                      -/+//s+/+ssy:.                        +"              
+ "\n+                     `oso/+o+/+osy//`                       +"             
+ "\n+                    ooso++++++osos/o.                       +"             
+ "\n+                    sysoo+/++++++oo+.                       +"             
+ "\n+                    -hsoo++//+o+:+o+`                       +"             
+ "\n+                     oysso+/oyyho+++                        +"              
+ "\n+                     -hhdy+/ohhdo/o:                        +"              
+ "\n+                      +ddho++++o+++`                        +"              
+ "\n+                      `ohhs+++ooo+`                         +"              
+ "\n+                       `/syyssss+`                          +"                
+ "\n+                         `.-hdhhs-..`                       +"             
+ "\n+                         `-ohyoossoo/-                      +"            
+ "\n+                         shhy+++oyhdys-```                  +"       
+ "\n+                         sdysoooyhmhoys/:.`                 +"       
+ "\n+                         ydhyysyhdd:`/yo/.                  +"        
+ "\n+                      .ohhdyyysshy    -sy:                  +"        
+ "\n+                     :sy+oddhsyssh`    /y+                  +"        
+ "\n+                    /ysosmmNdyhs+s+   .sss.                 +"       
+ "\n+                    yy. omdmmyhyosy:.:/oso+                 +"       
+ "\n+                    /o `hdyh+-dyoohy-  +/++`                +"      
+ "\n+                    -:+hyys- :hhhdm:  `/-:                  +"       
+ "\n+                     ..:ydys+  :dNNNy-                      +"         
+ "\n+                       hmyyy   :Nmmhs                       +"            
+ "\n+                      -hhyyy:   yddhs/`                     +"          
+ "\n+                     :yydydyo   omhms++.                    +"         
+ "\n+                    `+ysyhys+/`  +ddyssss:                  +"        
+ "\n+                       `` `      `oy+shs+/                  +"  
+ "\n+                                   :/+.``                   +"         
+ "\n+                                                            +"
+ "\n+         Guardians of the Galaxy: Groots Revenge            +"
+ "\n+                                                            +"
+ "\n+*************************************************************"
        );
    }
}
