class mobile
{
	String brand;
	double price;
	byte ram;
	int rom;
	mobile()
	{
		System.out.println("There is no input found");
	}
	mobile(String ch)
	{
		this.brand = brand;
	}
	mobile(double y)
	{
		this.price = price;
	}
	mobile(byte a)
	{
		this.ram = ram;
	}
	mobile(int b)
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
