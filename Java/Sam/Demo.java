class Demo 
{
	int a = 20;
	public static void test()
	{
		Demo d = new Demo();
		System.ou.println(d.a);
	}
	
	@override
		public int hashCode()
	{
		return a;
	}
	public static void main(String[] args) 
	{
		Demo a = new Demo();
		Demo a1 = new Demo();
		System.out.println(a.hashCode()--a1.hashCOde());
		System.out.println(a.equals(a));
	}
}
