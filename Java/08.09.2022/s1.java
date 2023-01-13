class s1
{
	static int a = 14;
	static 
	{
		System.out.println("Hello World!");
		int a = 15;
		System.out.println(a);
		System.out.println(s1.a);
	}
	public static void main(String[] args)
	{
		System.out.println("Hello World");
	}
}
