class test3
{
	public static void main(String[] args) 
	{
		//byte > long
		byte a = 1;
		long b = a;
		System.out.println(b);
		long c = 127;
		byte d = (byte)c;
		System.out.println(d);//long > byte
	}
}
