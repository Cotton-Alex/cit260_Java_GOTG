/*
 *Infinity Stones class
 */
package cit260_java_gotg;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Mike Minassian
 */
public class infinityStones implements Serializable {
    //class instance variables
    private int stonesCollected;

    public infinityStones() {
    }
    
    public int getStonesCollected() {
        return stonesCollected;
    }

    public void setStonesCollected(int stonesCollected) {
        this.stonesCollected = stonesCollected;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.stonesCollected;
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
        final infinityStones other = (infinityStones) obj;
        if (this.stonesCollected != other.stonesCollected) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infinityStones{" + "stonesCollected=" + stonesCollected + '}';
    }    
}
