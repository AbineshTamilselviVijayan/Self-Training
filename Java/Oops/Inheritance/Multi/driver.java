class driver 
{
	public static void main(String[] args) 
	{
		A ref = new C();
		C ref1 = (C)ref;
		System.out.println(ref1.a);
		System.out.println(ref1.b);
		System.out.println(ref1.c);
		ref1.leo();
		ref1.leo1();
		ref1.leo2();
	}
}
