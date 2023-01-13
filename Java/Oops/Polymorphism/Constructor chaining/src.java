class src 
{
	src()
	{
		this(5);
		System.out.println("void");
	}
	src(int a)
	{
		this('c');
		System.out.println("Integer");
	}
	src(char v)
	{
		this("leo");
		System.out.println("Character");
	}
	src(String x)
	{
		System.out.println("The end");
	}
}
