class str2
{
	public static void main(String[] args) 
	{
		String a = "aaabbaac";
		int temp = 0;
		String [] b = a.split("");
		int count = 1;
		try
		{
			for (int i = 0;i<b.length;i++)
			{
			int j = i+1;
			if ((b[i]).equals(b[j]))
			{
				count++;
			}
			else
			{
				System.out.println(b[i]+" = "+count);
				count = 1;
			}
			}
		}
		catch (Exception e)
		{
			System.out.println(b[b.length-1]+" = "+count);
		}
	}
}
