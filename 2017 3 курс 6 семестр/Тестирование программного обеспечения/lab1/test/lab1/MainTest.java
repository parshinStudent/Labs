/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Эльза II Frozen
 */
public class MainTest {
final double EPS = 0.000006;
public MainTest(){}
@BeforeClass
public static void setUpClass(){}
@Test
public void testCalcY0() {
double x = 0.8;
System.out.println("calcY0 ("+x+")");
Main instance = new Main();
double expResult = -10.2975;
double result = instance.calcY(x);
assertEquals(expResult, result, EPS);
}
@Test
public void testCalcY180() {
double x = 1.699999;
System.out.println("calcY180 ("+x+")");
Main instance = new Main();
double expResult = 0.46785;
double result = instance.calcY(x);
assertEquals(expResult, result, EPS);
}
@Test
public void testCalcY240() {
double x = 1.999999;
System.out.println("calcY240 ("+x+")");
Main instance = new Main();
double expResult = 2.476495;
double result = instance.calcY(x);
assertEquals(expResult, result, EPS);
}

}

