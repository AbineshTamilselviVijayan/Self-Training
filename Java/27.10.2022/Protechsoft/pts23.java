import java.util.*;
class pts23
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a text");
		String a = "knetwork";//s.nextLine();
		String [] b = a.split("");
		int count = 0;
		int temp = 0;
		for (int i = 0;i<=count;i++)
		{
			temp = 0;
			for (int j = i+1;j<b.length;j++)
			{
				if ((b[i]).equals(b[j]))
				{
					count++;
					temp++;
				}
			}
			if (temp==0)
			{
				System.out.println(b[i]);
			}
		}
	}
}
