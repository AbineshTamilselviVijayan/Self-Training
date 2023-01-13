class wt4
{
	public static void main(String[] args) 
	{
		String a = "this is a string";
		char [] b = a.toCharArray();
		int count = 0;
		for (int i = 0;i<b.length-1;i++)
		{
			if ((b[i]=='i')&&(b[i+1]=='s'))
			{
				count++;
			}
		}
		System.out.println("is occurs "+count+" times");
	}
}
