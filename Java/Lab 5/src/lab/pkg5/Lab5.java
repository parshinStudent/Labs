/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
     * 1. Дано лінійний масив дійсних чисел. Знайти всі від’ємні елементи 
     *    даного масиву та обчислити суму їх квадратів. 
     * 2.Дано лінійний масив дійсних чисел. Обчислити різницю між найбільшим 
     *   і найменшим елементами масиву.
     * 3.Скільки є елементів з мінімальним значенням серед додатних? 
     *   Замінити третій від’ємний на цю кількість. 
     */
    static Scanner cin = new Scanner(System.in);
    static Random r = new Random();
    public static void main(String[] args) {
        // TODO code application logic here
        solution_one();
        solution_two();
        solution_three();
    }
    
    public static void solution_one()
    {
        System.out.println("\tЗадание 1");
        double[] array = new double[20];
        for(int i=0; i<20; i++)
        {
            array[i]=r.nextDouble()*100-50;
            if(array[i]<0)
            {
                System.out.printf("Число меньше нуля %.2f его квадрат %.2f\n", array[i],(array[i]*array[i]));
            }
        }
    }
    public static void solution_two()
    {
        System.out.println("\tЗадание 2");
        double[] array = new double[20];
        double min=100,max=-100;
        for(int i=0; i<array.length; i++)
        {
            array[i]=r.nextDouble()*100-50;
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
        int[] array = new int[20];
        int min=100;
        for(int i=0; i<array.length; i++)
        {
            array[i]=r.nextInt()%20;
            System.out.println(array[i]);
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
        System.out.println("Количество минимальных значений больше нуля "+ min + " в массиве =" +count);
        int counter=0;
        for(int i=0; i<array.length; i++)
        {
            if(array[i]<0){
                            counter++; 
                            if(counter==3)
                            {
                                System.out.println("Меняю третий отьемный елемент массива с номером "+i+" и значением " +array[i]+" на "+min);
                                array[i]=count; 
                                break;
                            }
            }
        }
        if(counter!=3)System.out.println("В массиве меньше трех елементов меньше нуля");
        
    }
    }
}
