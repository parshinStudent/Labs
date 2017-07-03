/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author parsh
 */
public class Lab3Test
{
    final double EPS = 0.000006;
    
    public Lab3Test()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }

    @Test
    public void testCalcY0() {
        double x = 0.200;
        System.out.println("calcY0 ("+x+")");
        Lab3 instance = new Lab3();
        double expResult = -2.66520;
        double result = instance.calcY(x);
        assertEquals(expResult, result, EPS);
    }
    
    @Test
    public void testCalcY175() {
        double x = 0.900;
        System.out.println("calcY175 ("+x+")");
        Lab3 instance = new Lab3();
        double expResult = 0.45938;
        double result = instance.calcY(x);
        assertEquals(expResult, result, EPS);
    }   
    @Test
    public void testCalcY450() { 
        double x = 2.000;
        System.out.println("calcY450 ("+x+")");
        Lab3 instance = new Lab3();
        double expResult = 1.40286;
        double result = instance.calcY(x);
        assertEquals(expResult, result, EPS);
    }     
}
