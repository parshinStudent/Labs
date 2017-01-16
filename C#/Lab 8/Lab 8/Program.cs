using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_8
{
    class Program
    {
        static void Main(string[] args)
        {
            Car car = new Car();
            Gas(car.addGasoline(2));
            car.printCar();
            car.drive(100);
            car.printCar();
            if(car.needAddGasoline())Gas(car.addGasoline(car.Tank));
            car.inspection(); car.inspection(); 
            car.overhaul();
            car.printCar();
            car.drive(5000);
            car.printCar();
            Console.WriteLine("Для выхода нажмите Enter");
            Console.ReadLine();
        }
        static public void Gas(double a)
        {
            if (a != 0)
            {
                Console.WriteLine("Лишний бензин {0,3:f2} л. ",a);
            }
        }
    }
}
