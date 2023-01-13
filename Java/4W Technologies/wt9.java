class wt9
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,5};
		int [] b = {3,6,7};
		int [] temp = new int [a.length];
		for (int i = 0;i<a.length;i++)
		{
			temp[i] = a[i];
			a[i] = b[i];
			b[i] = temp[i];
		}
		for (int j = 0;j<a.length;j++)
		{
			System.out.print(a[j]+",");
		}
		System.out.println();
		for (int k = 0;k<a.length;k++)
		{
			System.out.print(b[k]+",");
		}
	}
}
