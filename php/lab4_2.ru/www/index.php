<html>
    <head><title> Лабораторная робота 4 </title></head>
    <body>
    
    <div>
        <h1>Задание 2</h1>
        <p> Вариант10.<br>	10.	Дано масив дійсних чисел. Підрахувати, скільки в масиві зустрічається максимальне число.</p>
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

$max=-10;
foreach ($nums as $k=>$val)					
{
	if ($val>$max)
	{
        $max=$val;
	};
};

echo " Максимальный элемент в массиве: $max <br>";
        
$kol=0;
foreach ($nums as $k=>$val)					
{
	if ($val==$max)
	{
        $kol++;
	};
};
echo " Количество максимальных элементов в массиве: $kol <br>";
        
echo "<br><h2>Виводимо всі елементи масиву</h2> <table border=’1’> <tr><td><strong>Номер елементу </strong> </td> <td> <strong> Значення елементу </strong></td></tr>";
foreach ($nums as $k=>$val)
{
	echo "<tr><td>$k</td><td><strong>$val</strong></td></tr>";
};
echo "</table>";
?>
    </body>
</html>