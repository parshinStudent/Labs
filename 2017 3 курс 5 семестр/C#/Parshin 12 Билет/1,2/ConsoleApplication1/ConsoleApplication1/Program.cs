using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            Random rnd = new Random();
            int[] array = new int[20];
            for(int j=0; j<20; j++)
            {
                array[j] = rnd.Next(1, 50);
            }

            int count = 0;
            int otvet = 1;
            for(int j=0; j<20; j++)
            {
                if (Math.Sqrt(array[j]) - Math.Ceiling(Math.Sqrt(array[j])) == 0)
                {
                    Console.WriteLine(+j + " " + array[j] + "\tТочный квадрат");
                    count++;
                    otvet *= array[j];
                }
                else
                    Console.WriteLine(+j + " " + array[j] + "\tНе точный квадрат");
            }
            if (count != 0)
            {
                Console.WriteLine("Количество точных квадратов в массиве " + count);
                Console.WriteLine("Добуток точных квадратов в массиве " + otvet);
            }
            else
            {
                Console.WriteLine("В массивн нету точных квадратов ");
            }
            Console.WriteLine("Нажмите Enter что бы перейти ко второму заданию");
            Console.ReadLine();

            ///Протабалювати функцію
            double F;
            double min=100000000;
            double max = -100000000;
            Console.WriteLine("Таблица значений");
            Console.WriteLine("I------------------------------------------------I");
            Console.WriteLine("I       X       I        Y       I       F       I ");
            Console.WriteLine("I------------------------------------------------I");
            for (double x=1; x<=5; x=x+0.5)
            {
                for(double y=0; y<=4; y=y+0.5)
                {
                    F = Math.Sqrt(x * x + y * y + 1);

                    Console.WriteLine("I  x = {0:f2}    I    y = {1:f2}     I   F ={2:f6} ", x, y, F);
                    //Console.WriteLine("x:= " + x + "  y:= " + y + "    F:=" + F);
                    if (F > max) max = F;
                    if (F < min) min = F;
                }
            }
            Console.WriteLine("Минимальное значення функции min = {0:f6} ",min);
            Console.WriteLine("Максимальне значення функции max = {0:f6}" ,max);
            Console.WriteLine("\tНажмите Enter для выхода из программы");
            Console.ReadLine();
        }
    }
}
