/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import GOTG.GOTG;
import Model.Game;
import Model.Item;
import Model.ItemType;
import Model.Scene;
import Model.SceneType;

/**
 *
 * @author Mike Minassian
 */
public class LocationMenuView {
    public void SceneChoice(int sceneNumber){
    
    switch (sceneNumber){
        case (0) : 
            this.EarthScene();
            break;
        case (1) : 
            this.StarLordsHome();
            break;
        case (2) :
            this.EarthBar();
            break;
        case (3): 
            this.EarthAvengersHQ();
            break;
        case (4):
            this.HalaScene();
            break;
        case (5) : 
            this.HalaBar();
            break;
        case (6) :
            this.SkrullPalace();
            break;
        case (7):
            this.SkrullHouse();
            break;
        case(8):
            this.XandarScene();
            break;
        case (9):
            this.NovaPrime();
            break;
        case (10):
            this.NovaCommand();
            break;
        case (11) :
            this.Mechanic();
            break;
        case (12):
            this.TheKyln();
            break;
        case (13) :
            this.BossQuarters();
            break;
        case (14) :
            this.PrisonCell();
            break;
        case (15) :
            this.Stockpile();
            break;
        case (16) :
            this.KnowhwereScene();
            break;
        case (17) :
            this.CommandCenter();
            break;
        case (18):
            this.KnowhereBar();
            break;
        case (19) :
            this.MiningBay();
            break;
        case (20):
            this.MorageIVScene();
            break;
        case (21) :
            this.Prison();
            break;
        case (22) :
            this.CollectorsShop();
            break;
        case (23) :
            this.Temple();
            break;
        case (24) :
            this.AsgardScene();
            break;
        case (25) :
            this.HallOfrelics();
            break;
        case (26) :
            this.ThroneRoom();
            break;
        case (27) :
            this.Bifrost();
            break;
               
                  
    }
}

    private void EarthScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void StarLordsHome() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        if(scenes[SceneType.Starlords_Home.ordinal()].getSceneCompleted() == 0){
        this.console.println("/n this is starlords home, or at least it was.");
        this.console.println("/n as you look around you find his old walkman"
                + "/n you feel its a good idea to take it along with you"
                + "/n"
                + "/n the Walkman has been added to your inventory");
        
        scenes[SceneType.Starlords_Home.ordinal()].setSceneCompleted(1);
        
        }
        else if(scenes[SceneType.Starlords_Home.ordinal()].getSceneCompleted() == 1)
        this.console.println("/n There is nothing else you can find here");
                
        
    }

    private void EarthBar() {
        this.console.println("/n As you go around the bar, you talk to some people"
                            +"/n they tell you that Dr. Strange has the Eye if "
                + "/n Agamoto somewhere on Knowhere");
    }

    private void EarthAvengersHQ() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();
        if(scenes[SceneType.Avengers_HQ.ordinal()].getSceneCompleted() == 0){
        this.console.println("/n This is the Avengers HQ, you walk around and"
                           + "/n you walk around and find Vision.");
        
        this.console.println("/n "
                           + "/n Vision tells you that the six infinity stones are:"
                + "/n The Mind Stone"
                + "/n The Tesseract"
                + "/n The Aether"
                + "/n The Soul Stone"
                + "/n The Eye of Agamotto"
                + "/n And The Orb");
        
        this.console.println("/n Vision will give you the Mind Stone once you have"
                +            "/n collected the other stones.");
        
        scenes[SceneType.Avengers_HQ.ordinal()].setSceneCompleted(1);
        
        }
        else if (scenes[SceneType.Avengers_HQ.ordinal()].getSceneCompleted() == 1){
            if(items[ItemType.orb.ordinal()].getQuantityInStock() == 1 && items[ItemType.tesseract.ordinal()].getQuantityInStock() == 1 && items[ItemType.aether.ordinal()].getQuantityInStock() == 1 && items[ItemType.soulStone.ordinal()].getQuantityInStock() == 1 && items[ItemType.Eye_of_Agamotto.ordinal()].getQuantityInStock() == 1 ){
             this.console.println("/n Vision tells you that you have proven yourself worthy"
                     +            "/n by getting the other stones and give you the Mind Stone! ");
             
             this.console.println("/n the Mind Stone has been added to your inventory.");
             items[ItemType.mindStone.ordinal()].setQuantityInStock(1);
             scenes[SceneType.Avengers_HQ.ordinal()].setSceneCompleted(2);
            }
           else
           this.console.println("/n Vision tells you to come back after you get"
                   + "/n all the stones");     
        }
        else
            this.console.println("/n Vision tells you to end the threat of "
                    + "/n Thantos now you have all the stones");
    }

    private void HalaScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void HalaBar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void SkrullPalace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void SkrullHouse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void XandarScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void NovaPrime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void NovaCommand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Mechanic() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void TheKyln() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void BossQuarters() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void PrisonCell() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Stockpile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void KnowhwereScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void CommandCenter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void KnowhereBar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void MiningBay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void MorageIVScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Prison() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void CollectorsShop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Temple() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void AsgardScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void HallOfrelics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ThroneRoom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Bifrost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


