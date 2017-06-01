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
public class calcTimeRemainingTest {
    
    public calcTimeRemainingTest() {
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
     * Test of CalcTimeRemaining method, of class CalcTimeRemaining.
     */
    @Test
    public void testCalcTimeRemaining() {
        System.out.println("CalcTimeRemaining");
        
        System.out.println("this is test 1");
        
        int timeUsed = 5;
        int timeRemaining = 100;
        CalcTimeRemaining instance = new CalcTimeRemaining();
        int expResult = 95;
        int result = instance.CalcTimeRemaining(timeUsed, timeRemaining);
        assertEquals(expResult, result);
        
        
         System.out.println("this is test 2");
         
         timeUsed = -5;
         timeRemaining = 100;
         
         expResult = -999;
        result = instance.CalcTimeRemaining(timeUsed, timeRemaining);
        assertEquals(expResult, result);
        
        System.out.println("this is test 3");
         
         timeUsed = 5;
         timeRemaining = 4;
         
         expResult = -999;
        result = instance.CalcTimeRemaining(timeUsed, timeRemaining);
        assertEquals(expResult, result);
        
        
        System.out.println("this is test 4");
         
         timeUsed = 5;
         timeRemaining = -5;
         
         expResult = -999;
        result = instance.CalcTimeRemaining(timeUsed, timeRemaining);
        assertEquals(expResult, result);
        
        
        System.out.println("this is test 5");
         
         timeUsed = 0;
         timeRemaining = 0;
         
         expResult = 0;
        result = instance.CalcTimeRemaining(timeUsed, timeRemaining);
        assertEquals(expResult, result);
        
        
        System.out.println("this is test 6");
         
         timeUsed = 21;
         timeRemaining = 100;
         
         expResult = 79;
        result = instance.CalcTimeRemaining(timeUsed, timeRemaining);
        assertEquals(expResult, result);
    }
    
    
    
    
}
