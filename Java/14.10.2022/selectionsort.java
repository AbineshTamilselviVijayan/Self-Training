class selectionsort 
{
	public static void main(String[] args) 
	{
		int temp = 0;
		int [] a = {15,59,48,26,75,53,42,86};
		int index = 0;
		for (int i = 0;i<a.length;i++)
		{
			index = i;
			for (int j = i+1;j<a.length;j++)
			{
				if (a[index]>a[j])
				{
					index = j;
				}
				temp = a[i];
				a[i] = a[index];
				a[index] = temp;
			}
			System.out.print(a[i]+" ");
		}
	}
}
