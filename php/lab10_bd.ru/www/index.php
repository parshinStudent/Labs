<?php

require "database.php";
$db=new database("database.txt");
$posts=$db->LoadPosts();
require "index.view.php";

?>