/*

 */
package GOTG;

import Model.Player;
import Model.Game;
import View.StartProgramView;

/**
 *
 * @author alexcotton
 */
public class GOTG {
    
    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    
    private static Player player = null;
    
//********************************************************************************************************************
//     01 MAIN - the start
//********************************************************************************************************************
    
    public static void main(String[] args) {
       StartProgramView startProgramView = new StartProgramView();
       try {
       startProgramView.displayStartProgramView();
       } catch (Throwable te) {
           System.out.println(te.getMessage());
           te.printStackTrace();
           startProgramView.displayStartProgramView();
       }
       
    }

    public static Game getCurrentGame() {
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

