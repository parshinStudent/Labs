package lab.pkg3;

import java.util.*;
import java.lang.Math.*;
import java.io.*;

/**
 *
 * @author parsh
 */
public class Lab3 {
    /*  
            Вариант 14
    1.Створити програму визначення, чи є задане ціле число парним числом 
    і яким – двозначним, тризначним чи іншим. Якщо парне двозначне, то 
    зменшити його вдвічі, якщо парне тризначне – збільшити на 11, 
    а якщо інше, то знайти його квадрат. На екран вивести відповідні 
    коментарі з поясненням дій, початкові та кінцеві значення змінних.
    
    2.По введеному числу від 1 до 8 вивести на екран назву відповідного 
    факультету університету (1 – філологічний, 2 – фізико-математичний, …).
    
    3.Обчислити значення функції F залежно від значень сталих a, b, с, та змінної x. 
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
        System.out.print("Введите целое число: ");
        int number=cin.nextInt();
        System.out.println("Число до измененний "+number);
        if(number%2==0)
        {
            int copy_number=number;
            int counter=0;
            while(copy_number!=0)
            {
                copy_number/=10;
                counter++;
            }
            if(counter==2)
            {
                System.out.println("Число парне та двозначне. Нове число:= "+(number/2));
            }
            else
                if(counter==3)
                {
                    System.out.println("Число парне та тризначне. Нове число:= "+(number+11));
                  
                }
                else
                    if(counter==1)
                    System.out.println("Число парне та однозначне. Нове число:= "+(number*number));
            else
                      System.out.println("Число парне та имеет больше трехзнаком. Нове число:= "+(number*number));  
        }
        else
        {
            System.out.println("Число не парне. Нове число:= "+(number*number));
        }
    }
    
    public static void solution_two()
    {
        System.out.println("\tЗадание 2");
        System.out.print("Введите число от 1 до 8: ");
        int number=cin.nextInt();
        switch(number) {
            case 1: number = 1;
	    System.out.println("Філологічний факультет");
		break;
	case 2: number = 2;
	    System.out.println("Фізико-математичний факультет");
		break;
	case 3: number = 3; 
	    System.out.println("Юридичний факультет");
		break;
        case 4: number = 4; 
	    System.out.println("Економічний факультет");
		break;
        case 5: number = 5; 
	    System.out.println("Хімічний факультет");
		break;  
        case 6: number = 6; 
	    System.out.println("Психологічний факультет");
		break;
        case 7: number = 7; 
	    System.out.println("Історичний факультет");
		break;
        case 8: number = 8; 
	    System.out.println("Філософський факультет");
		break;
	default: 
	    System.out.println("Вы ввели неверное число");
	    break;
                        }
    }
    
    public static void solution_three()
    {
        System.out.println("\tЗадание 3");
        System.out.println("Введите целые a,b,c,x: ");
        int a=cin.nextInt();
        int b=cin.nextInt();
        int c=cin.nextInt();
        int x=cin.nextInt();
        
        double F;
        if(x+c<0&&a!=0)
        {
            System.out.println("Условие x+c<0&&a!=0 сработало");
            F=-a*(x*x*x)-b;
        }
        else
            if(x+c>0&&a==0)
            {
                System.out.println("Условие x+c>0&&a==0 сработало");
                F=(x-a)/(x-c);
            }
        else
            {
                System.out.println("Условие другие случаи сработало");
                F=x/c+c/x;
            }
        System.out.println("F:= " + F);
    }   
}
