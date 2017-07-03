/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_1;

import java.util.Scanner;

/**
 *
 * @author parsh
 */
public class Lab4_1
{

    /**
     * @param args the command line arguments
     */
    public static boolean isA(int a)
    {
        if(a%2==0 || a/10==0)
        {
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args)
    {
        // TODO code application logic here
        System.out.print("Введите целое число A: ");
        Scanner cin = new Scanner(System.in);
        int A;
        A=cin.nextInt();
        if(isA(A))System.out.println("TRUE");
        else
            System.out.println("FALSE");
        
    }
    
}
