/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author parsh
 */
public class Lab3
{
    private static final double t=2.2;
    public static double calcY(double x)
    {
        if(x<=0.900001)
        {
            return (((Math.log(x)*Math.log(x)*Math.log(x)) + (x*x))/ Math.sqrt(x+t) );
        }
        else
        {
            return (Math.cos(x)+t*(Math.sin(x)*Math.sin(x)) );
        }
    }
    public static void main(String[] args)
    {
        int count=0;
        for(double x=0.20000000000; x<2.000001; x+=0.004)
        {
            System.out.println("Номер: "+count +"    x: "+ x + "|  y=" + calcY(x));
            count++;
        }
        
    }
}
