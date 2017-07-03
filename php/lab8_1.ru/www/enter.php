<?
if (isset($_POST['login'])) { $login = $_POST['login']; if ($login == '') { unset($login);} } //заносим введенный пользователем логин в переменную $login, если он пустой, то уничтожаем переменную
    if (isset($_POST['password'])) { $password=$_POST['password']; if ($password =='') { unset($password);} }
    $login = stripslashes($login);
    $login = htmlspecialchars($login);
    $password = stripslashes($password);
    $password = htmlspecialchars($password);
    

if($login!='admin' && $password!='password')
{
            echo "<h1>Sorry</h1>";
            echo "<img src=access_denied.png>";
}
else
{
    $files = file('./contex.txt');
    
    echo "<form method='GET' action=\"rewrite.php\">";
    echo '<textarea name="dor" rows="30" cols="100">';
    foreach ($files as $line) {echo $line;}
    echo '</textarea>';
    echo "<br><input type='submit' name='enter1' value='Обновить'> </form>";
    
if(isset($_GET['enter1'])){
// Открыть текстовый файл
$f = fopen("./contex.txt","w");
// Записать текст
fwrite($f, $_GET['dor']); 
// Закрыть текстовый файл
fclose($f);
}
}
?>