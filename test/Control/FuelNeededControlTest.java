/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Mike Minassian
 */
public class FuelNeededControlTest {
    
    
    
    public FuelNeededControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
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
        
        // Test case 1
        
        System.out.println("\tTest case #1");
        
        //input values for test case 1
        int quadrantCount = 5;
        int sectorCount = 6;
        
        int expResult = 31; //expcected output
        
        
        //create instance of FuelNeededControl
        FuelNeededControl instance = new FuelNeededControl();
        
        //call function to run test
        int result = instance.getFuelNeeded(quadrantCount, sectorCount);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        //Test case #2
        
        System.out.println("\tTest case #2");
        
        //input vales for test case 2
        
        quadrantCount = -1;
        sectorCount = 0;
        
        expResult = -1; //expected output of returned value
        
        //call function to run test
        result = instance.getFuelNeeded(quadrantCount, sectorCount);
        
        //compare expected return value with the actual value returned
        assertEquals(expResult, result);
        
        
        
//Test case #3
        
        System.out.println("\tTest case #3");
        
        //input vales for test case 3
        
        quadrantCount = 0;
        sectorCount = -1;
        
        expResult = -2; //expected output of returned value
        
        //call function to run test
        result = instance.getFuelNeeded(quadrantCount, sectorCount);
        
        //compare expected return value with the actual value returned
        assertEquals(expResult, result);
        
         

//Test case #4
        
        System.out.println("\tTest case #4");
        
        //input vales for test case 4
        
        quadrantCount = -1;
        sectorCount = -1;
        
        expResult = -1; //expected output of returned value
        
        //call function to run test
        result = instance.getFuelNeeded(quadrantCount, sectorCount);
        
        //compare expected return value with the actual value returned
        assertEquals(expResult, result);
        
        
        
        
         //Test case #5
        
        System.out.println("\tTest case #5");
        
        //input vales for test case 5
        
        quadrantCount = 5;
        sectorCount = 0;
        
        expResult = 25; //expected output of returned value
        
        //call function to run test
        result = instance.getFuelNeeded(quadrantCount, sectorCount);
        
        //compare expected return value with the actual value returned
        assertEquals(expResult, result);
        
        
        
         //Test case #6
        
        System.out.println("\tTest case #6");
        
        //input vales for test case 6
        
        quadrantCount = 0;
        sectorCount = 6;
        
        expResult = 6; //expected output of returned value
        
        //call function to run test
        result = instance.getFuelNeeded(quadrantCount, sectorCount);
        
        //compare expected return value with the actual value returned
        assertEquals(expResult, result);
        
        
        
        
         //Test case #7
        
        System.out.println("\tTest case #7");
        
        //input vales for test case 7
        
        quadrantCount = 5;
        sectorCount = 6;
        
        expResult = 31; //expected output of returned value
        
        //call function to run test
        result = instance.getFuelNeeded(quadrantCount, sectorCount);
        
        //compare expected return value with the actual value returned
        assertEquals(expResult, result);
    }
    
}
