class s2
{
	public static void main(String[] args) 
	{
		int [] a = {1,1,2,3,4,5,4,2};
		int count = 1;
		for (int i = 0;i<a.length-1;i++)
		{
			count = 1;
			for (int j = i+1;j<a.length;j++)
			{
				if ((a[i]==a[j])&&(a[i]!=-1))
				{
					count++;
					a[j] = -1;
				}
			}
			if (a[i]!=-1)
			{
				System.out.println(a[i]+" - "+count+" times");
			}
		}
	}
}
