/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Player;
import GOTG.GOTG;
import Model.Game;
import Model.Item;
import Model.ItemType;
import Model.Location;
import Model.Map;
import Model.Scene;
import Model.SceneType;
import Model.Time;
import Exceptions.GameControlException;
import View.View;

/**
 *
 * @author alexcotton
 */
public class GameControl {

    public static void createNewGame(Player player) {

        Game game = new Game();  //create new game
        GOTG.setCurrentGame(game);  // save in GOTG

        game.setPlayer(player);  //save player in game

        //create the inventory list and save in the game
        Item[] inventory = GameControl.createInventory();
        game.setInventory(inventory);
        
        Time timeRemaning = new Time();
        game.setTime(timeRemaning);
        
        

//        Ship ship = new Ship();// create new ship
//        game.setShip(ship);// save ship in game

        Map map = MapControl.createMap();  //create and initialize new map
        game.setMap(map);  //save map in game

        // move actors to starting position in the map
        MapControl.movePlayerToStartingLocation(map);//TODO:get sample code movePlayersToStartingLocation and movePlayer
    }
    public static void assignScenesToLocations(Map map, Scene[] scenes) {
       
        Location locations[][] = map.getLocations();
        locations[0][0].setScene(scenes[SceneType.Earth.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.Starlords_Home.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.Earth_Bar.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.Avengers_HQ.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.Hala.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.Hala_Bar.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.Skrull_Palace.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.Skrull_House.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.Xandar.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.Nova_Prime.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.Nova_Command.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.Mechanic.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.TheKyln.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.Boss_Quarters.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.Prison_Cell.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.Stockpile.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.Knowhere.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.Command_Center.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.Knowhere_Bar.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.Mining_Bay.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.MoragIV.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.Prison.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.The_Collectors_Shop.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.The_Temple.ordinal()]);
        locations[6][0].setScene(scenes[SceneType.Asgard.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.Hall_of_Relics.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.Throne_Room.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.Bifrost.ordinal()]);
    }
    
    public static Item[] createInventory() {

        //array(list) for inventory
        Item[] inventory = new Item[ItemType.values().length];

        Item mindStone = new Item();
        mindStone.setItemType("Mind Stone");
        mindStone.setWeight(0);
        mindStone.setQuantityInStock(0);
        mindStone.setRequiredAmount(0);
        inventory[ItemType.mindStone.ordinal()] = mindStone;

        Item tesseract = new Item();
        tesseract.setItemType("Tesseract");
        tesseract.setWeight(0);
        tesseract.setQuantityInStock(0);
        tesseract.setRequiredAmount(0);
        inventory[ItemType.tesseract.ordinal()] = tesseract;

        Item aether = new Item();
        aether.setItemType("Aether");
        aether.setWeight(0);
        aether.setQuantityInStock(0);
        aether.setRequiredAmount(0);
        inventory[ItemType.aether.ordinal()] = aether;

        Item orb = new Item();
        orb.setItemType("Orb");
        orb.setWeight(0);
        orb.setQuantityInStock(0);
        orb.setRequiredAmount(0);
        inventory[ItemType.orb.ordinal()] = orb;

        Item soulStone = new Item();
        soulStone.setItemType("Soul Stone");
        soulStone.setWeight(0);
        soulStone.setQuantityInStock(0);
        soulStone.setRequiredAmount(0);
        inventory[ItemType.soulStone.ordinal()] = soulStone;

        Item eye_of_Agamotto = new Item();
        eye_of_Agamotto.setItemType("Eye of Agamotto");
        eye_of_Agamotto.setWeight(0);
        eye_of_Agamotto.setQuantityInStock(0);
        eye_of_Agamotto.setRequiredAmount(0);
        inventory[ItemType.Eye_of_Agamotto.ordinal()] = eye_of_Agamotto;
        
        Item yondus_Headpiece = new Item();
        yondus_Headpiece.setItemType("Yondu's Headpiece");
        yondus_Headpiece.setWeight(5);
        yondus_Headpiece.setQuantityInStock(0);
        yondus_Headpiece.setRequiredAmount(0);
        inventory[ItemType.yondus_Headpiece.ordinal()] = yondus_Headpiece;
        
         Item eco_Boost = new Item();
        eco_Boost.setItemType("Eco-boost");
        eco_Boost.setWeight(0);
        eco_Boost.setQuantityInStock(0);
        eco_Boost.setRequiredAmount(0);
        inventory[ItemType.eco_Boost.ordinal()] = eco_Boost;
        
        Item knowledge_of_the_soulstone = new Item();
        knowledge_of_the_soulstone.setItemType("Knowledge of the Soul Stone");
        knowledge_of_the_soulstone.setWeight(0);
        knowledge_of_the_soulstone.setQuantityInStock(0);
        knowledge_of_the_soulstone.setRequiredAmount(0);
        inventory[ItemType.knowledge_of_the_soulstone.ordinal()] = knowledge_of_the_soulstone;
        
        Item drax_Knives = new Item();
        drax_Knives.setItemType("Drax's Knives");
        drax_Knives.setQuantityInStock(0);
        drax_Knives.setRequiredAmount(0);
        inventory[ItemType.drax_Knives.ordinal()] = drax_Knives;
        
        Item vault_Key = new Item();
        vault_Key.setItemType("Vault Key");
        vault_Key.setWeight(2);
        vault_Key.setQuantityInStock(0);
        vault_Key.setRequiredAmount(0);
        inventory[ItemType.vault_Key.ordinal()] = vault_Key;
        
        Item walkman = new Item();
        walkman.setItemType("Walkman");
        walkman.setWeight(3);
        walkman.setQuantityInStock(0);
        walkman.setRequiredAmount(0);
        inventory[ItemType.walkman.ordinal()] = walkman;
        
        Item fuel = new Item();
        fuel.setItemType("fuel");
        fuel.setWeight(0);
        fuel.setQuantityInStock(100); //Todo: set staring fuel
        fuel.setRequiredAmount(0);
        inventory[ItemType.fuel.ordinal()] = fuel;

        return inventory;
    }
    
    public void inventoryPrint() 
                throws GameControlException{
        
        
        int j = 0;
        Game game = GOTG.getCurrentGame();
        
        if(game.getInventory() == null){
            throw new GameControlException("inventory has not yet been initialized");
        }
        
         Item[] items = game.getInventory();
        
        for (int i = 0; i <ItemType.values().length; i++) {
            if(items[i].getQuantityInStock() >= 1){
             System.out.println(items[i].getItemType()); // Fix Output
                j++;
            }
            
        }
       if(j == 0){
           System.out.println("you have no items in your inventory"); //Fix Error
           }
    }

//    public class QuickSort {
//
//        private Item[] inventory;
//
//        private int array[];
//        private int length;
//
//        public void sort(int[] inputArr) {
//
//            if (inputArr == null || inputArr.length == 0) {
//                return;
//            }
//            this.array = inputArr;
//            length = inputArr.length;
//            quickSort(0, length - 1);
//        }
//
//        private void quickSort(int lowerIndex, int higherIndex) {
//
//            int i = lowerIndex;
//            int j = higherIndex;
//            // calcualte pivot number, Pivot is middle index number
//            int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
//            // divide into 2 arrays
//            while (i <= j) {
//                while (array[i] < pivot) {
//                    i++;
//                }
//                while (array[j] > pivot) {
//                    j--;
//                }
//                if (i <= j) {
//                    exchangeNumbers(i, j);
//                    //move index to next position on both sides
//                    i++;
//                    j--;
//                }
//            }
//            // call quickSort() method recursively
//            if (lowerIndex < j) {
//                quickSort(lowerIndex, j);
//            }
//            if (i < higherIndex) {
//                quickSort(i, higherIndex);
//            }
//        }
//
//        private void exchangeNumbers(int i, int j) {
//            int temp = array[i];
//            array[i] = array[j];
//            array[j] = temp;
//        }
//
////        public class QuickSort 
//        
//        (String a[]){
//            
//            QuickSort sorter = new QuickSort();
//            sorter.sort(inventory);
//            for (int i : inventory) {
//                System.out.print(i);
//                System.out.print(" ");
//            }
//
//        }
//    }

   

//    private static Scene[] createScenes() {
//
//        Scene[] scenes = new Scene[SceneType.values().length];
//
//        Scene startingScene = new Scene();
//        startingScene.setDescription(
//                "Guradians, come in Guardians.  This is IronMan, we have urgent intel,"
//                + "Thanos has sent a broadcast across all the known universe.  He will "
//                + "wipe out half of the known universe to apease Death unless we can get "
//                + "to the Infinity Stones first.  I have every other superhero and Avenger "
//                + "out looking for them as we speak! "
//                + "We could really use your help on this one Starlord.");
//        
//       
//       // startingScene.setTravelTime(300);
//        scenes[SceneType.Earth.ordinal()] = startingScene;
//
//        Scene finishScene = new Scene();
//        finishScene.setDescription(
//                "Congratulations team!  All the Inifinity Stones have been found and collected. "
//                + "and we were able to defeat Thanos before something terrible happened! "
//                + "That's one for the record books!");
//        finishScene.setMapSymbol(" FN ");
//        finishScene.setBlocked(false);
//        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
//        scenes[SceneType.finish.ordinal()] = finishScene;
//
//        return scenes;
//    }

    

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
