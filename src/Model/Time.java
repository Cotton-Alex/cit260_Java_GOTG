/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Justin
 */
public class Time implements Serializable {

    public static int getTimeElapsed;
    public static int setTimeElapsed;

    
    /**
     *
     */
    public static int totalTime;
    public static int timeElapsed;
    public static int timeRemaining = (totalTime - timeElapsed);
    
    public int getTimeElapsed() {
        return timeElapsed;
    }
    
    public void setTimeElapsed(int timeElapsed) {
        Time.timeElapsed = timeElapsed;
    }
    
    /**
     *
     * @return
     */
    public static int getTimeRemaining() {
        return timeRemaining;
    }

    /**
     *
     * @param timeRemaining
     */
    public void setTimeRemaining(int timeRemaining) {
        Time.timeRemaining = timeRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Time.timeRemaining;
        hash = 41 * hash + Time.timeElapsed;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Time other = (Time) obj;
        return Time.timeRemaining == Time.timeRemaining;
    }

    @Override
    public String toString() {
        return "Time{" + "timeRemaining=" + timeRemaining + '}';
    }
    
    
    
    
}
