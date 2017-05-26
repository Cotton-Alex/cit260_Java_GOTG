/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mike Minassian
 */
public class FuelNeededControlTest {
    
    public FuelNeededControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFuelNeeded method, of class FuelNeededControl.
     */
    @Test
    public void testGetFuelNeeded() {
        System.out.println("getFuelNeeded");
        int quadrantCount = 0;
        int sectorCount = 0;
        FuelNeededControl instance = new FuelNeededControl();
        int expResult = 0;
        int result = instance.getFuelNeeded(quadrantCount, sectorCount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
