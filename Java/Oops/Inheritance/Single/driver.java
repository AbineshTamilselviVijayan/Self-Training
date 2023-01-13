class driver 
{
	public static void main(String[] args) 
	{
		A ref = new B();
		B ref1 = (B)ref;
		System.out.println(ref1.a);
		System.out.println(ref1.b);
		ref1.leo();
		ref1.leo1();
	}
}
