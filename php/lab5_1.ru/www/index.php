<form method="GET">
    <title>Лаб. робота №5</title>
    <!--A(1,3), B(2,-5), C(-8,4)  S=35.5-->  
<h3>
    Задано координати трьох точок. <br>
    <h3 style="margin-left: 10px; padding-bottom:10px;">Разработайте форму, куда вводятся координаты трех точек. 
    <br>Файл по обработке данных должен вычислить расстояние между точками, полупериметр и 
    <br>площадь образованного треугольника. Расчеты должны быть выполнены с использованием пользовательских функций
    </h3>
</h3>
 <div>
 <div style="margin: 0 20 20 0; padding: 5 5 5;">
  Введите координаты первой точки треугольника    <br />
  Введите x1:  <input type="text" name="x1"  />       Введите y1:  <input type="text" name="y1" /><br />
     </div>
     <div style="margin: 0 20 20 0; padding: 5 5 5;">
  Введите координаты второй точки треугольника    <br />
  Введите x2:  <input type="text" name="x2"  />     Введите y2:  <input type="text" name="y2"  /><br />
     </div>
     <div style="margin: 0 20 20 0; padding: 5 5 5;">
  Введите координаты третьей точки треугольника    <br />
  Введите x3:  <input type="text" name="x3"  />     Введите y3:  <input type="text" name="y3"  /><br />
  <input type="submit" value="Отправить"  style="margin-top:20px;"/>
     </div>
 </div>
</form>

<?php
    function dlina($x,$y,$x1,$y1)
    {
        $d=sqrt( ($x1-$x)*($x1-$x) +($y1-$y)*($y1-$y) );
        return $d;
    }
    
    function polyP($a,$b,$c)
    {
        $o = ($a+$b+$c) /2;
        return $o;
    }

    function area($p,$a,$b,$c)
    {
        $s = sqrt($p*($p-$a)*($p-$b)*($p-$c));
        return $s;
    }
  if ( count($_GET) > 1 ) //--якщо були прийн¤т≥ дан≥ з HTML-форми
  {
      $x1 = htmlspecialchars($_GET['x1']);	$y1 = htmlspecialchars($_GET['y1']);	
	  $x2 = htmlspecialchars($_GET['x2']);	$y2 = htmlspecialchars($_GET['y2']);	 
	  $x3 = htmlspecialchars($_GET['x3']);	$y3 = htmlspecialchars($_GET['y3']);	
	  
      if($x1==null || $x2==null || $x3==null){ echo "Введите данные";}
      else
      {
          echo "
            <form method=\"post\">
            <input type=\"submit\" name=\"k1\" value=\"Растояние между точками\">
            </form>
            ";
          $dl1=dlina($x1,$y1,$x2,$y2);
          $dl2=dlina($x2,$y2,$x3,$y3);
          $dl3=dlina($x3,$y3,$x1,$y1);
          if(isset($_POST['k1']))
          {
              
              echo "Длина между первой и второй точкой :   $dl1 <br>";
              
              echo "Длина между второй и третьей точкой:  $dl2<br>";
              
              echo "Длина между третьей и первой точкой:  $dl3<br>";
          }
          
            echo "
            <form method=\"post\">
            <input type=\"submit\" name=\"k2\" value=\"Полупериметр\">
            </form>
            ";
          
            $p=polyP($dl1,$dl2,$dl3);
          if(isset($_POST['k2']))
          {
              echo "Полупериметр треугольника :   $p <br>";
          }
          
            echo "
            <form method=\"post\">
            <input type=\"submit\" name=\"k3\" value=\"Площадь\">
            </form>
            ";
          
            $s=area($p,$dl1,$dl2,$dl3);
          if(isset($_POST['k3']))
          {
              echo "Площадь треугольника :   $s <br>";
          }
  }
  }
?>