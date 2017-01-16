using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_7
{
    class Program
    {
        static void Main(string[] args)
        {
            Worker wrk1 = new Worker();
            wrk1.eat(2);
            wrk1.eat(3);
            wrk1.walk();  wrk1.walk();
            wrk1.dance(); wrk1.dance(); wrk1.dance();
            for(int i=1; i<=10; i++)
            {
                wrk1.work();
            }
            Console.WriteLine("Настроение: "+wrk1.Feeling);
            float ves = wrk1.Weight;
            Console.WriteLine(wrk1.name + ", " + wrk1.age + " год, вес: "+ves+" кг.");
            Console.ReadLine();
        }
    }
}
