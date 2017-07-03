/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_3;

import java.util.Scanner;

/**
 *
 * @author parsh
 */
public class Lab4_3
{

    /**
     * @param args the command line arguments
     */
    public static double calcY(double x)
    {
        double o = 0;
        for(int i=1; i<=5; i++)
        {
            o+=i+2*x;
        }
        o=Math.tan(Math.toRadians(o));
        return o;
    }
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        double x;
        System.out.println("Введите значение x: ");
        Scanner cin = new Scanner(System.in);
        x=cin.nextDouble();
        System.out.println(x+ " =" +calcY(x));
    }
    
}
