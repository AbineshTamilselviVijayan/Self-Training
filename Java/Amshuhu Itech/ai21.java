class ai21
{
	public static void main(String[] args) 
	{
		int [] a = {21,41,43,15,30,55,44,33,22,56};
		for (int i = 0;i<a.length;i++)
		{
			if ((isodd(a[i]))&&(issame(a[i])))
			{
				System.out.print(a[i]+",");			
			}
		}
	}
	public static boolean issame(int q)
	{
		int w = q;
		int last = w%10;
		while (w>9)
		{
			w=w/10;
		}
		int first = w;
		if (first==last)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isodd(int x)
	{
		int y = x;
		if (y%2!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
