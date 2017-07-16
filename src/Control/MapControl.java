/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exceptions.MapControlExceptions;
import GOTG.GOTG;
import Model.Game;
import Model.Item;
import Model.ItemType;
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
            movePlayer(map, 0, 0); // TODO: maybe instead of 0,0 you can select a different starting location
        } catch (MapControlExceptions mce) {
            //we are not going to do anything here
        }
    }

    public static void movePlayer(Map map, int row, int column)
            throws MapControlExceptions {
        if (map == null) {
            throw new MapControlExceptions("You dont have a map initialized.");
        }
        if (row < 0 || row >= map.getRowCount() || column < 0 || column >= map.getColumnCount()) {
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
        newScene.setLocationsList("\nSE: Earth Dock\n EH: Starlord's Home\n EB: Bar\n EA: Avenger's HQ");
        newScene.setDescription("Starlords home planet");
        newScene.setSector(true);
        newScene.setSymbol("SE");
        newScene.setLocationNumber(0);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Earth.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Starlords_Home.name());
        newScene.setLocationsList("\nSE: Earth Dock\n EH: Starlord's Home\n EB: Bar\n EA: Avenger's HQ");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("EH");
        newScene.setLocationNumber(1);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Starlords_Home.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Earth_Bar.name());
        newScene.setLocationsList("\nSE: Earth Dock\n EH: Starlord's Home\n EB: Bar\n EA: Avenger's HQ");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("EB");
        newScene.setLocationNumber(2);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Earth_Bar.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Avengers_HQ.name());
        newScene.setLocationsList("\nSE: Earth Dock\n EH: Starlord's Home\n EB: Bar\n EA: Avenger's HQ");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("EA");
        newScene.setLocationNumber(3);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Avengers_HQ.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Hala.name());
        newScene.setLocationsList("\nSH: Hala Dock\n HB: Bar\n HP: Skrull Palace\n HH: Skrull House");
        newScene.setDescription("");
        newScene.setSector(true);
        newScene.setSymbol("SH");
        newScene.setLocationNumber(4);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Hala.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Hala_Bar.name());
        newScene.setLocationsList("\nSH: Hala Dock\n HB: Bar\n HP: Skrull Palace\n HH: Skrull House");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("HB");
        newScene.setLocationNumber(5);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Hala_Bar.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Skrull_Palace.name());
        newScene.setLocationsList("\nSH: Hala Dock\n HB: Bar\n HP: Skrull Palace\n HH: Skrull House");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("HP");
        newScene.setLocationNumber(6);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Skrull_Palace.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Skrull_House.name());
        newScene.setLocationsList("\nSH: Hala Dock\n HB: Bar\n HP: Skrull Palace\n HH: Skrull House");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("HH");
        newScene.setLocationNumber(7);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Skrull_House.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Xandar.name());
        newScene.setLocationsList("\nSX: Xandar Dock\n XN: Nova Prime\n XC: Nova Command\n XM: Mechanic");
        newScene.setDescription("");
        newScene.setSector(true);
        newScene.setSymbol("SX");
        newScene.setLocationNumber(8);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Xandar.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Nova_Prime.name());
        newScene.setLocationsList("\nSX: Xandar Dock\n XN: Nova Prime\n XC: Nova Command\n XM: Mechanic");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("XN");
        newScene.setLocationNumber(9);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Nova_Prime.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Nova_Command.name());
        newScene.setLocationsList("\nSX: Xandar Dock\n XN: Nova Prime\n XC: Nova Command\n XM: Mechanic");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("XC");
        newScene.setLocationNumber(10);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Nova_Command.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Mechanic.name());
        newScene.setLocationsList("\nSX: Xandar Dock\n XN: Nova Prime\n XC: Nova Command\n XM: Mechanic");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("XM");
        newScene.setLocationNumber(11);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Mechanic.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.TheKyln.name());
        newScene.setLocationsList("\nSX: The Kyln Dock\n KB: Boss Quarters\n KP: Prison Cell\n KS: Stockpile");
        newScene.setDescription("");
        newScene.setSector(true);
        newScene.setSymbol("SK");
        newScene.setLocationNumber(12);
        newScene.setSceneCompleted(0);
        scenes[SceneType.TheKyln.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Boss_Quarters.name());
        newScene.setLocationsList("\nSX: The Kyln Dock\n KB: Boss Quarters\n KP: Prison Cell\n KS: Stockpile");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("KB");
        newScene.setLocationNumber(13);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Boss_Quarters.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Prison_Cell.name());
        newScene.setLocationsList("\nSX: The Kyln Dock\n KB: Boss Quarters\n KP: Prison Cell\n KS: Stockpile");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("KP");
        newScene.setLocationNumber(14);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Prison_Cell.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Stockpile.name());
        newScene.setLocationsList("\nSX: The Kyln Dock\n KB: Boss Quarters\n KP: Prison Cell\n KS: Stockpile");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("KS");
        newScene.setLocationNumber(15);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Stockpile.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Knowhere.name());
        newScene.setLocationsList("\nSW: Knowhere Dock\n WC: Command Center\n WB: Bar\n WM: Mining Bay");
        newScene.setDescription("");
        newScene.setSector(true);
        newScene.setSymbol("SW");
        newScene.setLocationNumber(16);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Knowhere.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Command_Center.name());
        newScene.setLocationsList("\nSW: Knowhere Dock\n WC: Command Center\n WB: Bar\n WM: Mining Bay");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("WC");
        newScene.setLocationNumber(17);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Command_Center.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Knowhere_Bar.name());
        newScene.setLocationsList("\nSW: Knowhere Dock\n WC: Command Center\n WB: Bar\n WM: Mining Bay");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("WB");
        newScene.setLocationNumber(18);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Knowhere_Bar.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Mining_Bay.name());
        newScene.setLocationsList("\nSW: Knowhere Dock\n WC: Command Center\n WB: Bar\n WM: Mining Bay");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("WM");
        newScene.setLocationNumber(19);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Mining_Bay.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.MoragIV.name());
        newScene.setLocationsList("\nSM: Morag IV Dock\n MP: Prison\n MS: The Collector's Shop\n MT: The Temple");
        newScene.setDescription("");
        newScene.setSector(true);
        newScene.setSymbol("SM");
        newScene.setLocationNumber(20);
        newScene.setSceneCompleted(0);
        scenes[SceneType.MoragIV.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Prison.name());
        newScene.setLocationsList("\nSM: Morag IV Dock\n MP: Prison\n MS: The Collector's Shop\n MT: The Temple");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("MP");
        newScene.setLocationNumber(21);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Prison.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.The_Collectors_Shop.name());
        newScene.setLocationsList("\nSM: Morag IV Dock\n MP: Prison\n MS: The Collector's Shop\n MT: The Temple");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("MS");
        newScene.setLocationNumber(22);
        newScene.setSceneCompleted(0);
        scenes[SceneType.The_Collectors_Shop.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.The_Temple.name());
        newScene.setLocationsList("\nSM: Morag IV Dock\n MP: Prison\n MS: The Collector's Shop\n MT: The Temple");
        newScene.setDescription("");
        newScene.setSector(false);
        newScene.setSymbol("MT");
        newScene.setLocationNumber(23);
        newScene.setSceneCompleted(0);
        scenes[SceneType.The_Temple.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Asgard.name());
        newScene.setLocationsList("\nSA: Asgard Dock\n AH: Hall of Relics\n AT: Throne Room\n AB: Interstellar Portal");
        newScene.setDescription("");
        newScene.setSector(true);
        newScene.setSymbol("SA");
        newScene.setLocationNumber(24);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Asgard.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Hall_of_Relics.name());
        newScene.setLocationsList("\nSA: Asgard Dock\n AH: Hall of Relics\n AT: Throne Room\n AB: Interstellar Portal");
        newScene.setDescription("The Relics of the Asgardians");
        newScene.setSector(false);
        newScene.setSymbol("AH");
        newScene.setLocationNumber(25);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Hall_of_Relics.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Throne_Room.name());
        newScene.setLocationsList("\nSA: Asgard Dock\n AH: Hall of Relics\n AT: Throne Room\n AB: Interstellar Portal");
        newScene.setDescription("Loki is found here");
        newScene.setSector(false);
        newScene.setSymbol("AT");
        newScene.setLocationNumber(26);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Throne_Room.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName(SceneType.Bifrost.name());
        newScene.setLocationsList("\nSA: Asgard Dock\n AH: Hall of Relics\n AT: Throne Room\n AB: Interstellar Portal");
        newScene.setDescription("Interstellar Poral");
        newScene.setSector(false);
        newScene.setSymbol("AB");
        newScene.setLocationNumber(27);
        newScene.setSceneCompleted(0);
        scenes[SceneType.Bifrost.ordinal()] = newScene;

        return scenes;
    }
}
//public void SceneChoice(int sceneNumber){
//    
//    switch (sceneNumber){
//        case (0) : 
//            this.EarthScene();
//            break;
//        case (1) : 
//            this.StarLordsHome();
//            break;
//        case (2) :
//            this.EarthBar();
//            break;
//        case (3): 
//            this.EarthAvengersHQ();
//            break;
//        case (4):
//            this.HalaScene();
//            break;
//        case (5) : 
//            this.HalaBar();
//            break;
//        case (6) :
//            this.SkrullPalace();
//            break;
//        case (7):
//            this.SkrullHouse();
//            break;
//        case(8):
//            this.XandarScene();
//            break;
//        case (9):
//            this.NovaPrime();
//            break;
//        case (10):
//            this.NovaCommand();
//            break;
//        case (11) :
//            this.Mechanic();
//            break;
//        case (12):
//            this.TheKyln();
//            break;
//        case (13) :
//            this.BossQuarters();
//            break;
//        case (14) :
//            this.PrisonCell();
//            break;
//        case (15) :
//            this.Stockpile();
//            break;
//        case (16) :
//            this.KnowhwereScene();
//            break;
//        case (17) :
//            this.CommandCenter();
//            break;
//        case (18):
//            this.KnowhereBar();
//            break;
//        case (19) :
//            this.MiningBay();
//            break;
//        case (20):
//            this.MorageIVScene();
//            break;
//        case (21) :
//            this.Prison();
//            break;
//        case (22) :
//            this.CollectorsShop();
//            break;
//        case (23) :
//            this.Temple();
//            break;
//        case (24) :
//            this.AsgardScene();
//            break;
//        case (25) :
//            this.HallOfrelics();
//            break;
//        case (26) :
//            this.ThroneRoom();
//            break;
//        case (27) :
//            this.Bifrost();
//            break;
//               
//                  
//    }
//}
//
//    private void EarthScene() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void StarLordsHome() {
//        Game game = GOTG.getCurrentGame();
//        Scene[] scenes = game.getScenes();
//        if(scenes[SceneType.Starlords_Home.ordinal()].getSceneCompleted() == 0){
//        this.console.println("/n this is starlords home, or at least it was.");
//        this.console.println("/n as you look around you find his old walkman"
//                + "/n you feel its a good idea to take it along with you"
//                + "/n"
//                + "/n the Walkman has been added to your inventory");
//        
//        scenes[SceneType.Starlords_Home.ordinal()].setSceneCompleted(1);
//        
//        }
//        else if(scenes[SceneType.Starlords_Home.ordinal()].getSceneCompleted() == 1)
//        this.console.println("/n There is nothing else you can find here");
//                
//        
//    }
//
//    private void EarthBar() {
//        system.out.printLn()
//    }
//
//    private void EarthAvengersHQ() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void HalaScene() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void HalaBar() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void SkrullPalace() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void SkrullHouse() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void XandarScene() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void NovaPrime() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void NovaCommand() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void Mechanic() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void TheKyln() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void BossQuarters() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void PrisonCell() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void Stockpile() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void KnowhwereScene() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void CommandCenter() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void KnowhereBar() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void MiningBay() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void MorageIVScene() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void Prison() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void CollectorsShop() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void Temple() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void AsgardScene() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void HallOfrelics() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void ThroneRoom() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void Bifrost() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//}
