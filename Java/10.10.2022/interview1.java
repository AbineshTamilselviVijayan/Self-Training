class interview1
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 10;
		for (int i = 1;i<=a;i++)
		{
			for (int j = 1;j<=b;j++)
			{
				if ((i+j<=6)||(j-i>=5))
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
