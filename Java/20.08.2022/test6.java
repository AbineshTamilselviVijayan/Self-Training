class test6 
{
	public static void main(String[] args) 
	{
		//short > long
		short a = 10000;
		long b = a;
		System.out.println(b);
		long c = 1000;
		short d = (short)c;
		System.out.println(d);//long > short
	}
}
