class arrayass 
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,5};
		int [] b = {6,7,8,9,10};
		int x = 0;
		int y = b.length-1;
		int [] c = new int [(a.length/2)+(b.length/2)];
		for (int i = 0;i<c.length;i++)
		{
			if (i<(c.length/2))
			{
				c[i] = a[x];
				x++;
			}
			else if (i>=(b.length/2))
			{
				c[i] = b[y];
				y--;
			}
			System.out.print(c[i]+" ");
		}
	}
}
