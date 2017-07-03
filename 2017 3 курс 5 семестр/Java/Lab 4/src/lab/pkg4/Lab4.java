/*
            Вариант 14
     * 1. Знайти всі тризначні числа, що дорівнюють добутку своїх цифр. 
     * 2. 50 тюльпанів потрібно розфасувати у подарункові набори по 3, 5 і 7 
     *    квіток. Вивести на екран всі можливі варіанти букетів. 
     *    Підрахувати їхню кількість.
     * 3.   Напишіть програму для знаходження суми/добутку заданого ряду
*/
package lab.pkg4;

/**
 *
 * @author parsh
 */
import java.util.*;
import java.lang.Math.*;
import java.io.*;

public class Lab4 {

    /**
     * @param args the command line arguments
     */
    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        solution_one();
        solution_two();
        solution_three();
    }
    
    public static void solution_one()
    {
        System.out.println("\tЗадание 1");
        int count=0;
        for(int i=100; i<=999; i++)
        {
            int copy_i=i;
            int mylti=1;
            while (copy_i!=0)
            {
                int a=copy_i%10;
                mylti*=a;
                copy_i/=10;
            }
            //System.out.println("Добуток цифр числа " + i +" равен " + mylti);
            if(mylti==i)
            {
                count++;
                System.out.println(count + ". Число дорівнює добутку своїх цифр" + i); 
            }
        }
        if(count==0)System.out.println("Таких тризначних чисел не существует");
    }
    public static void solution_two()
    {
        System.out.println("\tЗадание 2");
        int count=0;
        int Tulips=50;
        
        for(int i=0; i<=7; i++)
            for(int j=0; j<=10; j++)
                for(int j1=0; j1<=16; j1++)
                {
                    int kol=7*i+5*j+3*j1;
                    if( kol==Tulips)
                    {
                        count++;
                        System.out.println("Букет из " +j1+" по 3| "+j+" по 5| "+i+" по 7.");
                    }
                }
        System.out.println("Всего способов расфасовать букеты = " + count);
    }
    public static void solution_three()
    {
        System.out.println("\tЗадание 3");
        System.out.print("Введите n: ");
        long n = cin.nextLong();
        System.out.print("Введите a: ");
        double a = cin.nextDouble();
        long answer=0;
        double d=a;
        double y=1/a;
        for(int i=1; i<=n; i++)
        {
            long power=i;
            for(int j=1; j<i; j++)
            {
                power*=i;
            }
            answer+=power;
        }
        
        for(int i=2; i<=n; i++)
        {
            d*=(a+(i-1));
            double f=i/d;
            y+=f;
            //System.out.printf("y:= %.4f i:= %d d:= %.4f  f:= %.4f\n",y,i,d,f);
        }
        
        System.out.println("Ответ 1: "+answer);
        System.out.printf("Ответ 2: %.4f ",y);
    }
}
