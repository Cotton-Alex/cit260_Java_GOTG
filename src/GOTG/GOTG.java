/*

 */
package GOTG;

import Model.Player;
import Model.Game;
import View.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

//********************************************************************************************************************
//     01 MAIN - the start
//********************************************************************************************************************
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        try {
            GOTG.inFile = new BufferedReader(new InputStreamReader(System.in));
            GOTG.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath= "log.txt";
            GOTG.logFile = new PrintWriter(filePath);

            //StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
            return;
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
        }
        
        finally{
            try {
                if (GOTG.inFile != null)
                    GOTG.inFile.close();
                
                if (GOTG.outFile != null)
                    GOTG.outFile.close();
                
                if (GOTG.logFile != null)
                    GOTG.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
        }
        startProgramView.displayStartProgramView();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        GOTG.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        GOTG.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        GOTG.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        GOTG.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        GOTG.logFile = logFile;
    }

    
    private static class player {

        public player() {
        }
    }
}
