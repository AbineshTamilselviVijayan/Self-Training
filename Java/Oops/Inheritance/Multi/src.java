class A
{
	int a = 10;
	public void leo()
	{
		System.out.println("A");
	}
}
class B extends A
{
	int b = 20;
	public void leo1()
	{
		System.out.println("B");
	}
}
class C extends B
{
	int c = 30;
	public void leo2()
	{
		System.out.println("C");
	}
}