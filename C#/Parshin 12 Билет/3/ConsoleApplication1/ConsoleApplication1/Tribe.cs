using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Tribe
    {
        private string Name;
        private int Kol;
        private bool Fire;

        public void setName(string s) { Name = s; }
        public void setKol(int a) { Kol = a; }
        public void setFire( bool f){Fire=f;}
        public string getName() { return Name; }
        public int getKol() { return Kol; }
        public bool getFire() { return Fire; }
        public void Print()
        {
            Console.WriteLine("Имя племя " + getName());
            Console.WriteLine("Численность племя " + getKol());
            if(getFire()==false)
            {
                Console.WriteLine("Знакомство с огнем не произошло");
            }
            else
                Console.WriteLine("Знакомство с огнем произошло");
            Console.WriteLine("\t\t\tНажмите Enter");
            Console.ReadLine();
        }

        public Tribe(Tribe T)
        {
            Name = T.getName();
            Kol = T.getKol();
            Fire = T.getFire();
        }
        
        public Tribe(string name,int kol, bool f)
        {
            Name = name;
            Kol = kol;
            Fire = f;
        }
        public Tribe() { }
    }
}
