class interview 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 10;
		for (int i = 0;i<a;i++)
		{
			for (int j = 0;j<b;j++)
			{
				if ((i+j<5)||(j-i>=5))
				{
					System.out.print("* ");
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
