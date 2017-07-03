  <?
              if(isset($_GET['enter1'])){
// Открыть текстовый файл
$f = fopen("./contex.txt","w");
// Записать текст
fwrite($f, $_GET['dor']); 
// Закрыть текстовый файл
fclose($f);
}
?>
<html>
<head>
<title>Форма входа</title>
</head>
    <body>    
        <p>Данные успешно обновлены </p><a href="index.php">Проверить</a>

</body>
</html>