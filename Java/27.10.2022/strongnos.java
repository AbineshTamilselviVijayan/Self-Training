import java.util.*;
class strongnos
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int a = s.nextInt();
		for (int b = 1;b<=a;b++)
		{
			int sum = 0;
			int c = b;
			int temp = 0;
			while (c>0)
			{
				temp = c%10;
				sum+=fact(temp);
				c=c/10;
			}
			if (sum==b)
			{
				System.out.println("Strong numbers are : "+b);
			}
		}
	}
	public static int fact(int x)
	{
		int m = x;
		int g = 1;
		for (int i = m;i>0;i--)
		{
			g*=i;
		}
		return g;
	}
}
