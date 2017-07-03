<?
?>
<html>
<head>
<title>Форма входа</title>
</head>
    
    <body>    
    <form action="enter.php" name="Enter"  method="post" >
        <h1>Заполни форму</h1>
            <label for="login-field">Ваш логин</label>
            <input type="text" name="login" id="login-field">
            <br><br>
            <label for="password-field">Ваш пароль</label>
            <input type="password" name="password" id="password-field">
            <br><br>
            <input type=submit name="submit" value="Войти">
</form>
</body>
</html>