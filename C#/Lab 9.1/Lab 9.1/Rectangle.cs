using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_9._1
{
    class Rectangle
    {
        double _firstCoordX;
        double _firstCoordY;
        double _secondCoordX;
        double _secondCoordY;

        Color _rectangleColor;
        Color _marginColor;

        double _privatCoordX;
        double _privatCoordY;
        double _deafAngle = 0.0;
        double _angle = 0.0;

        public Rectangle(double _tempFirstCoordX, double _tempFirstCoordY, double _tempSecondCoordX, double _tempSecondCoordY)
        {
            _firstCoordX = _tempFirstCoordX;
            _firstCoordY = _tempFirstCoordY;
            _secondCoordX = _tempSecondCoordX;
            _secondCoordY = _tempSecondCoordY;

            _privatCoordX = _firstCoordX;
            _privatCoordY = _secondCoordY;
            DeafAngle();
        }

        public Rectangle(double _tempHeight, double _tempWidth)
        {
            _firstCoordX = (_tempWidth / 2) * (-1);
            _firstCoordY = _tempHeight / 2;
            _secondCoordX = _tempWidth / 2;
            _secondCoordY = (_tempHeight / 2) * (-1);

            _privatCoordX = _firstCoordX;
            _privatCoordY = _secondCoordY;
            DeafAngle();
        }
        //--------------------------------------------------------------------------------------------------------------
        private void DeafAngle()
        {
            double _tempGip = LengthOfLine(_firstCoordX, _firstCoordY, _secondCoordX, _secondCoordY);
            double _tempKat = LengthOfLine(_privatCoordX, _privatCoordY, _secondCoordX, _secondCoordY);

            _deafAngle = 90 - ((Math.Asin(_tempKat / _tempGip) * 180) / Math.PI);
        }
        //--------------------------------------------------------------------------------------------------------------
        private double LengthOfLine(double _tempFirstCoordX, double _tempFirstCoordY, double _tempSecondCoordX, double _tempSecondCoordY)
        {
            return Math.Sqrt((_tempSecondCoordX - _tempFirstCoordX) * (_tempSecondCoordX - _tempFirstCoordX) + (_tempSecondCoordY - _tempFirstCoordY) * (_tempSecondCoordY - _tempFirstCoordY));
        }

        public double AreaOfRectangle()
        {
            return LengthOfLine(_firstCoordX, _firstCoordY, _privatCoordX, _privatCoordY) * LengthOfLine(_privatCoordX, _privatCoordY, _secondCoordX, _secondCoordY);
        }

        public double PerimeterOfRectangle()
        {
            return 2 * LengthOfLine(_firstCoordX, _firstCoordY, _privatCoordX, _privatCoordY) + 2 * LengthOfLine(_privatCoordX, _privatCoordY, _secondCoordX, _secondCoordY);
        }
        //--------------------------------------------------------------------------------------------------------------
        public void MoveOnX(double _tempLength)
        {
            _firstCoordX += _tempLength;
            _privatCoordX += _tempLength;
            _secondCoordX += _tempLength;
        }
        public void MoveOnY(double _tempLength)
        {
            _firstCoordY += _tempLength;
            _privatCoordY += _tempLength;
            _secondCoordY += _tempLength;
        }
        //--------------------------------------------------------------------------------------------------------------
        public void Scale(double _tempSacleX, double _tempSacleY)
        {
            if (_tempSacleX > 0.001)
            {
                _secondCoordX *= _tempSacleX;
            }
            if (_tempSacleY > 0.001)
            {
                _secondCoordY *= _tempSacleY;
                _privatCoordY = _secondCoordY;
            }
        }
        public void MoveTo(double _tempAngle, double _tempLength)
        {
            double _tempX;
            double _tempY;

            _tempX = _tempLength * Math.Cos(_tempAngle * Math.PI / 180);
            _tempY = _tempLength * Math.Sin(_tempAngle * Math.PI / 180);

            _firstCoordX += _tempX;
            _firstCoordY += _tempY;
            _secondCoordX += _tempX;
            _secondCoordY += _tempY;

            _privatCoordX += _tempX;
            _privatCoordY += _tempY;

        }
        public void Rotate(double _tempAngle)
        {
            _angle = _tempAngle;
        }
        //--------------------------------------------------------------------------------------------------------------
        public void RColor(Color _tempColor)
        {
            _rectangleColor = _tempColor;
        }
        public void Margin(Color _tempColor)
        {
            _marginColor = _tempColor;
        }
        //--------------------------------------------------------------------------------------------------------------
        public void Info()
        {
            Console.WriteLine("Left|Top Coord: ({0:F};{1:F})", _firstCoordX, _firstCoordY);

            double _tempX;
            double _tempY;
            double _tempLength = LengthOfLine(_firstCoordX, _firstCoordY, _secondCoordX, _secondCoordY);

            _tempX = _tempLength * Math.Cos((_deafAngle + _angle) * Math.PI / 180) + _firstCoordX;
            _tempY = _tempLength * Math.Sin((_deafAngle + _angle) * Math.PI / 180 *(-1)) + _firstCoordY;

            Console.WriteLine("Right|Bottom Coord: ({0:F};{1:F})", _tempX, _tempY);
            Console.WriteLine("Color: " + _rectangleColor);
            Console.WriteLine("Margin: " + _marginColor);
        }
        //--------------------------------------------------------------------------------------------------------------
        public double LeftCoordX
        {
            get { return _firstCoordX; }
        }
        public double LeftCoordY
        {
            get { return _firstCoordY; }
        }

        public double RightCoordX
        {
            get
            {
                double _tempX;
                double _tempLength = LengthOfLine(_firstCoordX, _firstCoordY, _secondCoordX, _secondCoordY);

                _tempX = _tempLength * Math.Cos((_deafAngle + _angle) * Math.PI / 180) + _firstCoordX;

                return _tempX;
            }
        }
        public double RightCoordY
        {
            get
            {
                double _tempY;
                double _tempLength = LengthOfLine(_firstCoordX, _firstCoordY, _secondCoordX, _secondCoordY);

                _tempY = _tempLength * Math.Sin((_deafAngle + _angle) * Math.PI / 180) + _firstCoordY;

                return _tempY;
            }
        }
        //--------------------------------------------------------------------------------------------------------------
        public double AreaOfSquare()
        {
            double _tempA = LengthOfLine(_firstCoordX, _firstCoordY, _privatCoordX, _privatCoordY);
            double _tempB = LengthOfLine(_privatCoordX, _privatCoordY, _secondCoordX, _secondCoordY);
            return Math.Min(_tempA, _tempB) * Math.Min(_tempA, _tempB);
        }

    };

    public enum Color
    {
        Red,
        Pink,
        Orange,
        Yellow,
        Gold,
        Green,
        Cyan,
        Blue,
        Magenta,
        Purple,
        White,
        Grey,
        Black
    }
}
