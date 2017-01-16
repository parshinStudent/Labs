using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab10
{
    class Program
    {
        static void Main(string[] args)
        {
            Human Misha = new Human("Misha",Gender.Man);
            Human Masha = new Human("Masha", Gender.Women);

            for(int i=0; i<50; i++)Misha.eat(1);
            for (int i = 0; i <= 70; i++)Masha.eat(10);

            Misha.study(); Masha.study(); Masha.study();

            Masha.goSchool(); Misha.goSchool();
            Misha.study(); Misha.goSchool();
            Console.WriteLine();
            Masha.goUniversity();
            Misha.goUniversity();

            Masha.lection(true, false);
            Misha.lection(true, true);

            int markMisha = Misha.exam();
            int markMasha = Masha.exam();
            if (markMisha!=0)Console.WriteLine("Оценка Misha за экзамен " + markMisha);
            if (markMasha != 0) Console.WriteLine("Оценка Masha за экзамен " + markMasha);

            Misha.info();
            Masha.info();

            Console.WriteLine("Для выхода нажмите Enter");
            Console.ReadLine();
        }
    }
}
