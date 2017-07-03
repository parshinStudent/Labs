<html>
<head>
<meta http-equiv="Content-Type" content="text/html";>
    <title>Калькулятор</title>
</head>

<body>
<?
    $action;
    function show()
    {
        $GLOBALS[action];
    ?>

<Form method = GET action="index.php" >
   <input type="text" name="first" value=1>
   <input type="text" name="second" value=1>
   <select size="1" name="action">
       <option value="sum">Сложить</option>
       <option value="min">Вычесть</option>
       <option value="mult">Умножить</option>
       <option value="dev">Разделить</option>
       <option value="stepen">Возвести в степень</option>
       <option value="procent">Процент от числа</option>
       <option value="koren">Корень</option>
       <option value="sin">Синус</option>
       <option value="cos">Косинус</option>
       <option value="tan">Тангекс</option>
       <option value="kotan">Котангенс</option>
   </select>
   <br><br> <input type = "submit" value="Выполнить">
</Form>
<?php
       $GLOBALS[action] = htmlspecialchars($_GET["action"]);
       $GLOBALS[first] = htmlspecialchars($_GET["first"]);
       $GLOBALS[second] = htmlspecialchars($_GET["second"]);
}
   function calc()
   {
       global $result, $first, $second;
       /*
       echo "calc: $GLOBALS[action] <br>";
       echo "first: $first  second: $second <br>";
       */
       switch($GLOBALS[action])
       {
           case "sum" : $result = $first+$second; echo "$first + $second = $result <br>"; break;
           case "min" : $result = $first-$second; echo "$first - $second = $result <br>"; break;
           case "mult" : $result= $first*$second; echo "$first * $second = $result <br>"; break;
           case "dev" :
               if(!$second)
               {    exit("Извините, программа не может выполнить действие: на ноль делить нельзя"); }
               $result = $first/$second; 
               echo "$first / $second = $result <br>";
               break;
           case "procent" : $result = $first*($second/100); echo "$first % $second = $result <br>";break;
           case "stepen" : $result = pow($first,$second); echo "$first ^ $second = $result <br>"; break;
           case "koren" : $result = pow($first,0.5); echo "sqrt($first) = $result <br>"; break;
           case "sin" : $result = sin(deg2rad($first)); echo "sin($first) = $result <br>"; break;
           case "cos" : $result = cos(deg2rad($first)); echo "cos($first) = $result <br>"; break;
           case "tan" : $result = tan(deg2rad($first)); echo "tan($first) = $result <br>"; break;
           case "kotan" : $result = atan(deg2rad($first)); echo "atan($first) = $result <br>"; break;
       }
       //echo "res: $result\n";
?>

    <?php
   }
    echo "<h3>Задание: Дополните наш калькулятор еще тригонометрическими функциями (php функции sin(), cos(), tan(), котангенс - 1/tan() ).</h3><br>";
    
    show();
    
    if($GLOBALS[action]!=null && $GLOBALS[first]!=null && $GLOBALS[second]!=null )calc();    
?>
    </body>
</html>