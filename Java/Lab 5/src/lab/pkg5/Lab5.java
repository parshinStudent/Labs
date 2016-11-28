/*
 * 1. Дано лінійний масив дійсних чисел. Знайти всі від’ємні елементи 
 *    даного масиву та обчислити суму їх квадратів. 
 * 2.Дано лінійний масив дійсних чисел. Обчислити різницю між найбільшим 
 *   і найменшим елементами масиву.
 * 3.Скільки є елементів з мінімальним значенням серед додатних? 
 *   Замінити третій від’ємний на цю кількість. 
 */
package lab.pkg5;

/**
 *
 * @author parsh
 */
import java.util.*;
import java.lang.Math.*;
import java.io.*;
public class Lab5 {

    /**
     * @param args the command line arguments

     */
    static Scanner cin = new Scanner(System.in);
    static Random r = new Random();
    public static void main(String[] args) {
        // TODO code application logic here
        solution_one();
        solution_two();
        solution_three();
    }
    
    public static int input_numbers()
    {
        System.out.print("Введите количество элементов массива: ");
        int x;
        try
        {
        x=cin.nextInt();
        }catch(InputMismatchException e)
        {
            cin.next();
            x=10;
        }
        return x;
    }
    public static void printArray(double a[])
    {
        int count=0;
        for(int i=0; i<a.length; i++)
        {
            System.out.printf("%6.2f ",a[i]);
            count++;
            if(count==10&&i!=a.length-1)
            {
                System.out.printf("\n");
                count=0;
            }
        }
        System.out.printf("\n");
    }
    public static void fillArrayDouble(double a[])
    {
        for(int i=0; i<a.length; i++)
                a[i]=r.nextDouble()*10-5;
    }

    public static void solution_one()
    {
        System.out.println("\tЗадание 1");
        double[] array = new double[input_numbers()];
        fillArrayDouble(array);
        printArray(array);
        for(int i=0; i<array.length; i++)
        {
            if(array[i]<0)
            {
                System.out.printf("Число меньше нуля %.2f его квадрат %.2f\n", array[i],(array[i]*array[i]));
            }
        }
    }
    public static void solution_two()
    {
        System.out.println("\tЗадание 2");
        double[] array = new double[input_numbers()];
        double min=100,max=-100;
        fillArrayDouble(array);
        printArray(array);
        for(int i=0; i<array.length; i++)
        {
            if(array[i]<min)min=array[i];
            if(array[i]>max)max=array[i];
        }
        System.out.printf("Max=%.2f\n",max);
        System.out.printf("Min=%.2f\n",min);
        System.out.printf("Разница между мах и мин =%.2f\n",(max-min));
    }
    public static void solution_three()
    {
        System.out.println("\tЗадание 3");
        double[] array = new double[input_numbers()];
        fillArrayDouble(array);
        printArray(array);
        double min=100;
        for(int i=0; i<array.length; i++)
        {
            if(array[i]>0 && array[i]<min)min=array[i];
        }
        if(min==100)System.out.println("В массиве нету елементов больше нуля");
        else
        {
        int count=0;
        for(int i=0; i<array.length; i++)
        {
            if(array[i]==min)count++;
        }
        System.out.printf("Количество минимальных значений больше нуля %4.2f в массиве = %d\n",min,count);
        int counter=0;
        for(int i=0; i<array.length; i++)
        {
            if(array[i]<0){
                            counter++; 
                            if(counter==3)
                            {
                                System.out.printf("Меняю третий отьемный елемент массива с номером %d и значением %4.2f на %4.2f\n",i+1,array[i],min);
                                array[i]=count; 
                                break;
                            }
            }
        }
        if(counter!=3)System.out.println("В массиве меньше трех елементов меньше нуля");
    }
    }
}
