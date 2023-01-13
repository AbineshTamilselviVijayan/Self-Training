class wt6
{
	public static void main(String[] args) 
	{
		int [] a = {1,3,3,5};
		int [] b = {2,4,6,6};
		int [] c = new int [a.length+b.length];
		for (int i = 0;i<c.length;i++)
		{
			if (i<a.length)
			{
				c[i] = a[i];
			}
			else
			{
				c[i] = b[i-a.length];
			}
			System.out.print(c[i]+", ");
		}
	}
}
