class wt7//non repeative
{
	public static void main(String[] args) 
	{
		int [] a = {7,9,1,3,4,5,6,3,6};
		for (int i = 0;i<a.length-1;i++)
		{
			for (int j = i+1;j<a.length;j++)
			{
				if ((a[i]==a[j])&&(a[i]!=00))
				{
					a[j] = 00;
					a[i] = 00;
				}
			}
			if (a[i]!=00)
			{
				System.out.print(a[i]+", ");
			}
		}
	}
}
