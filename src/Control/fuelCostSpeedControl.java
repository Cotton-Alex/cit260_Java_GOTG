    /*
    * To change this license header, choose License Headers in Project Properties.
    * To change this template file, choose Tools | Templates
    * and open the template in the editor.
    */
    package Control;

    /**
    *
    * @author alexcotton
    */
    
    public class fuelCostSpeedControl {
        
        double fuelCostSpeed;

    public double fuelCostSpeed(double fuelRemaining, double currentLocation, double nextLocation, double speed, double fuelMpg) {

        if (fuelRemaining < 0) // Fuel has run out
            return -2;
        else if (currentLocation == nextLocation) // Choose a different location
            return -3;
        else if (currentLocation < 0 || nextLocation < 0 || currentLocation > 7 || nextLocation > 7) // Invalid location
            return -4;
        else if (speed < 1 || speed >3) // Invalid speed
            return -5;
        else
            fuelCostSpeed = (Math.abs(currentLocation - nextLocation) / fuelMpg * speed);
        
        if (fuelRemaining > fuelCostSpeed) // Not enough fuel to make the trip
            return -6;
        else
            return fuelCostSpeed;
        }
    }
