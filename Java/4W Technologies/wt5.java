import java.util.*;
class wt5
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a sentance");
		String a = s.nextLine();
		char [] b = a.toCharArray();
		int count = 0;
		for (int i = 0;i<b.length;i++)
		{
			count = 0;
			for (int j = i+1;j<b.length;j++)
			{
				if ((b[i]==b[j])&&(b[i]!='0'))
				{
					b[j] = '0';
					count++;
				}
			}
			if ((b[i]!='0')&&(count==0))
			{
				System.out.print(b[i]+" ");
			}
		}
	}
}
