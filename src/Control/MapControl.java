/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Map;
import javafx.scene.Scene;

/**
 *
 * @author Mike Minassian
 */
public class MapControl {
    public static Map createMap() {
        //create the map
        Map map = null;
        
        System.out.println("\n*** createMap() called ***");
        
        return map;
    }
    
    private static Map createMap() {
        //create the map
        Map map = new Map(20, 20);

        //create the scenes for the game
        Scene[] scenes = createScenes();

        // assign scense to locations
        GameControl.assignScenesToLocations(map, scenes);

        return map;
    }
    
}
