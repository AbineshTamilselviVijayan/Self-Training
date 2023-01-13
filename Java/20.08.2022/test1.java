class test1 
{
	public static void main(String[] args) 
	{
		//byte > short
		byte a = 12;
		short b = a;
		System.out.println(b);
		short c = 10;
		byte d = (byte)c;
		System.out.println(d);//short > byte
	}
}
