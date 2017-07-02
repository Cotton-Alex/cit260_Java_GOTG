/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exceptions.MapControlExceptions;
import Model.Map;
import Model.Scene;
import Model.SceneType;


/**
 *
 * @author Mike Minassian
 */
public class MapControl {
//    public static Map createMap() {
//        //create the map
//        Map map = null;
//        
//        System.out.println("\n*** createMap() called ***");
//        
//        return map;
//    }

//  ********* Commented out above code - new code was created below ************
    public static Map createMap() {
        //create the map
        Map map = new Map(7, 4);

        //create the scenes for the game
        Scene[] scenes = createScenes();

        // assign scense to locations
        GameControl.assignScenesToLocations(map, scenes);

        return map;
    }

    public static void movePlayerToStartingLocation(Map map) {
        // If starting location is not supposed to be 0,0 then use the correct values here.
        try {
        movePlayer(map, 0, 0); // or instead of 0,0 you can select a different starting location
        }
        catch(MapControlExceptions mce){
            //we are not going to do anything here
        }
    }

    public static void movePlayer(Map map, int row, int column) 
                    throws MapControlExceptions{
        if(map == null){
            throw new MapControlExceptions("You dont have a map initialized.");
        }
        if(row < 0 || row >= map.getRowCount() || column < 0 || column >= map.getColumnCount()){
            throw new MapControlExceptions("You are trying to fly off the edge of the Galaxy.");
        }
        
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);
        map.setCurrentRow(row);
        map.setCurrentColumn(column);

    }

    //TODO add create sceens function
    public static Scene[] createScenes() {
        Scene[] scenes = new Scene[28];

        Scene newScene = new Scene();
        newScene.setName(SceneType.Earth.name());
        newScene.setDescription("Starlords home planet");
        newScene.setSector(true);
        newScene.setSymbol("SE");
        scenes[SceneType.Earth.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Starlords_Home.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("EH");
        scenes[SceneType.Starlords_Home.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Earth_Bar.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("EB");
        scenes[SceneType.Earth_Bar.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Avengers_HQ.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("EA");
        scenes[SceneType.Avengers_HQ.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Hala.name());
        newScene.setDescription("");
        newScene.setSector(true);
        newScene.setSymbol("SH");
        scenes[SceneType.Hala.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Hala_Bar.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("HB");
        scenes[SceneType.Hala_Bar.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Skrull_Palace.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("HP");
        scenes[SceneType.Skrull_Palace.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Skrull_House.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("HH");
        scenes[SceneType.Skrull_House.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Xandar.name());
        newScene.setDescription("");
        newScene.setSector(true);
        newScene.setSymbol("SX");
        scenes[SceneType.Xandar.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Nova_Prime.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("XN");
        scenes[SceneType.Nova_Prime.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Nova_Command.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("XC");
        scenes[SceneType.Nova_Command.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Mechanic.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("XM");
        scenes[SceneType.Mechanic.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.TheKyln.name());
        newScene.setDescription("");
        newScene.setSector(true);
        newScene.setSymbol("SK");
        scenes[SceneType.TheKyln.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Boss_Quarters.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("KB");
        scenes[SceneType.Boss_Quarters.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Prison_Cell.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("KP");
        scenes[SceneType.Prison_Cell.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Stockpile.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("KS");
        scenes[SceneType.Stockpile.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Knowhere.name());
        newScene.setDescription("");
        newScene.setSector(true);
        newScene.setSymbol("SW");
        scenes[SceneType.Knowhere.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Command_Center.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("WC");
        scenes[SceneType.Command_Center.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Knowhere_Bar.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("WB");
        scenes[SceneType.Knowhere_Bar.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Mining_Bay.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("WM");
        scenes[SceneType.Mining_Bay.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.MoragIV.name());
        newScene.setDescription("");
        newScene.setSector(true);
        newScene.setSymbol("SM");
        scenes[SceneType.MoragIV.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Prison.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("MP");
        scenes[SceneType.Prison.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.The_Collectors_Shop.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("MS");
        scenes[SceneType.The_Collectors_Shop.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.The_Temple.name());
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("MT");
        scenes[SceneType.The_Temple.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Asgard.name());
        newScene.setDescription("");
        newScene.setSector(true);
        newScene.setSymbol("SA");
        scenes[SceneType.Asgard.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Hall_of_Relics.name());
        newScene.setDescription("The Relics of the Asgardians");
        newScene.setSector(false);
        newScene.setSymbol("AH");
        scenes[SceneType.Hall_of_Relics.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Throne_Room.name());
        newScene.setDescription("Loki is found here");
        newScene.setSector(false);
        newScene.setSymbol("AT");
        scenes[SceneType.Throne_Room.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Bifrost.name());
        newScene.setDescription("Interstellar Poral");
        newScene.setSector(false);
        newScene.setSymbol("AB");
        scenes[SceneType.Bifrost.ordinal()] = newScene;

        return scenes;
    }

}
