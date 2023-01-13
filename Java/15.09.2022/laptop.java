class laptop
{
	String brand;
	double price;
	byte ram;
	int rom;
	laptop()
	{
		System.out.println("There is no input found");
	}
	laptop(String ch)
	{
		this.brand = brand;
	}
	laptop(double y)
	{
		this.price = price;
	}
	laptop(byte a)
	{
		this.ram = ram;
	}
	laptop(int b)
	{
		this.rom = rom;
	}
	public void spec()
	{
		System.out.println("This is all new "+brand+" series");
		System.out.println("Pricing starts at "+price);
		System.out.println("featured with "+ram+" GB and storage of "+rom);
	}
}
