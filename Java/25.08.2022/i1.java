class i1
{
	public static void main(String[] args) 
	{
		int a = 5;
		System.out.println(a++);
		a = a + ++a;
		System.out.println(++a);
		int res = (a + ++a) + ++a;
		System.out.println(res + ++res);
	}
}
