class ai203
{
	public static void main(String[] args) 
	{
		String a = "Hello world";
		String [] b = a.split("");
		for (int i = b.length-1;i>=0;i--)
		{
			System.out.print(b[i]);
		}
	}
}
