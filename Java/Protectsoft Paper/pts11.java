import java.util.*;
class pts11 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a word");
		String a = s.nextLine();
		int key = 1;
		int n = 0;
		char [] b = a.toCharArray();
		for (int i = 0;i<b.length;i++)
		{
			for (int j = i+1;j<b.length;j++)
			{
				if (b[i]==b[j])
				{
					n++;
					if (n==key)
					{
						System.out.println(b[j]);
					}
				}
			}
		}
	}
}
