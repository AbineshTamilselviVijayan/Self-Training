class s2 
{
	static int b = 14;
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
	static
	{
		test(b);
		System.out.println("SMLI");
	}
	public static int test(int a)
	{
		System.out.println(a);
		System.out.println("test method");
		return a;
	}
}
