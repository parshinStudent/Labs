
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
            Console.WriteLine("Составить программу для ввода в диалоге значений переменных");
            Console.WriteLine("\tA, I, C, L, Name и форматного вывода на экран монитора вве-");
            Console.WriteLine("\t\tденных переменных(значеня вводимых переменных даны в табл.2.3)");
            //A=12,97 I=1002 C=-999,7 L=False Name=Parshin
        }
        static void writeProblemTwo()
        {
            Console.WriteLine("Составить программу для вычисления и печати значений функции из табл. 2.4");
            Console.WriteLine("Вычислить 8 значений функции на заданном интервале. Исходные данные зада-");
            Console.WriteLine("ть в файле LAB2.TXT. Результат поместить в файл вывода с именем LAB2.RES ");
            Console.WriteLine("в заданной форме (табл. 2.5) {x=0..3,x+=0.5}");
            Console.WriteLine();
        }
        static void solutionProblemOne()
        {
            Console.WriteLine("Введите A(12,97): ");
            double A = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Введите I(1002): ");
            int I = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Введите C(-999,7): ");
            double C = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Введите L(false): ");
            bool L = Convert.ToBoolean(Console.ReadLine());

            Console.WriteLine("Введите Name(Parshin): ");
            string name = Console.ReadLine();

            Console.WriteLine("Результаты форматирования \nname = {0,6}, L = {1,4}",name,L);
            Console.WriteLine(" I = {0,4}, A = {1,2:e2}, C = {2,3:e1}",I,A,C);
            Console.WriteLine("Для выхода нажмите на Enter");
            Console.ReadLine();

        }
        static void solutionProblemTwo()
        {
            string s;
            double x;
            StreamWriter f = new StreamWriter("LAB2.RES");
            StreamReader f1 = new StreamReader("LAB2.TXT");
            x = Convert.ToDouble(f1.ReadLine());
            double xmax = Convert.ToDouble(f1.ReadLine());
            f.WriteLine("Таблица значений");
            f.WriteLine("I---------------------------------------I");
            f.WriteLine("I       X       I    Функция            I ");
            f.WriteLine("I---------------------------------------I");
            for(double i = x; i<=xmax; i+=0.5)
            {
                double y = Math.Sqrt((1 / (2 * Math.Pow(Math.PI, Math.E)))) - i + 1;
                f.WriteLine("I  X = {0:f2}         I    Y = {1:f4}                  I ",i,y);
            }
            f.WriteLine("I---------------------------------------I");
            f.WriteLine("Составил < Паршин Олександр Юрьевич >");
            Console.WriteLine("Все завершилось с успехом");
            Console.WriteLine();
            f.Close();
            f1.Close();

        }
        static void Main(string[] args)
        {
            Console.WriteLine("\t\t\t\t\tУ меня 13 - вариант");
            string c;
            do
            {
                Console.WriteLine("Введите 1 или 2 (Номер исполняемой задачи)");
                c=Console.ReadLine();
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
