using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_1
{
    class Program
    {
        static void writeProblemOne()
        {
            Console.WriteLine("Напишите процедуру, выводящую сообщение о версии установленной");
            Console.WriteLine("операционной системы, текущей даты и времени.");
            Console.WriteLine();
        }
        static void writeProblemTwo()
        {
            Console.WriteLine("Составить процедуру для выполнения расчетов функции, значения");
            Console.WriteLine("задавать в диалоге с использованием метода Console.ReadLine().");
            Console.WriteLine();
        }
        static void solutionProblemOne()
        {
            OperatingSystem os = System.Environment.OSVersion;
            Console.WriteLine("Platform: {0}", os.Platform);
            Console.WriteLine("The current date and time is " + System.DateTime.Now);
            Console.WriteLine("\nДля перехода в главное меню нажмите Enter");
            Console.ReadLine();
        }
        static void solutionProblemTwo()
        {
            Console.WriteLine("Введите х: ");
            System.Double x = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Введите p: ");
            System.Double p = Convert.ToDouble(Console.ReadLine());

            System.Double M = Math.Pow(Math.E, (-(x / p))) + (4 / 3) * Math.Asin(Math.Cos(x));
            Console.Write("M:= "); Console.WriteLine(M);
            Console.WriteLine("\nДля перехода в главное меню нажмите Enter");
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
