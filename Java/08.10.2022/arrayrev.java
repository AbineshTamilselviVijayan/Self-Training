class arrayrev 
{
	public static void main(String[] args) 
	{
		int [] a = {10,20,30,40,50};
		int [] b = new int [a.length];
		int temp = 0;
		for (int i = 0,j = a.length-1;i<a.length;i++,j--)
		{
			b[j] = a[i];
		}
		for (int k = 0;k<b.length;k++)
		{
			System.out.print(b[k]+", ");
		}
	}
}
