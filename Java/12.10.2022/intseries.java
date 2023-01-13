class intseries
{
	public static void main(String[] args) 
	{
		int a = 0;
		int b = 0;
		for (int i = 0;i<=30;i++)
		{
			System.out.print((a+i)+"/"+((b+i)*(b+i))+" + ");
			a+=2;
		}
	}
}
