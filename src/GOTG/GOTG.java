/*

 */
package GOTG;

import Model.Player;
import Model.Game;
import Model.Question;
import Model.QuestionSceneType;
import Model.Map;
import View.StartProgramView;
import cit260_java_gotg.Fuel;
import cit260_java_gotg.Location;
import cit260_java_gotg.Time;

/**
 *
 * @author alexcotton
 */
public class GOTG {
    
    /**
     * @param args the command line arguments
     */
    
    
//********************************************************************************************************************
//     01 MAIN - the start
//********************************************************************************************************************
    
    public static void main(String[] args) {
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.displayStartProgramView();
    }

//    public static void setPlayer(Player player) {
//        System.out.println("\nsetPlayer() function called");
//          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    public static void teamClassTest() {
        Player playerOne = new Player();
        
        playerOne.setName();
        
        Game gameOne = new Game();
        
        gameOne.setNoPeople(2);
        gameOne.setTotalTime(4);
        
        Map mapOne = new Map();
        
        mapOne.setDescription("test");
        mapOne.setColumnCount(1);
        mapOne.setCurrentColumn(1);
        mapOne.setRowCount(1);
        mapOne.setCurrentRow(1);
        
        Question questionOne = new Question();
        
        questionOne.setAttribute(1);
        questionOne.setAttribute1(1);
        
        QuestionSceneType sceneOne = new QuestionSceneType();
        
        sceneOne.setNoToAnswer(1);
        sceneOne.setBonus(1);
        
        Location locationOne = new Location();
        
        locationOne.setRow(1);
        locationOne.setColumn(1);
        locationOne.setVisited(1);
        locationOne.setAmountRemaining(1);
        
        Time timeOne = new Time();
        
        timeOne.setTimeRemaining(1);
        
        Fuel fuelOne = new Fuel();
        
        fuelOne.setFuelRemaining(1);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        String questionInfo = questionOne.toString();
        System.out.println(questionInfo);
        
        String sceneOneInfo = sceneOne.toString();
        System.out.println(sceneOneInfo);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        String timeInfo = timeOne.toString();
        System.out.println(timeInfo);
        
        String fuelInfo = fuelOne.toString();
        System.out.println(fuelInfo);
        
    }
    public static void alexcottonClassTest(){
       
    }
    public static void MinassianClassTest(){
    
    }
    public static void wilkeyClassTest(){
          
    }
    public static void thielClassTest(){
        
    }
    private static Game currentGame = null;
    private static Player player = null;
  
    
    public static Game getCurrentGame(Game currentGame) {
        return currentGame;
    }
    public static void setCurrentGame(Game currentGame) {
        GOTG.currentGame= currentGame;
    }   
    public static Player getPlayer() {
        return player;
    }      

    public static void setPlayer(Player player) {
        GOTG.player = player;
    }

    private static class player {

        public player() {
        }
    }
}

