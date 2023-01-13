class str1 
{
	public static void main(String[] args) 
	{
		String s = "Hi i'am fine";
		String [] x = s.split("");
		for (int i = x.length-1;i>=0;i--)
		{
			System.out.print(x[i]);
		}
	}
}
