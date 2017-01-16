using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_11
{
    class Program
    {
        static void Main(string[] args)
        {
            Worker Dima = new Worker("Dima");
            Worker Kolya = new Worker("Kolya");
            Kommander Igor = new Kommander("Игорь Андреевич");

            Dima.Work(); Kolya.Work(); Igor.Work();
            Dima.premium(); Kolya.premium(); Igor.premium();
            Dima.information();
            Dima.Penalty = 100;
            Dima.information(); Kolya.information(); Igor.information();

            Igor.setSallary(Kolya.getHalfSallary() * 6);
            Igor.Penalty = 600;
            Igor.information();

            
            Console.WriteLine("Для выхода нажмите Enter");
            Console.ReadLine();
        }
    }
}
