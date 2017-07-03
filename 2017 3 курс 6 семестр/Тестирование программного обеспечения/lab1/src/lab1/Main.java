/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import static java.lang.Math.log;
import static java.lang.Math.sqrt;
public class Main {
private static final double a=2.2,p=1;
public static double calcY(double x)
{
    if(x<1.7)
    {
        return (p*x*x-7/x/x);
    }
    else
    {
        if(x==1.7){
            return (a*x*x*x+7*sqrt(x));
        }
        else{
            return (log(x+7*sqrt(x)) );
        }
    }
}

public static void main(String[] args)
{
    int count=0;
    for(double x=0.80000000; x<2.000001; x+=0.005)
    {
        System.out.println("Номер: "+count +" x: "+ x + "| y=" + calcY(x));
        count++;
    }
}
}

