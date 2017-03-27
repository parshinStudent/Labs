<html>
    <head><title>Лабораторная работа 3.1</title></head>
<body>
    <div><h2>Вариант 10.	Знайти добуток усіх натуральних непарних чисел від 51 до 77.</h2></div>
<?
    $answer=1;
	for ($i=51; $i<=77; $i++)
	{
        if($i%2!=0)$answer*=$i;
	};
    echo "Ответ: $answer";
?>
    </body>
</html>