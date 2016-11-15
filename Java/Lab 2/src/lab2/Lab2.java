/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author parsh
 */

import java.util.*;
import java.lang.Math.*;
import java.io.*;

public class Lab2 {

    /**
     * @param args the command line arguments
     */
        public static void print_info()
    {
        System.out.println("Лабораторная робота №2  Вариант 14\n" +
        "1.Обчислити середнє геометричне трьох чисел\n" +
        "2.Обчислити значення a\n" +
        "3.Богдан накреслив три відрізки. Перший - завдовжки 5 см.,\n" +
        "другий - на D дм довший і третій - в S раз коротший, ніж другий.\n" +
        "Визначити загальну довжину всіх відрізків разом (у метрах). ");
    }
        
    public static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        print_info();
        System.out.println("Середнє геометричне трьох чисел:= " + solution_one());
        System.out.println("a:= " + solution_two());
        System.out.println("Длина всех отрезков:= " + solution_three() + " м.");
    }

    public static double solution_one()
    {
       System.out.println("\tЗадание 1");
       int x,y,z;
       
        do{  
        System.out.println("Введите x: "); x = cin.nextInt();
        }while(x<=0);
        do{
        System.out.println("Введите y: "); y = cin.nextInt();
        }while(y<=0);
        do{
        System.out.println("Введите z: "); z = cin.nextInt();
        }while(z<=0);
       double o=x*y*z;
       double n=3;
       return Math.pow(o,(1/n));
    }
    public static double solution_two()
    {
       int x,y;
       double a;
       System.out.println("\tЗадание 2");
       System.out.println("Введите x: "); x = cin.nextInt();
       System.out.println("Введите y: "); y = cin.nextInt();
       a=y-(x/(y*y+(x*x / (Math.abs(y)+(Math.abs(x*x*x)/3) ) ) ));
       return x;
    }
    public static double solution_three()
    {
       int x=5;
       double all;
       int D,S;
       System.out.println("\tЗадание 3");
       System.out.println("Введите D: "); D = cin.nextInt();
       System.out.println("Введите S: "); S = cin.nextInt();
       double two=x+D*10;
       double three=two/S;
       all=(x+two+three)/100;
       return all;
    }
    
}
