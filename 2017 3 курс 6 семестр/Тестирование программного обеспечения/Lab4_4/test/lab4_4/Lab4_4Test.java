/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_4;

import java.math.BigInteger;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author parsh
 */
public class Lab4_4Test
{
    
    public Lab4_4Test()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }

    @Test
    public void testCalcZm1()
    {
        System.out.println("calcZm1");
        BigInteger x = new BigInteger("-1");
        BigInteger expResult = new BigInteger("47784725839871999999");
        BigInteger result = Lab4_4.calcZ(x);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcZ0()
    {
        System.out.println("calcZ0");
        BigInteger x = new BigInteger("0");
        BigInteger expResult = new BigInteger("47784725839872000000");
        BigInteger result = Lab4_4.calcZ(x);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcZ1()
    {
        System.out.println("calcZ1");
        BigInteger x = new BigInteger("1");
        BigInteger expResult = new BigInteger("47784725839872000001");
        BigInteger result = Lab4_4.calcZ(x);
        assertEquals(expResult, result);
    }
    
}
