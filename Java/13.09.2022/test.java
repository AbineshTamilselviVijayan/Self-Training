class test 
{
	static int a =5;
	static{
		int a = 10;
		System.out.println("Hi SMLI");
		System.out.println(test.a);
	}
	{
		System.out.println("Hi I'am MLSI "+a);
	}
	test()
	{
	}
	test(boolean g)
	{
		System.out.println(g);
	}
	int b = 10;
	String s = "Java";
	public void demo(String s)
	{
		System.out.println("Hi i'm demo");
	}
	public static void main(String[] tabbu)
	{
		test t = new test(true);
		System.out.println(t);
	}
}
