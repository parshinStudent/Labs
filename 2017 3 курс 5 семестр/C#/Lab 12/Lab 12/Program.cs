using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace Lab_12
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
            string name, date, S2, photo;
            Console.WriteLine("Ввести имя пользователя");
            name = Console.ReadLine();

            photo = "hello winter.jpg";


            StreamWriter f1 = new StreamWriter(@"t2.html");
            Dann Web = new Dann(name, photo, S1, S2);

            Shablon v = new Shablon();
            f1.WriteLine(v.a + Dann.Name_str + v.b + Dann.Name_str + v.c + Web.NamePolzovat + v.d + Web.foto + v.e + f3.ReadLine() + v.f + f4.ReadLine() + v.l);
            f1.Close();
            */
            string S, S1, S2, S4;
            Console.Clear();
            Console.WriteLine("Ввести имя пользователя");
            S = @"C:\Users\parsh\Desktop\C# 3 курс 1 семестр\Lab 12\Lab 12\bin\Debug\hello winter.jpg";
            S4 = Console.ReadLine();
            Console.WriteLine(" ВВедите путь к даннім пользователя ");
            S1 = @"C:\Users\parsh\Desktop\C# 3 курс 1 семестр\Lab 12\t2.txt";
            StreamReader f3 = new StreamReader(S1);
            //Console.WriteLine("Введите путь к статье");
            S2 = @"C:\Users\parsh\Desktop\C# 3 курс 1 семестр\Lab 12\t2.txt";
            StreamReader f4 = new StreamReader(S2);


            StreamWriter f1 = new StreamWriter(@"D:\work\mypage.html");
            Dann Web = new Dann(S, S4, S1, S2);
            Shablon v = new Shablon(); f1.WriteLine(v.a + Dann.Name_str + v.b + Dann.Name_str + v.c + Web.NamePolzovat + v.d + Web.foto + v.e + f3.ReadLine() + v.f + f4.ReadLine() + v.l); f1.Close(); f3.Close(); f4.Close();

        }
    }
}
