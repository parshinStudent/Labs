<form method="GET">

<p>
    Задано три цілих числа. <br>
    Найбільше число перевірити на парність і якщо воно парне, то найменше з них замінити на квадрат третього, 
    <br>а якщо ні, то середнє за значенням подвоїти. 
    <br>На екран вивести відповідні коментарі з поясненням дій, початкові та кінцеві значення змінних.
    <p>
<pre>
  Введите первое число:  <input type="text" name="num1"  /><br />
  Введите второе число:  <input type="text" name="num2"  /><br />
  Введите третье число:  <input type="text" name="num3"  /><br />
 </pre>
  <input type="submit" value="Send" />
</form>

<?php
//ќтримуэмо дан≥ з форми
  if ( count($_GET) > 1 ) //--якщо були прийн¤т≥ дан≥ з HTML-форми
  {
      $num1 = htmlspecialchars($_GET['num1']);	
	  $num2 = htmlspecialchars($_GET['num2']);	  //--ќтримуЇмо друге число з GET-параметр≥в
	  $num3 = htmlspecialchars($_GET['num3']);
	  
      if($num1==null || $num2==null || $num3==null){}
      else
      {
  echo "num1 = $num1<br>";
  echo "num2 = $num2<br>";
  echo "num3 = $num3<br>";
  if($num1==max($num1,max($num2,$num3)))
  {
	if($num1%2==0)
	{
		echo "число num1 - максимальне та парне число<br>";
		if($num2==min($num2,min($num1,$num3)))
		{
			$num2=$num3*$num3;
			echo "число num2 - теперь равно квадрату числа num3 ($num3) = $num2 <br>";			
		}
		else
		{
			$temp = $num3;
			$num3=$num3*$num3;
			echo "„исло num3 - теперь равно квадрату числа num3 ($temp) = $num3 <br>";	
		}
		
	}
	else
	{
		echo "число num1 - максимальне та непарне число<br>";
		if($num2<$num1&&$num2>$num3)
		{
			$temp = $num2;
			$num2=$num2*2;
			echo "число num2 - среднее из трех и теперь равно num2($temp)*2 =$num2 <br>";
		}
		else
		{
			$temp = $num3;
			$num3=$num3*2;
			echo "число num3 - среднее из трех и теперь равно num3($temp)*2 =$num3 <br>";
		}
	}
  }
  elseif($num2==max($num1,max($num2,$num3)))
  {
	if($num2%2==0)
	{
		echo "число num2 - максимальне та парне число<br>";
		if($num1==min($num2,min($num1,$num3)))
		{
			$num1=$num3*$num3;
			echo "число num1 - теперь равно квадрату числа num3 ($num3) = $num1 <br>";			
		}
		else
		{
			$temp = $num3;
			$num3=$num3*$num3;
			echo "число num3 - теперь равно квадрату числа num3 ($temp) = $num3 <br>";	
		}
		
	}
	else
	{
		echo "число num2 - максимальне та непарне число<br>";
		if($num1<$num2&&$num1>$num3)
		{
			$temp = $num1;
			$num1=$num1*2;
			echo "число num1 - среднее из трех и теперь равно num1($temp)*2 =$num1 <br>";
		}
		else
		{
			$temp = $num3;
			$num3=$num3*2;
			echo "число num3 - среднее из трех и теперь равно num3($temp)*2 =$num3 <br>";
		}
	}
  }
  else //if($num3==max($num1,max($num2,$num3)))
  {
	if($num3%2==0)
	{
		echo "число num3 - максимальне та парне число<br>";
		if($num2==min($num2,min($num1,$num3)))
		{
			$num2=$num3*$num3;
			echo "число num2 - теперь равно квадрату числа num3 ($num3) = $num2 <br>";			
		}
		else
		{
			$temp = $num3;
			$num1=$num1*$num1;
			echo "число num1 - теперь равно квадрату числа num3 ($temp) = $num1<br>";	
		}
		
	}
	else
	{
		echo "число num3 - максимальне та непарне число<br>";
		if($num2<$num3&&$num2>$num1)
		{
			$temp = $num2;
			$num2=$num2*2;
			echo "число num2 - среднее из трех и теперь равно num2($temp)*2 =$num2 <br>";
		}
		else
		{
			$temp = $num1;
			$num1=$num1*2;
			echo "число num1 - среднее из трех и теперь равно num1($temp)*2 =$num1 <br>";
		}
	}
  }
      }
  }
?>