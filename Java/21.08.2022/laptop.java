class laptop 
{
	public static void main(String[] args) 
	{
		String brand = "DELL";
		String model = "Inspiron 15 7577";
		int $ = 96000;
		double price = $;
		String os = "Win 10 Home";
		String processor = "Intel i7 7th Gen";
		String graphics1 = "Intel 630 UHD";
		int vram1 = 8;
		String graphics2 = "Nvidia GTX 1060 Max-Q";
		int vram2 = 6;
		int ram = 16;
		int HDD = 918;
		int SSD = 256;
		float base_clock = 2.81f;
		float boost_clock = 3.8f;
		System.out.println(brand+" "+model);
		System.out.println("Buy now : "+price+"/-");
		System.out.println("\tSystem Configurations");
		System.out.println("Ram : "+ram+" GB");
		System.out.println("Operating System : "+os);
		System.out.println("Storage : "+SSD+" "+"GB"+" "+HDD+" "+"GB");
		System.out.println("Dedicated Graphics : "+graphics1);
		System.out.println("Capacity : " +vram1+" "+"GB");
		System.out.println("Integrated Graphics : "+graphics2);
		System.out.println("Capacity : "+vram2+" "+"GB");
		System.out.println("Base frequency : "+base_clock+" "+"Ghz");
		System.out.println("Boost frequency : "+boost_clock+" "+"Ghz");
	}
}

