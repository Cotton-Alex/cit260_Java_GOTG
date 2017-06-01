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
    
    public class FuelCostSpeedControl {
        
        double fuelCostSpeed;

    public double fuelCostSpeed(double fuelRemaining, double currentLocation, double nextLocation, double speed, double fuelMpg) {

        if (fuelRemaining > 100) // fuel tank can only hold 100 units of fuel
            return -1;
        else if (fuelRemaining <= 0)
            return -2;
        else if (currentLocation == nextLocation)
            return -3;
        else if (currentLocation < 0 || nextLocation < 0 || currentLocation > 7 || nextLocation > 7) // location labels 1-7
            return -4;
        else if (speed < 1 || speed > 3) // speed adjustments are 1-3
            return -5;
        else
            fuelCostSpeed = (Math.abs(currentLocation - nextLocation) / fuelMpg * speed);
        
        if (fuelRemaining < fuelCostSpeed)
            return -6;
        else
            return fuelCostSpeed;
        }
    }
