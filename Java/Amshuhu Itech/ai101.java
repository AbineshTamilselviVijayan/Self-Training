class ai101
{
	public static void main(String[] args) 
	{
		int a = 5;
		int k = 1;
		int l = a;
		for (int i = 0;i<a;i++)
		{
			if (i<=(a)/2)
			{
				for (int j = 0;j<k;j++)
				{
					System.out.print("* ");
				}
				k+=2;
			}
			else if (i>a/2)
			{
				l-=2;
				for (int j = 0;j<l;j++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}