/*
 *      Вариант 14
 * 1.  Дано двовимірний масив дійсних чисел. 
 *     Підрахувати кількість нульових елементів масиву і додати до неї 
 *     елемент масиву, що стоїть в другому рядку і третьому стовпчику
 * 2.   Дано двовимірний масив цілих чисел. 
        Знайти номери рядків, в яких є від’ємні елементи. 
 * 3.    Дано двовимірний масив цілих чисел. 
         Збільшити вдвічі всі парні додатні елементи заданого масиву 
 */
package lab.pkg6;

/**
 *
 * @author parsh
 */
import java.util.*;
import java.lang.Math.*;
import java.io.*;
import java.lang.*;

public class Lab6 {

    /**
     * @param args the command line arguments
     */
    static Scanner cin = new Scanner(System.in);
    static Random r = new Random();
    static int x,y;
    public static void main(String[] args) {
        // TODO code application logic here
        boolean f=true;
        do
        {
        System.out.print("\nВведите номер исполняемого задания: ");
        int n=cin.nextInt();
        switch(n)
        {
            case 1:
        System.out.println("\tЗадание 1");
        double [][] arrayD = new double [input_row()][input_column()];
        solution_one(arrayD);
                break;
            case 2:
        System.out.println("\tЗадание 2");
        int [][] arrayI = new int[input_row()][input_column()];
        solution_two(arrayI);
                break;
            case 3:
        System.out.println("\tЗадание 3");
        int [][] arrayI2 = new int[input_row()][input_column()];
        solution_three(arrayI2);
                break;
            default:
                System.out.println("\tВведенно неверное задание");
                f=false;
                break;
        }
        }while(f);
    }
    public static int input_row()
    {
        System.out.print("Введите количество рядов двумерного массива: ");
        try
        {
        x=cin.nextInt();
        }catch(InputMismatchException e)
        {
            cin.next();
            x=5;
        }
        return x;
    }
    public static int input_column()
    {
        System.out.print("Введите количество колоннок двумерноо массива: ");
        try
        {
        y=cin.nextInt();
        }catch(InputMismatchException e)
        {
            cin.next();
            y=5;
        }
        return y;
    }

    
    public static void solution_one(double a[][])
    {
        
        fillArrayDouble(a);
        printArrayDouble(a);
        int count=0;
        for(int i=0; i<x; i++)
            for(int j=0; j<y; j++)
            {
                if(a[i][j]==0)count++;
            }
        if(x<2||y<3)System.out.printf("Сумма %3d\n",count);
        else
        {
            System.out.printf("Сумма %.2f\n",(count+a[1][2]));
        }
    }
    public static void fillArrayDouble(double a[][])
    {
        for(int i=0; i<x; i++)
            for(int j=0; j<y; j++)
            {
                a[i][j]=r.nextDouble()*10-5;
            }
    }
    public static void printArrayDouble(double a[][])
    {
         for(int i=0; i<x; i++)
             for(int j=0; j<y; j++)
            {
                System.out.printf("%6.2f ",a[i][j]);
                if(j==y-1)System.out.print("\n");
            }
    }
    
    public static void solution_two(int a[][])
    {
        fillArrayInt(a);
        printArrayInt(a);
        boolean f=false;
        for(int i=0; i<x; i++)
        {   
            int count=0;
            for(int j=0; j<y; j++)
            {
                if(a[i][j]<0)count++;
            }
            if(count!=0)
            {
                f=true;
                System.out.println("В ряде "+ (i+1) +" есть елементы меньше нуля в количестве "+count);
            }
        }
        if(!f)System.out.println("В двумерном массиве нету элементов меньше нуля");
    }
    public static void fillArrayInt(int a[][])
    {
         for(int i=0; i<x; i++)
             for(int j=0; j<y; j++)
            {
                a[i][j]=r.nextInt()%50+30;
            }       
    }
    public static void printArrayInt(int a[][])
    {
         for(int i=0; i<x; i++)
             for(int j=0; j<y; j++)
            {
                System.out.printf("%3d ",a[i][j]);
                if(j==y-1)System.out.printf("\n");
            }       
    }
    
    public static void solution_three(int a[][])
    {
        fillArrayInt(a);
        System.out.println("Массив до измененний");
        printArrayInt(a);
        for(int i=0; i<x; i++)
            for(int j=0; j<y; j++)
            {
                if(a[i][j]>0&&a[i][j]%2==0)a[i][j]*=2;
            }
        System.out.println("Массив после измененний");
        printArrayInt(a);
    }
}
