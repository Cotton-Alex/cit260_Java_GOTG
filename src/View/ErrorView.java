/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import GOTG.GOTG;
import java.io.PrintWriter;

/**
 *
 * @author Mike Minassian
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = GOTG.getOutFile();
    private static final PrintWriter logFile = GOTG.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                        "----------------------------------------------"
                        +"\n- ERROR - " + errorMessage
                        +"\n-------------------------------------------");
        // log error
        logFile.println(className + " - "+ errorMessage);
    }
}
