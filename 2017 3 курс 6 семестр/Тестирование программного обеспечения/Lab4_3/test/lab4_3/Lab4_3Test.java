/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_3;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author parsh
 */
public class Lab4_3Test
{
    
    final double EPS = 0.000006;
    public Lab4_3Test()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }

    @Test
    public void testCalcYm1()
    {
        double x = -1;
        double expResult = 0.087488;
        double result = Lab4_3.calcY(x);
        System.out.println("calcY("+x+") =" + result);
        assertEquals(expResult, result, EPS);
    }
    @Test
    public void testCalcY0()
    {
        double x = 0;
        double expResult = 0.267949;
        double result = Lab4_3.calcY(x);
        System.out.println("calcY("+x+") =" + result);
        assertEquals(expResult, result, EPS);
    }  
    @Test
    public void testCalcY1()
    {
        double x = 1;
        double expResult = 0.466307;
        double result = Lab4_3.calcY(x);
        System.out.println("calcY("+x+") =" + result);
        assertEquals(expResult, result, EPS);
    }
}
