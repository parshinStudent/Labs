<?php
class database{ 
	protected $file; 
	public function_construct($filename = 'database.txt')
	{ 
		$this->file = $filename; 
	} 
	public function LoadPosts()
	{ 
		$data = file_get_contents($this->file); 
	} 

	public LoadPosts()
	{
		$data=file_get_contents($this->file);
		if($data)
		{
			$data=explode(':',$data);
			//['Post1|content1','Post2|content2']
			if($data)
			{
				$data=array_map(function($element){
				return explode('|',$element);
			},$data);
			}
			return $data;
		}
	}
}
?>

