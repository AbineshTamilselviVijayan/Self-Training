class s1
{
	public static void main(String[] args) 
	{
		String a = "Solverines Technologies Limited";
		String b = a.toUpperCase();
		char [] c = b.toCharArray();
		for (int i = 0;i<c.length;i++)
		{
			if ((c[i]>='A')||(c[i]<='Z'))
			{
				char ch = c[i];
				c[i] = ch;
			}
			else
			{
				c[i] = c[i];
			}
			System.out.print(c[i]);
		}
	}
}
