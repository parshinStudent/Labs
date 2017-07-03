using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_11
{
    public class Worker
    {
        static public Random rnd = new Random();
        public int sallary;
        private string name;
        private int numberYearsUntilRetirement;

        public Worker(string Name)
        {
            name = Name;
            sallary = 250;
            numberYearsUntilRetirement = 40;
        }

        public void Work()
        {
            if(numberYearsUntilRetirement-1>=0) numberYearsUntilRetirement--;
            sallary += 10;
        }

        public void information()
        {
            Console.WriteLine("У {0} зарплата равна {1}.", name, sallary);
        }
        
        public void premium()
        {
            sallary += rnd.Next(50,100);
        }
        private void penalty(int value) { sallary -= value; if (sallary < 0) sallary += value; }
        public int Penalty { set { penalty(value); } }
        public int getHalfSallary()
        {
            return sallary / 2;
        }
    }
}

