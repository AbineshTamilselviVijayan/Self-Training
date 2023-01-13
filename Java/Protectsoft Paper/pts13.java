class pts13
{
	public static void main(String[] args) 
	{
		int [] a = {3,2,4,5,3,8,9,5,3,1,8,4,6};
		for (int i = 0;i<a.length;i++)
		{
			if (a[i]%2==0)
			{
				a[i] = a[i]+1;
			}
			else
			{
				a[i] = a[i]-1;
			}
			System.out.print(a[i]+" ");
		}
	}
}
