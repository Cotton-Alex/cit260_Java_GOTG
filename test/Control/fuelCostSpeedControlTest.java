
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
public class fuelCostSpeedControlTest {
    public fuelCostSpeedControlTest() {}

    @AfterClass
    public static void tearDownClass() {}

    /**
     * Test of fuelCostSpeed method, of class FuelCostSpeedControl.
     */
    @Test
    public void testFuelCostSpeed() {
        System.out.println("fuelCostSpeed");

        // Test case 1
        System.out.println("\tTest case #1");

        // input for test case 1
        double               fuelRemaining   = 50;
        double               currentLocation = 3;
        double               nextLocation    = 6;
        double               speed           = 2;
        double               fuelMpg         = 1;
        FuelCostSpeedControl instance        = new FuelCostSpeedControl();
        double               expResult       = 6;
        double               result          = instance.fuelCostSpeed(fuelRemaining,
                                                                      currentLocation,
                                                                      nextLocation,
                                                                      speed,
                                                                      fuelMpg);

        assertEquals(expResult, result, 0.0);

        // Test case 2
        System.out.println("\tTest case #2");

        // input for test case 2
        fuelRemaining   = 50;
        currentLocation = 0;
        nextLocation    = 6;
        speed           = 0;
        fuelMpg         = 1;
        expResult       = -5;
        result          = instance.fuelCostSpeed(fuelRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);

        // Test case 3
        System.out.println("\tTest case #3");

        // input for test case 3
        fuelRemaining   = 0;
        currentLocation = 9;
        nextLocation    = 6;
        speed           = 4;
        fuelMpg         = 1;
        expResult       = -2;
        result          = instance.fuelCostSpeed(fuelRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);

        // Test case 4
        System.out.println("\tTest case #4");

        // input for test case 4
        fuelRemaining   = -50;
        currentLocation = 5;
        nextLocation    = -3;
        speed           = -2;
        fuelMpg         = 1;
        expResult       = -2;
        result          = instance.fuelCostSpeed(fuelRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);

        // Test case 5
        System.out.println("\tTest case #5");

        // input for test case 5
        fuelRemaining   = 101;
        currentLocation = 1;
        nextLocation    = 7;
        speed           = 1;
        fuelMpg         = 1;
        expResult       = -1;
        result          = instance.fuelCostSpeed(fuelRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);

        // Test case 6
        System.out.println("\tTest case #6");

        // input for test case 6
        fuelRemaining   = 50;
        currentLocation = 7;
        nextLocation    = 1;
        speed           = 4;
        fuelMpg         = 1;
        expResult       = -5;
        result          = instance.fuelCostSpeed(fuelRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);

        // Test case 7
        System.out.println("\tTest case #7");

        // input for test case 7
        fuelRemaining   = 100;
        currentLocation = 7;
        nextLocation    = 7;
        speed           = 3;
        fuelMpg         = 1;
        expResult       = -3;
        result          = instance.fuelCostSpeed(fuelRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);
    }
}