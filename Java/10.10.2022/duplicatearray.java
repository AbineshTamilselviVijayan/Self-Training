class duplicatearray 
{
	public static void main(String[] args) 
	{
		int [] a = {12,5,6,12,5,8,9,10,23};
		for (int i = 0;i<a.length;i++)
		{
			int rad = 0;
			int n = 0;
			for (int j = i;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					n++;
				}
			}
//			System.out.println(n);
			if (n>1)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}
