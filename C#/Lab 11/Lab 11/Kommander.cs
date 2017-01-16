using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_11
{
    class Kommander : Worker
    {
        public Kommander(string s) : base(s)
        {
            sallary = 500;
        }

        new public void Work()
        {
            sallary += 100;
        }

        new public void premium()
        {
            sallary += rnd.Next(50, 100)*3;
        }

        public void setSallary(int value)
        {
            sallary = value;
        }
        //new public int Penalty;
    }
}
