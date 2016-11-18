using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_5
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] array = new int[20];
            fill(array);
            print_mass(array);
            solution(array);
            Exit();
        }
        public static void fill(int[] a)
        {
            Random r = new Random();
            for(int i =0; i<a.Length; i++)
            {
                a[i] = r.Next(-25,25);
            }
        }
        public static void print_mass(int[] a)
        {
            for(int i=0; i<a.Length; i++)
            {
                Console.WriteLine("{0,3}",a[i]);
            }
        }
        public static void solution(int[] a)
        {
            int counter = 0;
            for(int i =0; i<a.Length; i++)
            {
                if(a[i]>=0)
                {
                    counter++;
                }
                if(counter==3)
                {
                    Console.WriteLine("Индекс третьего положительного елемента {0} и элемент {1}",i,a[i]);
                    break;
                }
            }
        }
        public static void Exit()
        {
            Console.WriteLine("\nДля выхода нажмите Enter");
            Console.ReadLine();
        }
    }
}
