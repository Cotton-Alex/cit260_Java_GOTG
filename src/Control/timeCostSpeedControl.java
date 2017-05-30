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
    
    public class timeCostSpeedControl {
        
        double timeCostSpeed;

    public double timeCostSpeed(double timeRemaining, double currentLocation, double nextLocation, double speed, double fuelMpg) {

        if (timeRemaining <= 0)
            return -1;
        else if (timeRemaining > 240)
            return -2;
        else if (currentLocation == nextLocation)
            return -3;
        else if (currentLocation < 0 || nextLocation < 0 || currentLocation > 7 || nextLocation > 7) // location labels 1-7
            return -4;
        else if (speed < 1 || speed > 3) // speed adjustments are 1-3
            return -5;
        else
            timeCostSpeed = (Math.abs(currentLocation - nextLocation) / speed);
        
        if (timeRemaining < timeCostSpeed)
            return -6;
        else
            return timeCostSpeed;
        }
    }
