/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

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

    static void moveActorsToStartingLocation(Map map) {
        System.out.println("\n*** moveActorsToStartingLocation() called ***");
    }
    //TODO add create sceens function
    public static Scene[] createScenes() {
    Scene[] scenes= new Scene[28];
    
    Scene newScene = new Scene();
    newScene.setName(SceneType.Earth.name());
    newScene.setDescription("Starlords home planet");
    newScene.setSector(true);
    newScene.setSymbol("SE");
    scenes[SceneType.Earth.ordinal()] = newScene;
    
    newScene = new Scene();
    newScene.setName(SceneType.Home.name());
    newScene.setDescription("");
    newScene.setSector(true);
    newScene.setSymbol("EH");
    scenes[SceneType.Home.ordinal()] = newScene;
    
 
    
    
    return scenes;
    }

}
