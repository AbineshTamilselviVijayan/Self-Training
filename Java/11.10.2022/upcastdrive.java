class upcastdrive
{
	public static void main(String[] args) 
	{
		A ref = new E();
		E ref = new A();
		System.out.println(ref.a);
//		System.out.println(ref.b);//
//		System.out.println(ref.c);//
//		System.out.println(ref.d);//
//		System.out.println(ref.e);//
//		System.out.println(ref.f);//

		System.out.println(ref instanceof ref.f);
	}
}
//error 007