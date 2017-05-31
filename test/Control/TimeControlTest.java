/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justin
 */
public class TimeControlTest {
    
    public TimeControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gettimeNeeded method, of class TimeControl.
     */
    @Test
    public void testGettimeNeeded() {
        System.out.println("gettimeNeeded");
        
        System.out.println("this is test 1");
        int quadrantCount = 5;
        int sectorCount = 3;
        TimeControl instance = new TimeControl();
        int expResult = 18;
        int result = instance.gettimeNeeded(quadrantCount, sectorCount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
        System.out.println("this is test 2");
         quadrantCount = -5;
         sectorCount = 0;
        
         expResult = -1;
         result = instance.gettimeNeeded(quadrantCount, sectorCount);
        assertEquals(expResult, result);
        
       
     System.out.println("this is test 3");
         quadrantCount = 0;
         sectorCount = -3;
        
         expResult = -2;
         result = instance.gettimeNeeded(quadrantCount, sectorCount);
        assertEquals(expResult, result);
    
         System.out.println("this is test 4");
         quadrantCount = -5;
         sectorCount = -3;
        
         expResult = -1;
         result = instance.gettimeNeeded(quadrantCount, sectorCount);
        assertEquals(expResult, result);
        
        
         System.out.println("this is test 5");
         quadrantCount = 5;
         sectorCount = 0;
        
         expResult = 15;
         result = instance.gettimeNeeded(quadrantCount, sectorCount);
        assertEquals(expResult, result);
        
         System.out.println("this is test 6");
         quadrantCount = 0;
         sectorCount = 3;
        
         expResult = 3;
         result = instance.gettimeNeeded(quadrantCount, sectorCount);
        assertEquals(expResult, result);
        
         System.out.println("this is test 7");
         quadrantCount = 5;
         sectorCount = 6;
        
         expResult = 21;
         result = instance.gettimeNeeded(quadrantCount, sectorCount);
        assertEquals(expResult, result);
    
    }
    
}
