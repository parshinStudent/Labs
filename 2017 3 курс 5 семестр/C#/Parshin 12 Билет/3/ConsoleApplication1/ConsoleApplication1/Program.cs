using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            Tribe myTribe = new Tribe();
            myTribe.setName("Maya");
            myTribe.setKol(500);
            myTribe.setFire(true);
            myTribe.Print();

            Tribe two = new Tribe("Tec",2000,false);

            two.Print();

            Tribe wee = new Tribe(myTribe);

            wee.setFire(false);
            wee.Print();
        }
    }
}
