class pts12 
{
	public static void main(String[] args) 
	{
		int a = 8;
		for (int i = 0;i<a;i++)
		{
			for (int j = 0;j<a/2;j++)
			{
				if ((i>=j)&&(i+j<8))
				{
					System.out.print((i+1)+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}
	}
}
