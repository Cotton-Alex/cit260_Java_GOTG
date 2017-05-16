/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260_java_gotg;
import java.io.Serializable;

/**
 *
 * @author alexcotton
 */

public class Time implements Serializable{
    
//classinstance variables
    public int timeRemaining;
    
//constructer function
    
//    public timeRemaining () {
//    }
        
        public int getTimeRemaining () {
            return timeRemaining;
        }
        
        public void setTimeRemaining (int timeRemaining) {
            this.timeRemaining = timeRemaining;
        }
}