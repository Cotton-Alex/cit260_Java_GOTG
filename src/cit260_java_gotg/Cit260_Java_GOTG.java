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
       
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    public static void cottonClassTest(){
        
    }
    public static void minassianClassTest(){
    
    }
    public static void wilkeyClassTest(){
        
        
                Stature stature = new Stature();
                
                stature.setName("Twenty");
                String playerStature = stature.toString();
                System.out.println(stature);
        
        
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