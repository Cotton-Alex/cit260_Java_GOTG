
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package Control;

import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author alexcotton
 */
public class timeCostSpeedControlTest {
    public timeCostSpeedControlTest() {}

    @AfterClass
    public static void tearDownClass() {}

    /**
     * Test of timeCostSpeed method, of class timeCostSpeedControl.
     */
    @Test
    public void testTimeCostSpeed() {
        System.out.println("timeCostSpeed");

        // Test case 1
        System.out.println("\tTest case #1");
        double timeRemaining = 5;
        double currentLocation = 3;
        double nextLocation = 6;
        double speed = 2;
        double fuelMpg = 0.0;
        timeCostSpeedControl instance = new timeCostSpeedControl();
        double expResult = 1.5;
        double result = instance.timeCostSpeed(timeRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);
        
        // Test case 2
        System.out.println("\tTest case #2");
        timeRemaining = 0;
        currentLocation = 0;
        nextLocation = 6;
        speed = 0;
        fuelMpg = 0.0;
        expResult = -1;
        result = instance.timeCostSpeed(timeRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);
        
        // Test case 3
        System.out.println("\tTest case #3");
        timeRemaining = 241;
        currentLocation = 9;
        nextLocation = 6;
        speed = 4;
        fuelMpg = 11;
        expResult = -2;
        result = instance.timeCostSpeed(timeRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);
        
        // Test case 4
        System.out.println("\tTest case #4");
        timeRemaining = -5;
        currentLocation = 5;
        nextLocation = -3;
        speed = -2;
        fuelMpg = 1;
        expResult = -1;
        result = instance.timeCostSpeed(timeRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);
        
        // Test case 5
        System.out.println("\tTest case #5");
        timeRemaining = 45;
        currentLocation = 1;
        nextLocation = 7;
        speed = 1;
        fuelMpg = 1;
        expResult = 6;
        result = instance.timeCostSpeed(timeRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);
        
        // Test case 6
        System.out.println("\tTest case #6");
        timeRemaining = 240;
        currentLocation = 7;
        nextLocation = 1;
        speed = 3;
        fuelMpg = 1;
        expResult = 2;
        result = instance.timeCostSpeed(timeRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);
        
        // Test case 7
        System.out.println("\tTest case #7");
        timeRemaining = 240;
        currentLocation = 7;
        nextLocation = 7;
        speed = 3;
        fuelMpg = 1;
        expResult = -3;
        result = instance.timeCostSpeed(timeRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);
    }
}
