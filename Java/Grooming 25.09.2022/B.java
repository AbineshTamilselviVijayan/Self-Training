class B extends A
{
	public static void main(String[] args) 
	{
		A ref = new A();
		System.out.println(ref);
		System.out.println(ref.a);
		System.out.println(ref.b);
		ref.run();
		ref.stop();
	}
}
