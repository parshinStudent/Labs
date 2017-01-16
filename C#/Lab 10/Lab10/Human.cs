using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab10
{
    
    public enum Gender{ Man,Women };
    public enum Status {Baby, Preschooler, Schoolboy, Student}
    class Human
    {
        private string name;
        private double age;
        private Gender sex;
        private Status status;
        private int know;
        private bool precis;

        public double Age{ get { return age; } set { } }

        public Human(string Name, Gender Sex)
        {
            name = Name; sex = Sex;
            age = 0; status = Status.Baby;
        }

        public void eat(int a)
        {
            age += 0.1;
            if(age==2.0)
            {
                status = Status.Preschooler;
            }
        }

        public void study()
        {
            if (sex == Gender.Man) know += 9;
            else
                know += 10;
            age++;
        }

        public void goSchool()
        {
            if ( (age > 5.0) && (know > 10))
            {
                status = Status.Schoolboy;
                Console.WriteLine("Человеку {0} установили статус {1}", name, status);
            }
            else
            {
                if(age<=5 && know<=10)
                {
                    Console.WriteLine("Человеку {0} не хватает знаний и надо покушать чтобы пойти в школу.", name);
                }
                else
                {
                    if(age<=5)
                    {
                        Console.WriteLine("Человек {0} слишком молодой чтобы пойти в школу.", name);

                    }
                    else
                    {
                        Console.WriteLine("Человеку {0} не хватает знаний чтобы пойти в школу.", name);
                    }
                }
            }
        }

        public void goUniversity()
        {
            if(status!=Status.Schoolboy)
            {
                Console.WriteLine("Человеку {0} не хватает знаний чтобы поступить в институт.", name);
            }
            else
                if(status == Status.Student) Console.WriteLine("Человек {0} уже поступил в институт.", name);
            else
            {
                Random rnd = new Random(DateTime.Now.Millisecond);
                int supply = rnd.Next(0,10);
                if (supply % 2==0)
                {
                    Console.WriteLine("Человек {0} поступил в институт.", name);
                    status = Status.Student;
                }
                else
                    Console.WriteLine("Человек {0} не поступил в институт.", name);
            }
        }

        public void lection(bool presence, bool Precis)
        {
            if(status!=Status.Student)
            {
                Console.WriteLine("Человек {0} не поступал в институт и не может присутствовать на лекции.", name);
                return;
            }
            if (presence & Precis) precis = true;
        }

        public int exam()
        {
            if (status != Status.Student)
            {
                Console.WriteLine("Человек {0} не поступал в институт и не может присутствовать на экзамене.", name);
                return 0;
            }
            if (know>10 && precis)
                return 5;
            if (know > 5 && precis)
                return 4;
            if (know >= 0 && precis)
                return 3;
            return 2;
        }

        public void info()
        {
            Console.WriteLine("\n\tИмя: {0}  Пол: {1} Возраст: {2,3:f1}",name,sex,age);
            Console.WriteLine("\tСтатус: {0}  Знания: {1}\n",status,know);
        }
    }
}
