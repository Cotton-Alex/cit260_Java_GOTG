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
    
    public enum Item {
        mindStone,
        tesseract,
        aether,
        orb,
        soulStone,
        timeStone;
    }
    
    public static Inventory[] createInventory(){
       
        //array(list) for inventory
        Inventory[] inventory = new Inventory[5];
        
        Inventory mindStone = new Inventory();
        mindStone.setInventoryType("Mind Stone");
        mindStone.setQuantityInStock(0);
        mindStone.setRequiredAmount(0);
        inventory[Item.mindStone.ordinal()] = mindStone;
        
               Inventory tesseract = new Inventory();
        tesseract.setInventoryType("Tesseract");
        tesseract.setQuantityInStock(0);
        tesseract.setRequiredAmount(0);
        inventory[Item.tesseract.ordinal()] = tesseract;
        
               Inventory aether = new Inventory();
        aether.setInventoryType("Aether");
        aether.setQuantityInStock(0);
        aether.setRequiredAmount(0);
        inventory[Item.aether.ordinal()] = aether;
        
               Inventory orb = new Inventory();
        orb.setInventoryType("Orb");
        orb.setQuantityInStock(0);
        orb.setRequiredAmount(0);
        inventory[Item.orb.ordinal()] = orb;
        
               Inventory soulStone = new Inventory();
        soulStone.setInventoryType("Soul Stone");
        soulStone.setQuantityInStock(0);
        soulStone.setRequiredAmount(0);
        inventory[Item.soulStone.ordinal()] = soulStone;
        
               Inventory timeStone = new Inventory();
        timeStone.setInventoryType("Time Stone");
        timeStone.setQuantityInStock(0);
        timeStone.setRequiredAmount(0);
        inventory[Item.timeStone.ordinal()] = timeStone;
        
        
        
        return inventory;
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