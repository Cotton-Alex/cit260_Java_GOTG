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
import Model.Map;
import cit260_java_gotg.Location;
import javafx.scene.Scene;
import Model.SceneType;

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

//        Ship ship = new Ship();// create new ship
//        game.setShip(ship);// save ship in game

        Map map = MapControl.createMap();  //create and initialize new map
        game.setMap(map);  //save map in game

        // move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);//TODO:get sample code movePlayersToStartingLocation and movePlayer
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
        mindStone.setQuantityInStock(0);
        mindStone.setRequiredAmount(0);
        inventory[ItemType.mindStone.ordinal()] = mindStone;

        Item tesseract = new Item();
        tesseract.setItemType("Tesseract");
        tesseract.setQuantityInStock(0);
        tesseract.setRequiredAmount(0);
        inventory[ItemType.tesseract.ordinal()] = tesseract;

        Item aether = new Item();
        aether.setItemType("Aether");
        aether.setQuantityInStock(0);
        aether.setRequiredAmount(0);
        inventory[ItemType.aether.ordinal()] = aether;

        Item orb = new Item();
        orb.setItemType("Orb");
        orb.setQuantityInStock(0);
        orb.setRequiredAmount(0);
        inventory[ItemType.orb.ordinal()] = orb;

        Item soulStone = new Item();
        soulStone.setItemType("Soul Stone");
        soulStone.setQuantityInStock(0);
        soulStone.setRequiredAmount(0);
        inventory[ItemType.soulStone.ordinal()] = soulStone;

        Item timeStone = new Item();
        timeStone.setItemType("Time Stone");
        timeStone.setQuantityInStock(0);
        timeStone.setRequiredAmount(0);
        inventory[ItemType.timeStone.ordinal()] = timeStone;

        return inventory;
    }

    public class QuickSort {

        private Item[] inventory;

        private int array[];
        private int length;

        public void sort(int[] inputArr) {

            if (inputArr == null || inputArr.length == 0) {
                return;
            }
            this.array = inputArr;
            length = inputArr.length;
            quickSort(0, length - 1);
        }

        private void quickSort(int lowerIndex, int higherIndex) {

            int i = lowerIndex;
            int j = higherIndex;
            // calcualte pivot number, Pivot is middle index number
            int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
            // divide into 2 arrays
            while (i <= j) {
                while (array[i] < pivot) {
                    i++;
                }
                while (array[j] > pivot) {
                    j--;
                }
                if (i <= j) {
                    exchangeNumbers(i, j);
                    //move index to next position on both sides
                    i++;
                    j--;
                }
            }
            // call quickSort() method recursively
            if (lowerIndex < j) {
                quickSort(lowerIndex, j);
            }
            if (i < higherIndex) {
                quickSort(i, higherIndex);
            }
        }

        private void exchangeNumbers(int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        public class QuickSort 
        
        (String a[]

        
            ){
            
            QuickSort sorter = new QuickSort();
            sorter.sort(inventory);
            for (int i : inventory) {
                System.out.print(i);
                System.out.print(" ");
            }

        }
    }

   

    private static Scene[] createScenes() {

        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Guradians, come in Guardians.  This is IronMan, we have urgent intel,"
                + "Thanos has sent a broadcast across all the known universe.  He will "
                + "wipe out half of the known universe to apease Death unless we can get "
                + "to the Infinity Stones first.  I have every other superhero and Avenger "
                + "out looking for them as we speak! "
                + "We could really use your help on this one Starlord.");
        startingScene.setMapSymbol(" ST ");
       
        startingScene.setTravelTime(300);
        scenes[SceneType.start.ordinal()] = startingScene;

        Scene finishScene = new Scene();
        finishScene.setDescription(
                "Congratulations team!  All the Inifinity Stones have been found and collected. "
                + "and we were able to defeat Thanos before something terrible happened! "
                + "That's one for the record books!");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;

        return scenes;
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
