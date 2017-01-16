using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_9._1
{
    class Program
    {
        static void Main(string[] args)
        {
            Rectangle ABCD = new Rectangle(0, 2, 3, 0);
            ABCD.Info();

            ABCD.Rotate(15);
            Console.WriteLine(ABCD.AreaOfRectangle());

            ABCD.Info();


            Console.WriteLine();
            Rectangle DR = new Rectangle(ABCD.RightCoordX, ABCD.RightCoordY, ABCD.LeftCoordX, ABCD.LeftCoordY);
            DR.Info();
            Console.WriteLine(DR.AreaOfRectangle());

            Console.ReadLine();
        }
    }
}
