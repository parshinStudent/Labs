using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_8
{
    class Car
    {
        private double tank = 30;
        public double gasolineTank = 0;
        public double consumption = 1;
        public int mileage=4900;

        public double Tank{ get{ return tank; } }
        public void printCar()
        {
            Console.WriteLine("\n\t---------------Car---------------");
            Console.WriteLine("\tОбъем бака "+tank +"\tПробег " + mileage);
            Console.WriteLine("\tКоличество бензина в баке {0,3:f2}",gasolineTank);
            Console.WriteLine("\tРасход бензина на 100км "+consumption);
            Console.WriteLine("\t---------------Car---------------\n");
        }
        public double addGasoline(double a)
        {
            double canAdd = tank - gasolineTank;
            if (canAdd < a)
            {
                double bigger = a - canAdd;
                gasolineTank = tank;
                return bigger;
            }
            else
            {
                gasolineTank += a;
                return 0;
            }
        }

        public void drive(int km)
        {
            while(km!=0)
            {
                km--;
                mileage++;
                if (mileage / 1000 > (mileage - 1) / 1000)
                {
                    Console.WriteLine("Пробег перевалил за очередную тысячу расход бензина увеличен на 0.1 л.");
                    consumption += 0.1;
                }
                gasolineTank -= (consumption / 100);
                if (km == 0) break;
                if (mileage == 5000)
                {
                    Console.WriteLine("Машина сломается. Не доехав " + km + " км.");
                    return;
                }
                if(gasolineTank<=0)
                {
                    Console.WriteLine("У Машина закончится бензин. Не доехав " + km + " км.");
                    gasolineTank = 0;
                    return;
                }
            }
            Console.WriteLine("Машина доедет без происшествий");
            /*
            double canDriveGas = (gasolineTank /(consumption/100));
            int maxMileage = 5000;
            int newMileage = mileage + km;
            double needGasoline = (km * consumption)/100;
            int canDriveMileage = maxMileage - mileage;
            double needGasolineForCan = ((canDriveMileage) * consumption) / 100;
            int beforeThousandKm = mileage / 1000;

            bool f;
            bool f1;
            if(km>canDriveGas){ f = false; }
            else { f = true; }

            if(km>canDriveMileage){ f1 = false; }
            else{ f1 = true; }

            if(!f&&!f1)
            {
                Console.WriteLine("Машина сломается и у нее закончится бензин не доехав " + (km - (int)canDriveGas) + " км.");
                mileage = maxMileage;
                gasolineTank = 0;
            }
            else
            if(!f)
            {
                Console.WriteLine("У машины закончится бензин не доехав " + (km - (int)canDriveGas) + " км.");
                mileage += (int)canDriveGas;
                gasolineTank = 0;
            }
            else
                if(!f1)
            {
                Console.WriteLine("Машина сломается не доехав " + (km - canDriveMileage) + " км.");
                mileage += canDriveMileage;
                gasolineTank -= needGasolineForCan; 
            }
            else
            {
                Console.WriteLine("Машина доедет без происшествий");
                mileage += km;
                gasolineTank -= needGasoline;
            }
            */
        }

        public void inspection()
        {
            consumption -= 0.5; if (consumption < 0.5) consumption = 0.5;
        }
        public bool needAddGasoline()
        {
            if (tank / 10 > gasolineTank) return true;
            else
                return false;
        }
        public void overhaul()
        {
            mileage = 0;
        }
    }
}
