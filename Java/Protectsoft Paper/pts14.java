class pts14 
{
	public static void main(String[] args) 
	{
		int [] a = {3,10,50,25,6,9,123};
		int temp = 0;
		for (int i = 0;i<a.length;i++)
		{
			for (int j = i+1;j<a.length;j++)
			{
				if (fn(a[i])>fn(a[j]))
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
	public static int fn(int x)
	{
		int q = x;
		while (x>9)
		{
			x=x/10;
		}
		return x;
	}
}
