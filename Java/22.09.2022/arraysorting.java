class arraysorting 
{
	public static void main(String[] args) 
	{
		int temp = 0;
		int[] a = {1,5,9,3,4,7,8,6,2,0};
		for (int i = 0;i<a.length;i++)
		{
			for (int j = i+1;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int  k = 0;k<a.length;k++)
		{
			System.out.print(a[k]+", ");
		}
		
	}
}
