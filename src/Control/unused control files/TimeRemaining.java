/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.Serializable;

/**
 *
 * @author alexcotton
 */
public class TimeRemaining implements Serializable {
    
    public int totalTime = 100;
    public int timeElapsed;
    public int timeRemaining = (totalTime - timeElapsed);
    

//    public Time() {
//        this.totalTime = 100;
//    }

    public int getTimeElapsed() {
        return timeElapsed;
    }
    
    public void setTimeElapsed(int timeElapsed) {
        this.timeElapsed += timeElapsed;
    }
    
    public int getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.timeRemaining;
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
        final TimeRemaining other = (TimeRemaining) obj;
        if (this.timeRemaining != other.timeRemaining) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TimeRemaining{" + "timeRemaining=" + timeRemaining + '}';
    }

}
