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

public class Fuel implements Serializable{
    
//classinstance variables
    public int fuelRemaining;
    
//constructer function
    
//    public fuelRemaining () {
//    }
        
        public int getFuelRemaining () {
            return fuelRemaining;
        }
        
        public void setFuelRemaining (int fuelRemaining) {
            this.fuelRemaining = fuelRemaining;
        }
}