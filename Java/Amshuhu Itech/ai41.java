class ai41
{
	public static void main(String[] args) 
	{
		String a = "abcdABCDabcd";
		String [] b = a.split("");
		int count = 1;
		for (int i = 0;i<b.length-1;i++)
		{
			count = 1;
			for (int j = i+1;j<b.length;j++)
			{
				if ((b[i]).equals(b[j]))
				{
					count++;
					b[j]="";
				}
			}
			if (!((b[i]).equals("")))
			{
				System.out.print(b[i]+"="+count+", ");
			}
		}
	}
}