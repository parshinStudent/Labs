/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_2;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author parsh
 */
public class Lab4_2Test
{
    
    public Lab4_2Test()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }

    @Test
    public void testIsGod0()
    {
        int a = 0;
        boolean expResult = true;
        boolean result = Lab4_2.isGod(a);
        System.out.println("isGod("+a+") =" +Boolean.toString(result));
        assertEquals(expResult, result);
    }
    @Test
    public void testIsGod1()
    {
        int a = 1;
        boolean expResult = true;
        boolean result = Lab4_2.isGod(a);
        System.out.println("isGod("+a+") =" +Boolean.toString(result));
        assertEquals(expResult, result);
    }
    @Test
    public void testIsGod2()
    {
        int a = 2;
        boolean expResult = false;
        boolean result = Lab4_2.isGod(a);
        System.out.println("isGod("+a+") =" +Boolean.toString(result));
        assertEquals(expResult, result);
    }
    @Test
    public void testIsGodm1()
    {
        int a = -1;
        boolean expResult = false;
        boolean result = Lab4_2.isGod(a);
        System.out.println("isGod("+a+") =" +Boolean.toString(result));
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testIsNumb0()
    {
        int a = 0;
        boolean expResult = false;
        boolean result = Lab4_2.isNumb(a);
        System.out.println("isNumb("+a+")=" + Boolean.toString(result));
        assertEquals(expResult, result);
    }
    @Test
    public void testIsNumb1()
    {
        int a = 1;
        boolean expResult = true;
        boolean result = Lab4_2.isNumb(a);
        System.out.println("isNumb("+a+")=" + Boolean.toString(result));
        assertEquals(expResult, result);
    }
    @Test
    public void testIsNumb6()
    {
        int a = 6;
        boolean expResult = true;
        boolean result = Lab4_2.isNumb(a);
        System.out.println("isNumb("+a+")=" + Boolean.toString(result));
        assertEquals(expResult, result);
    }
    @Test
    public void testIsNumb12()
    {
        int a = 12;
        boolean expResult = true;
        boolean result = Lab4_2.isNumb(a);
        System.out.println("isNumb("+a+")=" + Boolean.toString(result));
        assertEquals(expResult, result);
    }
    @Test
    public void testIsNumb13()
    {
        int a = 13;
        boolean expResult = false;
        boolean result = Lab4_2.isNumb(a);
        System.out.println("isNumb("+a+")=" + Boolean.toString(result));
        assertEquals(expResult, result);
    }
    

    @Test
    public void testCountM0m1()
    {
        int numb = 0;
        int god = -1;
        int expResult = -1;
        int result = Lab4_2.countM(numb, god);
        System.out.println("countM("+numb +", " + god+") = "+result);
        assertEquals(expResult, result);
    }
    @Test
    public void testCountM00()
    {
        int numb = 0;
        int god = 0;
        int expResult = -1;
        int result = Lab4_2.countM(numb, god);
        System.out.println("countM("+numb +", " + god+") = "+result);
        assertEquals(expResult, result);
    }   
    @Test
    public void testCountM12()
    {
        int numb = 1;
        int god = 2;
        int expResult = -1;
        int result = Lab4_2.countM(numb, god);
        System.out.println("countM("+numb +", " + god+") = "+result);
        assertEquals(expResult, result);
    }  
    
    @Test
    public void testCountM20()
    {
        int numb = 2;
        int god = 0;
        int expResult = 28;
        int result = Lab4_2.countM(numb, god);
        System.out.println("countM("+numb +", " + god+") = "+result);
        assertEquals(expResult, result);
    }
    @Test
    public void testCountM21()
    {
        int numb = 2;
        int god = 1;
        int expResult = 29;
        int result = Lab4_2.countM(numb, god);
        System.out.println("countM("+numb +", " + god+") = "+result);
        assertEquals(expResult, result);
    }
    @Test
    public void testCountM131()
    {
        int numb = 13;
        int god = 1;
        int expResult = -1;
        int result = Lab4_2.countM(numb, god);
        System.out.println("countM("+numb +", " + god+") = "+result);
        assertEquals(expResult, result);
    }
}
