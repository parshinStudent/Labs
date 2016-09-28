using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bar_13_1_
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Введите х: ");
            System.Double x=Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Введите p: ");
            System.Double p = Convert.ToDouble(Console.ReadLine());

            System.Double M = Math.Pow(Math.E , (-(x / p))) + (4 / 3) * Math.Asin(Math.Cos(x));
            Console.Write("M:= "); Console.WriteLine(M);
            Console.ReadLine();
         }
    }
}
