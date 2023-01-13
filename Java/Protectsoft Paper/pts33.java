class pts33 
{
	public static void main(String[] args) 
	{
		for (int i = 1;i<=500;i++)
		{
			if (isamstrong(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isamstrong(int a)
	{
		int b = a;
		int c = a;
		int d = a;
		int count = 0;
		while (c>0)
		{
			count++;
			c=c/10;
		}
		int temp = 0;
		int m = 1;
		int sum = 0;
		while (d>0)
		{
			m = 1;
			temp = d%10;
			for (int i = 1;i<=count;i++)
			{
				m*=temp;
			}
			sum+=m;
			d=d/10;
		}
		if (sum==b)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
