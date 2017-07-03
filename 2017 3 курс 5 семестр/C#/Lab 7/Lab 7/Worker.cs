using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_7
{
    class Worker
    {
        public int age;
        public string name;

        private float weight;
        public float Weight
        {
            get{ return weight; }
            set{
                if (value < 0 || value >400 )weight = 0;
                else
                    weight = value;
            }
        }
        private int feeling = 10;
        public int Feeling
        {
            get { return feeling; }
            set
            {
                if (value < 0) feeling = 0;
                else
                    feeling = value;
            }
        }

        private int salary=0;
        public int Salary
        {
            get { return salary; }
            set
            {
                if (value > 0) salary = value;
            }
        }
        public void addSalary(int a)
        {
            Salary += a;
        }

        public Worker()
        {
            input_name();
            input_age();
        }
        public void eat(float how_much)
        {
            if(how_much>10)
            {
                weight++;
                weight += how_much / 2;
            }
            else
            weight = weight + how_much;
        }        
        public void input_name()
        {
            Console.WriteLine("Введите имя рабочего");
            name = Console.ReadLine();
        }
        public void input_age()
        {
            Console.WriteLine("Введите возраст рабочего");
            age = int.Parse(Console.ReadLine());
        }

        public void walk(){ Feeling += 1; }
        public void dance(){ Feeling += 2; }
        public void work(){ Feeling -= 2; }
    }
}
