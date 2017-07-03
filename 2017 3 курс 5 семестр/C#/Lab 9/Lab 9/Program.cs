using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_9
{
    class Program
    {
        static void Main(string[] args)
        {
            Pryamougolnik ABCD = new Pryamougolnik(0, 0, 2, 2);
            Pryamougolnik EFGH = new Pryamougolnik(4,6);
            ABCD.info();

            Console.WriteLine("Площадь прямоугольника ABCD {0,4:f3}", ABCD.areaRectangle());
            ABCD.Rotate(Convert.ToInt32(Console.ReadLine()));
            ABCD.setColorFon(Color.Krasny);
            ABCD.setColorLine(Color.Zelty);
            ABCD.info();
            Console.WriteLine("Площадь прямоугольника ABCD {0,4:f3}\n", ABCD.areaRectangle());

            Console.WriteLine("Площадь прямоугольника EFGH {0,4:f3}", EFGH.areaRectangle());
            EFGH.info();
            Console.WriteLine("Для выхода нажмите Enter");
            Console.ReadLine();
        }
    }
}
