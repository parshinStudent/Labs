using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_6
{
    /*
     * Написать процедуру перемножения матрицы на вектор
    */
    public class Matrix
    {
        double[,] matrix;

        public int Row { get; protected set; }
        public int Column { get; protected set; }
        public static bool correctly = true;

        public Matrix(int row, int column)
        {
            Row = row;
            Column = column;
            matrix = new double[row, column];
        }

        public Matrix Multiple(Matrix value)
        {
            if (value.Row != Column)
            {
                Console.WriteLine("Неверные данные");
                correctly = false;
                Matrix result = new Matrix(1, 1);
                return result;
                
            }
            else
            {
                Matrix result = new Matrix(Row, value.Column);
                for (int i = 0; i < Row; i++)
                    for (int j = 0; j < value.Column; j++)
                        for (int k = 0; k < value.Row; k++)
                            result.matrix[i, j] += matrix[i, k] * value.matrix[k, j];
                return result;
            }
        }

        public void fill()
        {
            Random r = new Random();
            for (int i = 0; i < Row; i++)
                for (int j = 0; j < Column; j++)
                {
                    matrix[i,j] = r.Next(1, 10);
                }
        }

        public void Print()
        {
            for (int i = 0; i < Row; i++)
            {
                Console.Write("\t");
                for (int j = 0; j < Column; j++)
                    Console.Write("{0} ", matrix[i, j]);
                Console.WriteLine();
            }
            Console.WriteLine();
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            const int vectorX = 1;
            Matrix vector = new Matrix(vectorX, 3);
            Matrix matrix = new Matrix(3, 3);

            Console.WriteLine("Вектор:");
            vector.fill();
            vector.Print();

            Console.WriteLine("Матрица:");
            matrix.fill();
            matrix.Print();

            Console.WriteLine("Результирующий вектор:");
            Matrix result = vector.Multiple(matrix);
            if (Matrix.correctly) result.Print();
            else
                Console.WriteLine();
            Console.WriteLine("Нажмите Enter для выхода");
            Console.ReadLine();
        }
    }
}
