/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_1;

import static junit.framework.TestCase.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author parsh
 */
public class Lab4_1Test
{
    
    public Lab4_1Test()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }

    @Test
    public void testIsAm12()
    {
        int a = -12;
        boolean expResult = true;
        boolean result = Lab4_1.isA(a);
        System.out.println("isA("+a+") =" +Boolean.toString(result));
        assertEquals(expResult, result);
    }
    @Test
    public void testIsAm11()
    {
        int a = -11;
        boolean expResult = false;
        boolean result = Lab4_1.isA(a);
        System.out.println("isA("+a+") =" +Boolean.toString(result));
        assertEquals(expResult, result);
    }
    @Test
    public void testIsAm9()
    {
        int a = -9;
        boolean expResult = true;
        boolean result = Lab4_1.isA(a);
        System.out.println("isA("+a+") =" +Boolean.toString(result));
        assertEquals(expResult, result);
    }
    @Test
    public void testIsAm8()
    {
        int a = -8;
        boolean expResult = true;
        boolean result = Lab4_1.isA(a);
        System.out.println("isA("+a+") =" +Boolean.toString(result));
        assertEquals(expResult, result);
    }
    @Test
    public void testIsA0()
    {
        int a = 0;
        boolean expResult = true;
        boolean result = Lab4_1.isA(a);
        System.out.println("isA("+a+") =" +Boolean.toString(result));
        assertEquals(expResult, result);
    }
    @Test
    public void testIsA1()
    {
        int a = 1;
        boolean expResult = true;
        boolean result = Lab4_1.isA(a);
        System.out.println("isA("+a+") =" +Boolean.toString(result));
        assertEquals(expResult, result);
    }
    @Test
    public void testIsA2()
    {
        int a = 2;
        boolean expResult = true;
        boolean result = Lab4_1.isA(a);
        System.out.println("isA("+a+") =" +Boolean.toString(result));
        assertEquals(expResult, result);
    }    
    @Test
    public void testIsA11()
    {
        int a = 11;
        boolean expResult = false;
        boolean result = Lab4_1.isA(a);
        System.out.println("isA("+a+") =" +Boolean.toString(result));
        assertEquals(expResult, result);
    }    
    @Test
    public void testIsA12()
    {
        int a = 12;
        boolean expResult = true;
        boolean result = Lab4_1.isA(a);
        System.out.println("isA("+a+") =" +Boolean.toString(result));
        assertEquals(expResult, result);
    }
//На какие класы можно разбить 
}
