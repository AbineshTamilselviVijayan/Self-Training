class ai301
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,1,6,1,23,2};
		for (int i = 0;i<a.length;i++)
		{
			for (int j = i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					a[j] = -1;
				}
			}
		}
		for (int k = 0;k<a.length;k++)
		{
			if (a[k]!=-1)
			{
				System.out.print(a[k]+" ");
			}
		}
	}
}
