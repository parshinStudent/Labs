
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;


namespace Lab_2
{
    class Program
    {
        static void writeProblemOne()
        {
            Console.WriteLine("Составить и отладить программу вычисления заданной в таблице 4.1");
            Console.WriteLine("функции y(x) для каждого из заданных значений параметра a и при ");
            Console.WriteLine("всех заданных значениях аргумента x.");
        }
        static void writeProblemTwo()
        {
            Console.WriteLine("Составить и отладить программу для приближённого вычисления заданной");
            Console.WriteLine("функции y(x) путём суммирования членов заданного её ряда s(x).");
            Console.WriteLine("Суммирование членов ряда проводить до члена ряда, значение которого");
            Console.WriteLine("по абсолютной величине не будет превышать Pow(10,-6)");
            Console.WriteLine();
        }
        static void solutionProblemOne()
        {
            Double y = 0;
            Console.Write(" x/a");
            for (double a = 0.5; a <= 1.25; a = a + 0.25)
            {
                Console.Write(" {0,4:f2}", a);
            }
            Console.WriteLine();
          
            for (double x = 1; x <= 7; x = x + 0.25)
                {
                Console.Write("{0,4:f2} ", x);
                for (double a = 0.5; a <= 1.25; a = a + 0.25)
                {
                    Double numerator = Math.Pow((a * (x * x)), (1 / 3)) + a * Math.Exp(-(x * x));
                    Double denominator = Math.Sqrt(a * x);
                    y = numerator / denominator;
                    Console.Write("{0,3:f2} ",y);
                }
                Console.WriteLine();
            }
                
            Console.WriteLine("Для перехода в главное меню нажмите Enter");
            Console.ReadLine();

        }
        static void solutionProblemTwo()
        {
            Console.WriteLine("Введите x");
            int x = int.Parse(Console.ReadLine());

            Double S = 1;
            int l = 2;
            int step = 1;
            int fac = 1;
            int count = 1;
            while(true)
            {
                double numerator;
                int X=1;
                for(int i=1; i<=step; i++)
                {
                    X *= x;
                }
                numerator = l * X;
                double denominator=1;
                for(int i=1; i<=fac; i++)
                {
                    denominator *= i;
                }
                double F = numerator / denominator;
                Console.WriteLine("Член ряда {0,2} равен {1,5:f7}",count,F);
                l++;
                step++;
                fac++;
                count++;
                S += F;
                if (Math.Abs(F) <= 0.000001) break;
            }
            double y = (1 + x) * Math.Exp(x);
            Console.WriteLine("\nЗначение функции: {0,5:f7}", y);
            Console.WriteLine("Сумма ряда:       {0,5:f7}", S);
            Console.WriteLine("Для перехода в главное меню нажмите Enter");
            Console.ReadLine();
        }
        static void Main(string[] args)
        {
            Console.WriteLine("\t\t\t\t\tУ меня 13 - вариант");
            string c;
            do
            {
                Console.WriteLine("Введите 1 или 2 (Номер исполняемой задачи)");
                c = Console.ReadLine();
                if (c == "1")
                {
                    writeProblemOne();
                    solutionProblemOne();
                }
                else
                    if (c == "2")
                {
                    writeProblemTwo();
                    solutionProblemTwo();
                }
                else
                    Environment.Exit(0);
            } while (c == "1" || c == "2");
        }
    }
}
