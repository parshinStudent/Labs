<!-- Виводимо на екран форму-->
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Лабораторная работа 2.2</title>
    </head>
<body>
    <h1>Задание 2</h1>
    <div><pre><p style="font-size: 15px">Var 10.	
    По введеному року від 1950 до 2020 вивести на екран назву відповідної назви ро-ку по східному календарю 
    (1 – миша, 2 – бик, 3 – тигр, 4 – кіт, 5 – дракон, 6 – змія, 7 – кінь, 8 – вівця, 9 – мавпа, 10 – півень, 11 – собака, 12 – кабан).</p></pre> </div>
<form method="GET">
  Введите год (от 1950 до 2020): <input type="text" name="year"  /><br />
  <input style="margin-top: 10px; margin-bottom: 10px" type="submit" value="Отправить" />
</form>


<?
//Отримуэмо дані з форми
  if ( count($_GET) > 0 ) //--Якщо були прийняті дані з HTML-форми
  {
      $year = htmlspecialchars($_GET['year']);	//--Отримуємо перше число з GET-параметрів
      if($year<1950||$year>2020)echo"Вы ввели неправильный год";
          else{ 
switch ( ($year%12) ){
case 0: 
    echo "Год Обезьяны";
break;
case 1:
    echo "Год Петуха";
break;
case 2:
    echo "Год Собаки";
break;
case 3:
    echo "Год Свиньи";
break;
case 4:
    echo "Год Крысы";
break;
case 5:
    echo "Год Коровыи";
break;
        case 6:
    echo "Год Тигра";
break;
        case 7:
    echo "Год Зайца";
break;
        case 8:
    echo "Год Дракона";
break;
        case 9:
    echo "Год Змеи";
break;
        case 10:
    echo "Год Лошади";
break;
        case 11:
    echo "Год Овцы";
break;
default:
    echo "";
};
          }
  }
?>
    </body>
</html>