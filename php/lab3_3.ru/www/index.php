<!-- Виводимо на екран форму-->
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Лабораторная работа 3.3</title>
    </head>
<body>
    <h1>Задание 3</h1>
    <div>
    <p style="font-size: 20px">Вариант 10.<br>	
        1.Дано дійсне а і натуральне n. Обчислити: y=a(a-n)(a-2n)(a-3n)…(a-n<sup>2</sup>)
    </p></div>
<form method="GET">
         <div>Введите a : <input type="text" name="a"  /><br /></div>
         <div>Введите n : <input type="text" name="n"  /><br /></div>
  <input style="margin-top: 10px; margin-bottom: 10px" type="submit" value="Отправить" name="z1" />
</form>


<?
//Отримуэмо дані з форми
  if (isset($_GET['z1']))
  {
if ( count($_GET) > 0 ) //--Якщо були прийняті дані з HTML-форми
  {
      $a = htmlspecialchars($_GET['a']);	//--Отримуємо перше число з GET-параметрів
      $n = htmlspecialchars($_GET['n']);
      
      $sum=$a;
      $temp=1;
      $i=1;
      
      while( ($i*$n) <= ($n*$n))
      {
          $temp=($a-($i*$n));
          $sum*=$temp;
          $i++;
      }
      echo "Добуток ряду: <strong>$sum</strong>";
  }
}
?>
     
      <div style="margin-top: 50px">
      <img src="lab3_3.png">
      </div>
      
<form method="GET">
         <div>Введите x : <input type="text" name="x"  /><br /></div>
         <div>Введите n : <input type="text" name="n1"  /><br /></div>
  <input style="margin-top: 10px; margin-bottom: 10px" type="submit" value="Отправить" name="z2">
</form>

<?
if (isset($_GET['z2']))
  {
if ( count($_GET) > 0 ) //--Якщо були прийняті дані з HTML-форми
  {
      $x = htmlspecialchars($_GET['x']);	//--Отримуємо перше число з GET-параметрів
      $n1 = htmlspecialchars($_GET['n1']);
      
      $number1=2;     
      $number2=3;

      $sum=0;
      if($x!=null && n1!=null)
      {
      while($number1!=$n1)
      {
          $numerator=$x-$number1;
          $denominator=$x+$number2;
          
          $temp=$numerator / $denominator;
          
          $sum+=$temp;
          
          $number1++;
          $number2++;
          //echo "$number1  || $x <br>";
      }
      echo "Сумма ряду: <strong>$sum</strong>";
      }
  }
}
?>
   
</body>
</html>