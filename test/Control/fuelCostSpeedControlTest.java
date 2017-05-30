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
    
    public fuelCostSpeedControlTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of fuelCostSpeed method, of class fuelCostSpeedControl.
     */
    @Test
    public void testFuelCostSpeed() {
        System.out.println("fuelCostSpeed");
        
        // Test case 1
        System.out.println("\tTest case #1");
        //input for test case 1
        double fuelRemaining = 50;
        double currentLocation = 3;
        double nextLocation = 6;
        double speed = 2;
        double fuelMpg = 1;
        fuelCostSpeedControl instance = new fuelCostSpeedControl();
        double expResult = -6;
        double result = instance.fuelCostSpeed(fuelRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);
        
        // Test case 2
        System.out.println("\tTest case #2");
        //input for test case 2
        fuelRemaining = 50;
        currentLocation = 0;
        nextLocation = 6;
        speed = 0;
        fuelMpg = 1;
        expResult = -6;
        result = instance.fuelCostSpeed(fuelRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);
        
        // Test case 3
        System.out.println("\tTest case #3");
        //input for test case 3
        double fuelRemaining = 50;
        double currentLocation = 0;
        double nextLocation = 6;
        double speed = 0;
        double fuelMpg = 1;
        fuelCostSpeedControl instance = new fuelCostSpeedControl();
        double expResult = -6;
        double result = instance.fuelCostSpeed(fuelRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);
        
        // Test case 4
        System.out.println("\tTest case #4");
        //input for test case 4
        double fuelRemaining = 50;
        double currentLocation = 0;
        double nextLocation = 6;
        double speed = 0;
        double fuelMpg = 1;
        fuelCostSpeedControl instance = new fuelCostSpeedControl();
        double expResult = -6;
        double result = instance.fuelCostSpeed(fuelRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);
        
        // Test case 5
        System.out.println("\tTest case #5");
        //input for test case 5
        double fuelRemaining = 50;
        double currentLocation = 0;
        double nextLocation = 6;
        double speed = 0;
        double fuelMpg = 1;
        fuelCostSpeedControl instance = new fuelCostSpeedControl();
        double expResult = -6;
        double result = instance.fuelCostSpeed(fuelRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);
        
        // Test case 6
        System.out.println("\tTest case #6");
        //input for test case 6
        double fuelRemaining = 50;
        double currentLocation = 0;
        double nextLocation = 6;
        double speed = 0;
        double fuelMpg = 1;
        fuelCostSpeedControl instance = new fuelCostSpeedControl();
        double expResult = -6;
        double result = instance.fuelCostSpeed(fuelRemaining, currentLocation, nextLocation, speed, fuelMpg);
        assertEquals(expResult, result, 0.0);
        
    }
}