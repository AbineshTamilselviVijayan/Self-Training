class arrayclone 
{
	public static void main(String[] args) 
	{
		int[] a = {15,26,48,59,37};
		int[] b = new int[a.length];
		for (int i = 0;i<a.length;i++)
		{
			b[i] = a[i];
		}
		for (int j = 0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
	}
}
