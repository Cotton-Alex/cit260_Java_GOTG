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
public class Fuel {
    
    private int fuelRemaining;

    public Fuel() {
       
    }

    public int getFuelRemaining() {
        return fuelRemaining;
    }

    public void setFuelRemaining(int fuelRemaining) {
        this.fuelRemaining = fuelRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.fuelRemaining;
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
        final Fuel other = (Fuel) obj;
        if (this.fuelRemaining != other.fuelRemaining) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fuel{" + "fuelRemaning=" + fuelRemaining + '}';
    }
    
    
    
    
}
