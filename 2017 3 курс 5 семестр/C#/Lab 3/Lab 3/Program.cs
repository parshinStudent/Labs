
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
            Console.WriteLine("Вычислить для своего варианта значение функции F.");
            Console.WriteLine("При получунии в знаменателе нуля дать соотвутсвующее сообщение.");
            //F=max(x,y+z) / (min(x,y)*min(x,y)-y) ;
        }
        static void writeProblemTwo()
        {
            Console.WriteLine("Определить для своего варианта номер N области, в которой находиться ");
            Console.WriteLine("точка M(x,y) с заданными координатами. Границы области относить ");
            Console.WriteLine("к области с найбольшим номером.");
            Console.WriteLine();
        }
        static void solutionProblemOne()
        {
            Console.Write("Введите значение x: ");
            Double x = Convert.ToDouble(Console.ReadLine());

            Console.Write("Введите значение y: ");
            Double y = Convert.ToDouble(Console.ReadLine());

            Console.Write("Введите значение z: ");
            Double z = Convert.ToDouble(Console.ReadLine());

            Double F = 0;
            Double denominator = (Math.Min(x, y) * Math.Min(x, y)) - y;
            Double numerator = Math.Max(x * x, z * z) + Math.Cos(2 * (x * x));
            if (denominator==0)
            {
                Console.WriteLine("Знаменатель равняется нулю");
            }
            else
            {
                F = denominator / numerator;
                Console.WriteLine("F = {0:f2}",F);
            }
            
            Console.WriteLine("Для перехода в главное меню нажмите Enter");
            Console.ReadLine();

        }
        static void solutionProblemTwo()
        {
            Console.Write("Введите для точки M координату по x: ");
            Double x = Convert.ToDouble(Console.ReadLine());

            Console.Write("Введите для точки M координату по y: ");
            Double y = Convert.ToDouble(Console.ReadLine());

            double Xc = 0, Yc = 0 , r=12;
            if (((x - Xc) * (x - Xc) + (y - Yc) * (y - Yc)) >= r * r)
            {
                Console.WriteLine("Точка не принадлежит окружности или лежит на окружности");
                Console.WriteLine("Точка M(" + x + ";" + y + ")" + " принадлежит области N:= 4\n");
            }
            else
            {
                if (y == x * x)
                {
                    Console.WriteLine("Точка лежит на параболе");
                    if (x >= 0) Console.WriteLine("Точка M(" + x + ";" + y + ")" + " принадлежит области N:= 3\n");
                    else
                        if (x < 0) Console.WriteLine("Точка M(" + x + ";" + y + ")" + " принадлежит области N:= 2\n");
                }
                else
                if (y > x * x)
                {
                    Console.WriteLine("Точка лежит в параболе");
                    Console.WriteLine("Точка M(" + x + ";" + y + ")" + " принадлежит области N:= 2\n");

                }
                else
                {
                    if(x<0&&y>0) Console.WriteLine("Точка M(" + x + ";" + y + ")" + " принадлежит области N:= 1\n");
                    else
                    Console.WriteLine("Точка M(" + x + ";" + y + ")" + " принадлежит области N:= 3\n");
                }

                Console.WriteLine("Для перехода в главное меню нажмите Enter");
            }
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
