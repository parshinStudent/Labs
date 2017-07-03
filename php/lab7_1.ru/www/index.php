<?php 
    global $cc1,$cc2,$cc3;
    if($_GET["file"] == "first.php")
    {
        $file1 = fopen("./files/first.php","r+");
        $c = fgets($file1,1024);
        fclose($file1);
        $c++;
        $cc1=$c;
        $file1 = fopen("./files/first.php","w+");
        fputs($file1,$c); // записываем значение 
        fclose($file1); // закрываем файл 
        header("Location: ./files/first.php");
        exit;
    }
    if($_GET["file"] == "second.php")
    {
        $file1 = fopen("./files/second.php","r+");
        $c = fgets($file1,1024);
        fclose($file1);
        $c++;
        $cc2=$c;
        $file1 = fopen("./files/second.php","w+");
        fputs($file1,$c); // записываем значение 
        fclose($file1); // закрываем файл 
        header("Location: ./files/second.php");
        exit;
    }
    if($_GET["file"] == "third.php")
    {
        $file1 = fopen("./files/third.php","r+");
        $c = fgets($file1,1024);
        fclose($file1);
        $c++;
        $cc3=c;
        $file1 = fopen("./files/third.php","w+");
        fputs($file1,$c); // записываем значение 
        fclose($file1); // закрываем файл 
        header("Location: ./files/third.php");
        exit;
    }
    ?>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html";>
    <title>Работа с файлами</title>
    <style>
body {
    font-size: 20px;
  }
        input{font-size: 16px;}
</style>
</head>

<body>
    <h1> Лабораторная робота №6</h1>
    <h2>Практическое задание</h2>
    <p>
    Создайте папку files в своей директории. В ней создайте 3 файла first.php, second.php, third.php. <br>
    Составьте программу вывода сортированного списка файлов из папки files. 
    <br>При нажатии на каждый файл выводит счетчик посещений данного файла.
    </p>
    
    


<form method="POST">
<?php
    $i = 0;    
    if ($handle = opendir('./files/')) {
    echo "Файлы в папке files:<br>";
        
    /* Именно этот способ чтения элементов каталога является правильным. */
    while (false !== ($file = readdir($handle))) { 
        if($file!='.' && $file!='..')
        {
            //echo "<a href=\"index.php?file=$file\">$file<a><br>";
            $func[$i]=$file;
            
            $i++;
        }
    }
        closedir($handle); 
    }
    sort($func);
    
    for($q = 0; $q<sizeof($func); $q++)
    {
        echo "<br> <a href=\"index.php?file=$func[$q]\">$func[$q]<a><br>";
        $file = fopen("./files/$func[$q]","r+");
        $c = fgets($file);
        fclose($file);
        
        //echo "&nbsp;&nbsp;Количество посещений: $c<br>";
    }
?>  
</form>   
  
   <?
    if ($_POST['Func'] == "first.php") // проверяем нажатие кнопки 
    { 
        $file1 = fopen("./files/first.php","r+");
        $c = fgets($file1,1024);
        fclose($file1);
        $c++;
        $file1 = fopen("./files/first.php","w+");
        fputs($file1,$c); // записываем значение 
        fclose($file1); // закрываем файл 
    }
    
    if ($_POST['Func'] == "second.php") // проверяем нажатие кнопки 
    { 
        $file2 = fopen("./files/second.php","r");
        $c2 = fgets($file2,1024);
        fclose($file2);
        $c2++;
        $file2 = fopen("./files/second.php","w+");
        fputs($file2,$c2); // записываем значение 
        fclose($file2); // закрываем файл 
    }
    if ($_POST['Func'] == "third.php") // проверяем нажатие кнопки 
    { 
        $file = fopen("./files/third.php","r+");
        $c = fgets($file,1024);
        fclose($file);
        $c++;
        $file = fopen("./files/third.php","w+");
        fputs($file,$c); // записываем значение 
        fclose($file); // закрываем файл 
    }   
?>
</body>
</html>