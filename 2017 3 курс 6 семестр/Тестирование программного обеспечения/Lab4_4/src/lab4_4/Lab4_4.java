/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author parsh
 */
public class Lab4_4
{

    /**
     * @param args the command line arguments
     */
    public static BigInteger calcZ(BigInteger x)
    {
        BigInteger tempX;
        tempX = x.pow(5);
        System.out.println(tempX);
        BigInteger tempO=BigInteger.ONE;
        
        for(int i=1; i<=10; i++)
        {
            BigInteger temp = new BigInteger(Integer.toString(i));
            temp=temp.pow(3);
            tempO= tempO.multiply(temp);
        }
        System.out.println(tempO);
        return tempX.add(tempO);
    }
    public static void main(String[] args)
    {
        // TODO code application logic here
        System.out.println("Введите x: ");
        Scanner cin = new Scanner(System.in);
        BigInteger x = new BigInteger(cin.next());
        System.out.println(calcZ(x));
    }
}
