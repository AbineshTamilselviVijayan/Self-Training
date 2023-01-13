class bubblesort 
{
	public static void main(String[] args) 
	{
		int [] a = {15,59,48,26,75,53,42,86};
		int temp = 0;
		for (int i = 0;i<a.length-1;i++)
		{
			for (int j = i+1;j<a.length-1;j++)
			{
				if (a[i]>a[j])
				{
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int k = 0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}
}
