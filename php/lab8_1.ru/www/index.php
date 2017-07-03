<html>
<head>
<meta http-equiv="Content-Type" content="text/html";>
    <title>Стартовая страница</title>
    <STYLE>
 .menu {
     background-color:RGB(249, 201, 16);
     border: 1px solid black;
     padding: 10px;
     top: 0px;
     
        }
        
.centerColumn {
     border: 1px solid black;
        }
</STYLE>
</head>


<body>
   <table valign=top width="1024" border="1px solid black" align="center">
	<tr cellpadding="5" cellspacing="5" >
		<td valign=top width="200" height=800>
                  <div class="menu"  align=center>Меню</div>
                  
                  <form align=center action="login.php" method="post" >
                  <br><br><input align=center type="submit" value="Обновить содержимое"><br>
                  </form>
		</td>
		
		<td valign=top width="600" h>
		<div class="menu"  valign=top align=center >Содержание</div>
		
            <?php
            $homepage = file_get_contents('./contex.txt');
            echo $homepage;
            ?>
		</td>
		
		<td valign=top width="200">
            <div v class="menu" valign=top align=center>Новости</div>
		</td>
	</tr>
</table>
    <div  valign=top width="600" style="padding-top: 10px;" border="1px solid black" align="center">All rights reserved ParshinCorp 2017(c)</div>
</body>
</html>