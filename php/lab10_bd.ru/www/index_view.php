

<!doctype HTML>
	<html>
		<head>
			<title>Blog</title>
		</head>
		<body>
			<?php if($posts):?>
				<?php foreach($posts as $post):?>
					<article>
						<h1><?php echo $post[0];?></h1>
						<p><?php echo $post[1];?></p>
					</article>
				<?php end foreach ?>
				<?php end if ?>
		</body>
	</html>
		