<!-- Виводимо на екран форму-->
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Лабораторная работа 2.3</title>
    </head>
<body>
    <h1>Задание 3</h1>
    <div style="margin-bottom: 10px"><pre><p style="font-size: 15px">Обчислити значення функції F залежно від значень сталих a, b, с, та змінної x.</p></pre> 
    <img src="lab2_3.png">
    </div>
<form method="GET">
    <div style="margin-top: 10px">Введите год a: <input style="margin-left: 5px;"type="text" name="a"  /><br /></div>
    <div style="margin-top: 10px">Введите год b: <input style="margin-left: 4px;"type="text" name="b"  /><br /></div>
    <div style="margin-top: 10px">Введите год c: <input style="margin-left: 5px;"type="text" name="c"  /><br /></div>
    <div style="margin-top: 10px">Введите год x: <input style="margin-left: 4px;"type="text" name="x"  /><br /></div>
  <input style="margin-top: 10px; margin-bottom: 10px" type="submit" value="Отправить" />
</form>


<?
//Отримуэмо дані з форми
  if ( count($_GET) > 0 ) //--Якщо були прийняті дані з HTML-форми
  {
      $a = htmlspecialchars($_GET['a']);	//--Отримуємо перше число з GET-параметрів
      $b = htmlspecialchars($_GET['b']);
      $c = htmlspecialchars($_GET['c']);
      $x = htmlspecialchars($_GET['x']);
      
      $answer;
      if($x<3 && $b!=0)
      {
          $answer= $a*($x*$x) - ($b*$x) + $c;
      }elseif(x>3 && b==0)
      {
          $answer=($x-$a)/($x-$c);
      }
      else
      {
          $answer= $x/$c;
      }
      
      echo "F:= $answer";
  }
?>
    </body>
</html>