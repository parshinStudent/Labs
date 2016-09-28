using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bap_13
{
    class Program
    {
        static void Main(string[] args)
        {
            OperatingSystem os = System.Environment.OSVersion;
            Console.WriteLine("Platform: {0}",os.Platform);
            Console.WriteLine("The current date and time is " + System.DateTime.Now);
            Console.ReadLine();
        }
    }
}
