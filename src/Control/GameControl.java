/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Player;
import GOTG.GOTG;
import Model.Game;
import Model.Inventory;

/**
 *
 * @author alexcotton
 */

public class GameControl {
    
    public static void createNewGame(Player player){
        
        Game game = new Game();  //create new game
        GOTG.setCurrentGame(game);  // save in GOTG
        
        game.setPlayer(player);  //save player in game
        
        //create the inventory list and save in the game
        Inventory[] inventory = GameControl.createInventory();
        game.setInventory(inventory);
        
        Map map = MapControl.createMap();  //create and initialize new map
        game.setMap(map);  //save map in game
        
        // move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    }
    
    public static Inventory[] createInventory(){
        System.out.println("*** called createInventory() in GameControl ***");
        return null;
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