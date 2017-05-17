/*

 */
package cit260_java_gotg;

import Model.Game;
import Model.Question;
import Model.QuestionSceneType;
import Model.Map;

/**
 *
 * @author alexcotton
 */
public class Cit260_Java_GOTG {
    
    public static void teamClassTest() {
        Player playerOne = new Player();
        
        playerOne.setName("Groot");
        
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
    public static void cottonClassTest(){
       
    }
    public static void minassianClassTest(){
    
    }
    public static void wilkeyClassTest(){
          
    }
    public static void thielClassTest(){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        teamClassTest();
        cottonClassTest();
        minassianClassTest();
        wilkeyClassTest();
        thielClassTest();
    }
}
