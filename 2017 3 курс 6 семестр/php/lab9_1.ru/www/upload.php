<html>
<head>
  <title>Результат загрузки файла</title>
</head>
<body>
<?php
    function get_filesize($file)
{
    if(!file_exists($file)) return "Файл  не найден";

  $filesize = filesize($file);

if($filesize > 1024){
$filesize = ($filesize/1024);
    if($filesize > 1024){
    $filesize = ($filesize/1024);
        if($filesize > 1024) {
        $filesize = ($filesize/1024);
        $filesize = round($filesize, 1);
        return $filesize." ГБ";       
        } else {
        $filesize = round($filesize, 1);
        return $filesize." MБ";   
        }       
    } else {
    $filesize = round($filesize, 1);
    return $filesize." Кб";   
    }  
    } else {
    $filesize = round($filesize, 1);
    return $filesize." байт";   
    }
}
    
   // Проверяем загружен ли файл
   if(is_uploaded_file($_FILES["filename"]["tmp_name"]))
   {
     // Если файл загружен успешно, перемещаем его
     // из временной директории в конечную
     move_uploaded_file($_FILES["filename"]["tmp_name"], "./files/".$_FILES["filename"]["name"]);
       echo "<div>Файл успешно загружен</div>";
       
            $i = 0;    
            if ($handle = opendir('./files/')) {  
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
       
       echo "<h2>Файлы в папке</h2> 
       <table border=’1’> 
       <tr><td><strong>№</strong></td> 
       <td><strong> Имя файла </strong></td>
       <td><strong> Размер файла </strong></td>
       </tr>";
       
           for($q = 0; $q<sizeof($func); $q++)
        {
               $size =  get_filesize("./files/$func[$q]");
               // filesize("./files/$func[$q]");
        echo "<tr><td>$q</td><td>$func[$q]</td><td>$size</td></tr>";
        }
       echo "</table>";
   } else {
      echo("Ошибка загрузки файла");
   }
?>
</body>
</html>