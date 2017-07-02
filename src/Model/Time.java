/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Justin
 */
public class Time {
    
    public int timeRemaining;

    public int getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public Time() {
        
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
        final Time other = (Time) obj;
        if (this.timeRemaining != other.timeRemaining) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Time{" + "timeRemaining=" + timeRemaining + '}';
    }
    
    
    
    
}
