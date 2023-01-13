class car
{
	car()
	{
		this("BMW");
		System.out.println("Welcome to car show");
	}
	car(String a)
	{
		this(150000);
		System.out.println("The model displayed here is "+a);
	}
	car(double p)
	{
		this('x');
		System.out.println("The estimated cost is "+p);
	}
	car(char b)
	{
		System.out.println("The colour varients are "+b);
	}
}
