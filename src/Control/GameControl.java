/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Player;
import GOTG.GOTG;

/**
 *
 * @author alexcotton
 */

public class GameControl {
    
    public static void createNewGame(Player player){
        
        System.out.println("\n*** createNewGame stub function called ***");
    }

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        GOTG.setPlayer(player); // save the player
        
        return player;
    }
    
}