package lab.pkg1;

/**
 * @author parsh
 */

import java.util.*;
import java.lang.Math.*;
import java.io.*;
public class Lab1 {

    /**
     * @param args the command line arguments
     */
        public static void print_info()
    {
        System.out.println("Вариант 14\n" +
        "1. Створити клас, що має методи для обчислення на ЕОМ значень змінних,\n"+
        "що зазначені у таблиці, за даними розрахунковими формулами і набора\n"+
        "ми вхідних даних.\n\n"+
                
        "2. Доповнити клас методом, що виводить на екран значення вхідних даних\n"+
        "і результати обчислень, супроводжуючи вивід найменуваннями виведених змінних.\n\n"+ 
        
        "3. Доповнити клас методом main, що є необхідним для\n"+ 
        "використання класу, як автономної програми, та виконати цю програму.\n");
    }
    public static double a,b,t,y,s;
    public static void main(String[] args) {
        // TODO code application logic here
        print_info();
        input();
        print_input();
        answer();
        print_answer();
        say_hello_and_good_day();
    }
    
    public static void input()
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Введите a: "); a = cin.nextDouble();
        System.out.print("Введите b: "); b = cin.nextDouble();
        System.out.print("Введите t: "); t = cin.nextDouble();
        System.out.println();
    }
    
    public static void print_input()
    {
        System.out.println("a:= "+a);
        System.out.println("b:= "+b);
        System.out.println("t:= "+t);
    }
    
    public static void answer()
    {
        y = Math.pow(Math.E, (-b*t)) * Math.sin(a*t+b) - Math.sqrt(Math.abs(b*t+a));
        s = b*Math.sin(a*(t*t)*Math.cos(2*t)) - 1;
    }
    
    public static void print_answer()
    {
        System.out.println("y:= " +y);
        System.out.println("s:= " +s);
    }
    public static void say_hello_and_good_day()
    {
        System.out.println("Здравствуйте Наталья Анатольевна!)");
        System.out.println("Хорошего вам дня=)))");
    }   
}
