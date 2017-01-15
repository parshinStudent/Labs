using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_5
{
    class Program
    {
        /*
         * Написать программу поиска в заданном массиве состоящем из 20-ти элементов
         * третьего положительного элемента и его индекса
        */
        static void Main(string[] args)
        {
            int[] array = new int[input_number()];
            fill(array);
            print_mass(array);
            solution(array);
            Exit();
        }
        public static int input_number()
        {
            Console.WriteLine("Введите количество елементов массива");
            return int.Parse(Console.ReadLine());
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
            Console.WriteLine("Елементы массива");
            int count = 0;
            for (int i=0; i<a.Length; i++)
            {
                Console.Write("{0,4}",a[i]);
                count++;
                if (count == 10) { count = 0; Console.WriteLine(); }  
            }
            if (count != 0)Console.WriteLine();
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
                    return;
                }
            }
            Console.WriteLine("В массиве нету трех положительных елементов");
        }
        public static void Exit()
        {
            Console.WriteLine("\nДля выхода нажмите Enter");
            Console.ReadLine();
        }
    }
}
