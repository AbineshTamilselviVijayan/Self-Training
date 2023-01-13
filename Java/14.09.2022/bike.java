class bike
{
	static
	{
		System.out.println("Welcome to the advanced motors");
	}
	String model = "revolt";
	double price = 125000;
	String colour = "green";
	int maxspeed = 85;
	int minspeed = 40;
	bike()
	{
		this(1);
		System.out.println("I can run like "+maxspeed+" KM/Hr");
	}
	bike(int a)
	{
		this(true);
		System.out.println("i can walk like "+minspeed+" KM/Hr");
	}
	bike(boolean y)
	{
		this("Leo");
		System.out.println("Model of bike is "+model);
	}
	bike(String ch)
	{
		this(76.8);
		System.out.println("Offroad price "+price);
	}
	bike(double m)
	{
		System.out.println("Colour varient : "+colour);
	}
}
