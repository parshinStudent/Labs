<html>
    <head><title> Лабораторная робота 4 </title></head>
    <body>
    
    <div>
        <h1>Задание 1</h1>
        <p> Вариант10.<br>	Дано масив дійсних чисел. Вивести на екран елементи, які не є точними квадратами та обчислити їх кількість.</p>
        </div>
<form method="GET">
     Введіть кількість елементів масиву: <input type="text" name="n"  /><br />
    <input type="submit" value="Отправить" />
</form>




<?
  if ( count($_GET) > 0 )  {
	  $n = htmlspecialchars($_GET['n']);	
  };
$kol=0;								
$nums=array();							
for ($i=1;$i<=$n;$i++)						
{
	$temp=mt_rand(-100, 100);		
    $nums[]=$temp*0.01;
};

foreach ($nums as $k=>$val)					
{
	if ($val!=(sqrt($val)*sqrt($val)))
	{
				echo "Елемент $val: не точний квадрат <br>";
				$kol++;
	};
};
echo " Количество неточных квадратов $kol <br>";
echo "<br><h2>Виводимо всі елементи масиву</h2> <table border=’1’> <tr><td><strong>Номер елементу </strong> </td> <td> <strong> Значення елементу </strong></td></tr>";
foreach ($nums as $k=>$val)
{
	echo "<tr><td>$k</td><td><strong>$val</strong></td></tr>";
};
echo "</table>";
?>
    </body>
</html>