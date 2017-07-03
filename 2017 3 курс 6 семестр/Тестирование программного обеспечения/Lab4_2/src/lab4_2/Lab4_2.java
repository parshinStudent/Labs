/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_2;

import java.util.Scanner;

/**
 *
 * @author parsh
 */
public class Lab4_2
{

    /**
     * @param args the command line arguments
     */
    
    public static boolean isGod(int a)
    {
        if(a==0 || a==1)
        {
            return true;
        }
        else
            return false;
    }
    
    public static boolean isNumb(int a)
    {
        if(a>=1 && a<=12)
        {
            return true;
        }
        else
            return false;
    }
    
    public static int countM(int numb, int god)
    {
        int count = -1;
        if(isNumb(numb) && isGod(god))
        {  
        switch(numb)
        {
            case 1: count = 31; break;
            case 2: if(god==0)count = 28; else count = 29; break;
            case 3: count = 31; break;
            case 4: count = 30; break;
            case 5: count = 31; break;
            case 6: count = 30; break;
            case 7: count = 31; break;
            case 8: count = 31; break;
            case 9: count = 30; break;
            case 10: count = 31; break;
            case 11: count = 30; break;
            case 12: count = 31; break;
        }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int numb;
        System.out.println("Введите номер месяца");
        numb=cin.nextInt();
        
        int god;
        System.out.println("Введите 1 если год высокостный и 0 если нет");
        god=cin.nextInt();
        
        if(isNumb(numb) && isGod(god))
        {
            System.out.println(countM(numb,god));
        }
        else
            System.out.println("Неверные входные данные");
    }
    
}
