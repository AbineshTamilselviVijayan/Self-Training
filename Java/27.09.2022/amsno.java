import java.util.*;
class amsnum
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to check for ASMNO");
		int a = s.nextInt();
		int b = a;
		int c = a;
		int sum = 0;
		int m = 1;
		int count = 0;
		int x = 0;
		while (b>0)
		{
			count++;
			b=b/10;
		}
		while (c>0)
		{
			m = 1;
			x = c%10;
			for (int i = 1;i<=count;i++)
			{
				m*=x;
			}
			c=c/10;
			sum+=m;
		}
		if (sum==a)
		{
			System.out.println("It is a amstrong number");
		}
		else
		{
			System.out.println("Not a amstrong number");
		}
	}
}
