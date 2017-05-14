/*

 */
package cit260_java_gotg;

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
